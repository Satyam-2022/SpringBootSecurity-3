package com.example.springDemo2.reposiritry;

import com.example.springDemo2.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyUserRepository extends JpaRepository<MyUser,Long> {

    Optional<MyUser>findByUsername(String username);


}
