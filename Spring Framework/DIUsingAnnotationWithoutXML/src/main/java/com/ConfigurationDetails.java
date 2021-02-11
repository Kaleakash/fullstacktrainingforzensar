package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pack.Orders;

@Configuration						//xml file 
@ComponentScan(basePackages = {"com","bean"}) //context component scan=com <context:component-scan base-package="com"></context:component-scan>
public class ConfigurationDetails {

	@Bean(value = "orderId")				// user created object explicitly 
	public Orders getOrders() {			// object we created but maintain by container 
		return new Orders();
	}
}
