package com.fontan.car.domain;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface UserAppRepository extends CrudRepository<UserApp, Long> {
	Optional<UserApp> findByUsername(String username);
}