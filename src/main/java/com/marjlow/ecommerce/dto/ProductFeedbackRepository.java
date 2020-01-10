package com.marjlow.ecommerce.dto;

import com.marjlow.ecommerce.models.ProductFeedback;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductFeedbackRepository extends CrudRepository<ProductFeedback, Long> {
}
