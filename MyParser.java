package com.ge.exercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParserException;
import org.codehaus.jackson.JsonMappingException;
public class MyParser implements Parser {

	@Override
	public Application parseApplicationData(String data) {
		// TODO Auto-generated method stub
		Application application =null;
		
		/**
		*Reading json data Converted into java
		*/
		
		ObjectMapper mapper=new ObjectMapper();
		try {
			application=mapper.readValue(data);
		}
		catch(JsonParseException e) {
			e.printStackTrace();
		}
		catch(JsonMappingException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return application;
	}
	
}
