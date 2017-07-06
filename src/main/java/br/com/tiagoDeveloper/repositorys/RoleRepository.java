package br.com.tiagoDeveloper.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiagoDeveloper.models.Role;



public interface RoleRepository extends JpaRepository<Role, Long> {

}
