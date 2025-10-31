package com.deliverytech.delivery_api.repository;
import com.deliverytech.delivery_api.entity.Loja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Long> {
    
}
