package com.alsur.restportlet;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alsur.model.User;

@Path("/users")
public class UserService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> findUsers() {

		List<User> result = new ArrayList<User>();
		
		User user = new User("username", "email@mail.com", "first", "last");
		result.add(user);
		
		user = new User("username", "email@mail.com", "first", "last");
		result.add(user);
		
		user = new User("username", "email@mail.com", "first", "last");
		
		result.add(user);
		user = new User("username", "email@mail.com", "first", "last");
		result.add(user);
		

		return result;

	}
}
