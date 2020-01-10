package com.marjlow.ecommerce.dto;

import com.marjlow.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT * from User where username = :username", nativeQuery = true)
    User findByUsername(String username);
    @Query(value = "SELECT * from User where username = :username AND Password = :Password", nativeQuery = true)
    User findByUsernameAndPassword(String username, String Password);
}
