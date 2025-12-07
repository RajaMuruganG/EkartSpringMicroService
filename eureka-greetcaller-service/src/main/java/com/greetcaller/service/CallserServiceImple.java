package com.greetcaller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallserServiceImple implements ICallerService {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public String printUserDetails(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String welcomeUserDetails(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showBooks(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
