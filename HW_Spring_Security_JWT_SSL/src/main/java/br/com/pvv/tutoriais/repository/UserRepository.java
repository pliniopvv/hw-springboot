package br.com.pvv.tutoriais.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.pvv.tutoriais.model.User;

public interface UserRepository extends CrudRepository<User, String> {

	Optional<User> findByUsername(String username);

}
