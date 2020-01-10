package com.marjlow.ecommerce.dto;

import com.marjlow.ecommerce.models.Product;
import com.marjlow.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * from Product where Name = :Name", nativeQuery = true)
    Product findByName(String Name);
    @Query(value = "SELECT * from Product where Name = :Name AND Price = :Price", nativeQuery = true)
    Product findByNameAndPrice(String Name, double Price);
}
