package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Account;
import com.dao.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public String getBalance(int accno) {
		if(accountRepository.existsById(accno)) {
			Account acc = accountRepository.getOne(accno);
			return "Your Balance is "+acc.getAmount();
		}else {
			return "Account not present";
		}
	}
	
}
