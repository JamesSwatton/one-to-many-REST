package com.codeclan.example.OneToManyREST.repositories;

import com.codeclan.example.OneToManyREST.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
