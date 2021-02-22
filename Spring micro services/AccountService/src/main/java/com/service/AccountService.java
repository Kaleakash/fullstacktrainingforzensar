package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Account;
import com.dao.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public String getBalance(int accno) {
			Optional<Account> op = accountRepository.findById(accno);
			if(op.isPresent()) {
				Account ac = op.get();
				return "Your balance is "+ac.getAmount();
			}else {
				return "Account number is not present";
			}
		
	}
	
}
