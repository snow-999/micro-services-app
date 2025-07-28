package com.khaledmicroservices.product_service.productReposetorty;

import com.khaledmicroservices.product_service.productEntity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductReposetorty extends CrudRepository<ProductEntity, Long> {
}
