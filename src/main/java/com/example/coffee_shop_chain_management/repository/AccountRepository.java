package com.example.coffee_shop_chain_management.repository;

import com.example.coffee_shop_chain_management.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    // Phương thức tìm kiếm tài khoản dựa trên username
    Optional<Account> findByUsername(String username);
}

