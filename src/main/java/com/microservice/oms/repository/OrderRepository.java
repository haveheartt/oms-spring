package com.microservice.oms.repository;

import com.microservice.oms.controller.dto.OrderResponse;
import com.microservice.oms.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
