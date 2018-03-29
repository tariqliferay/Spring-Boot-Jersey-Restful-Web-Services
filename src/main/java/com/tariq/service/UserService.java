/**
 * 
 */
package com.tariq.service;

import org.springframework.stereotype.Service;
import com.tariq.model.User;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tariqul
 *
 */
@Service
public class UserService {
	private Map<String, User> users;

	@PostConstruct
	private void loadUser() {
		users = new HashMap<>();
		users.put("1", new User("Tariq", 18));
		users.put("2", new User("Anseri", 29));
	}

	public User findById(String id) {
		return users.get(id);
	}
}