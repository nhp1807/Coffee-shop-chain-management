package com.example.coffee_shop_chain_management.repository;

import com.example.coffee_shop_chain_management.entity.Material;
import com.example.coffee_shop_chain_management.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StorageRepository extends JpaRepository<Storage, Long> {
    // Truy vấn kho lưu trữ dựa trên nguyên liệu
    List<Storage> findByMaterial(Material material);
}

