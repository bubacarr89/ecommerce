package com.marjlow.ecommerce.dto;

import com.marjlow.ecommerce.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
