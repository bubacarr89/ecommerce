package com.marjlow.ecommerce.dto;

import com.marjlow.ecommerce.models.Discount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends CrudRepository<Discount, Long> {
}
