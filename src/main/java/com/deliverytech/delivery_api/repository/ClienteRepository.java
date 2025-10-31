package com.deliverytech.delivery_api.repository;

import org.springframework.stereotype.Repository;
import com.deliverytech.delivery_api.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
