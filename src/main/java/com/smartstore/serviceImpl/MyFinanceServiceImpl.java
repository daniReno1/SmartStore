package com.smartstore.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.eselling.domain.MyFinance;
import edu.mum.eselling.repository.MyFinanceRepository;
import edu.mum.eselling.service.MyFinanceService;


@Service
@Transactional
public class MyFinanceServiceImpl implements MyFinanceService {
	
	@Autowired
	MyFinanceRepository myFinanceRepository;

public List<MyFinance> getAll(){
		
		return (List<MyFinance>)myFinanceRepository.findAll();
	}

}