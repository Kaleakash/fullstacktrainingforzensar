package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Paytm;

public interface PaytmDao extends JpaRepository<Paytm, String>{

}
