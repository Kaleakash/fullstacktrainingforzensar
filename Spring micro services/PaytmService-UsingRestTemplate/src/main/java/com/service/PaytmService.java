package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.Paytm;
import com.dao.PaytmDao;

@Service
public class PaytmService {

	@Autowired
	PaytmDao paytmDao;
	
	@Autowired
	RestTemplate restTemplate;
	
	public String getBalanceThroughPaytm(String email) {
			Optional<Paytm> op = paytmDao.findById(email);
			if(op.isPresent()) {
				Paytm pp = op.get();
				int accno = pp.getAccno();
				//String result = restTemplate.getForObject("http://localhost:9393/account/balance/"+accno, String.class);	// physical name of that service 
				String result = restTemplate.getForObject("http://ACCOUNT-SERVICE/account/balance/"+accno, String.class);	//locial name of that service 
				return result;
			}else {
				return "Email Id is wrong";
			}
	}
}
