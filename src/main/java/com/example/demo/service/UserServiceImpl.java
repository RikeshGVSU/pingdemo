package com.example.demo.service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.util.CsvConverter;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getUsers() {
		RestTemplate template = new RestTemplate();
		String url = "https://api.publicapis.org/entries";
		
		String apiResponse = template.getForObject(url, String.class);
		try {
			CsvConverter.JsonToCsv(apiResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return apiResponse;
	}

}
