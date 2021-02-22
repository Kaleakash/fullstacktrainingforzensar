package com.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ACCOUNT-SERVICE")	//http://localhost:9393
public interface FeignClientInterface {

	@GetMapping(value = "account/balance/{accno}")	//path and with path variable http://localhost:9393/account/balance/1010
	public String getAccountBalance(@PathVariable("accno") int accno);
}
