package com.marjlow.ecommerce.dto;

import com.marjlow.ecommerce.models.Items;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends CrudRepository<Items, Long> {
}
