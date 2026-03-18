package com.fitboost.fitboostapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fitboost.fitboostapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}