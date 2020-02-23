package com.ge.exercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;

public class ReadParseData {
	static Application application=null;
	public static void main(String[] args) {
		String JSON_DATA=null;
		String GROUP_ID=null;
		String USER_ID=null;
		StringBuffer response=new StringBuffer();
		try {
		InputStream inputsteam=new FileInputStream(new File("c\\temp\\application.json"));
		BufferedReader bReader=new BufferedReader(new InputStreamReader(inputsteam));
			
		while((JSON_DATA=bReader.readLine()) !=null) {
			response.append(JSON_DATA);
		}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}	
		MyParser myParser=new MyParser();
		application=myParser.parseApplicationData(response.toString());
		Collection<Group> listgroup=application.getGroups();
		for(Group groupdata:listgroup) {
			GROUP_ID=groupdata.getId();
			String name=groupdata.getName();
		}
		Collection<User> listUser =application.getUsers();
		for(User userdata : listUser) {
			USER_ID=userdata.getId();
			String name=userdata.getName();
		}
		User user=application.getUser(USER_ID);
		String uid= user.getId();
		String uName=user.getName();	
		Group group=application.getGroup(GROUP_ID);
		String gid=group.getId();
		String gName=group.getName();
	}
}
