package br.com.tiagoDeveloper.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiagoDeveloper.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String username);
	
}
