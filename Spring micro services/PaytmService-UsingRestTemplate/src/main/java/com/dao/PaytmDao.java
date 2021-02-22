package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Paytm;

@Repository
public interface PaytmDao extends JpaRepository<Paytm, String>{

}
