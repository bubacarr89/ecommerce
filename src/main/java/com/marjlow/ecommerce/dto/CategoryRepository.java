package com.marjlow.ecommerce.dto;

import com.marjlow.ecommerce.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
