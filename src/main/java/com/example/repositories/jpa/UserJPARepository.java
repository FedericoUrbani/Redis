package com.example.repositories.jpa;

import com.example.entities.UserJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJPARepository extends JpaRepository<UserJPA, Long> {
}
