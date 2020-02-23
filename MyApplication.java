package com.ge.exercise1;

import java.util.Collection;

public class MyApplication extends Application {


	public MyApplication(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<User> getUsers() {
		// TODO Auto-generated method stub
		
		return  getUsers();
	}
	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return getUser( userId) ;
	}

	@Override
	public Collection<Group> getGroups() {
		// TODO Auto-generated method stub
		return getGroups();
	}

	@Override
	public Group getGroup(String groupId) {
		// TODO Auto-generated method stub
		return getGroup( groupId);
	}

}
