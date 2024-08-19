package com.appicenter.lectures.HelloWorld;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User getUserById(Integer userId);

    User getUserByEmail(String email);
}