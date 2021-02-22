package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.Paytm;
import com.dao.PaytmDao;
import com.feign.FeignClientInterface;

@Service
public class PaytmService {

	@Autowired
	PaytmDao paytmDao;
	
	@Autowired
	FeignClientInterface obj;
	
	public String getBalanceThroughPaytm(String email) {
			Optional<Paytm> op = paytmDao.findById(email);
			if(op.isPresent()) {
				Paytm pp = op.get();
				int accno = pp.getAccno();
				String result = obj.getAccountBalance(accno); 
				return result;
			}else {
				return "Email Id is wrong";
			}
	}
}
