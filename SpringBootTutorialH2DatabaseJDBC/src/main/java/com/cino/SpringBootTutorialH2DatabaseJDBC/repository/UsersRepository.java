package com.cino.SpringBootTutorialH2DatabaseJDBC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.cino.SpringBootTutorialH2DatabaseJDBC.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
