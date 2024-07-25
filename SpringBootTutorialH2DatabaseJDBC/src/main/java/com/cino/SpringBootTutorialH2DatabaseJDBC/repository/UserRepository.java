package com.cino.SpringBootTutorialH2DatabaseJDBC.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.cino.SpringBootTutorialH2DatabaseJDBC.model.Users;

public interface UserRepository extends ListCrudRepository<Users, Integer> {

}
