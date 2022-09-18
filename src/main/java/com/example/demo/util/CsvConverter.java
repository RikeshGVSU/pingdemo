package com.example.demo.util;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class CsvConverter {
	
	public static void JsonToCsv(String content) throws IOException {
        JsonNode jsonTree = new ObjectMapper().readTree(content);
        
        
        JsonNode firstObject = jsonTree.elements().next();
        System.out.println("Hello");
        
    }

}
