package com.projects.MiniBank.repositories;

import com.projects.MiniBank.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {

    List<AppUser> findByEmail(String email);
}
