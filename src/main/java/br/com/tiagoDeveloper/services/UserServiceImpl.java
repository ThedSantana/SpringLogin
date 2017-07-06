package br.com.tiagoDeveloper.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.tiagoDeveloper.models.Role;
import br.com.tiagoDeveloper.models.User;
import br.com.tiagoDeveloper.repositorys.RoleRepository;
import br.com.tiagoDeveloper.repositorys.UserRepository;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public void save(User user) {
		
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		Set<Role> role = new HashSet<>();
		role.add(roleRepository.findOne(user.getPerfil()));
		user.setRoles(role);
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	

}
