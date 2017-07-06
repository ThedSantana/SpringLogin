package br.com.tiagoDeveloper.services;

import br.com.tiagoDeveloper.models.User;

public interface UserService {

	public void save(User user);
	public User findByUsername(String username);
}
