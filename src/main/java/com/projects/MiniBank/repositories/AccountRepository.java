package com.projects.MiniBank.repositories;

import com.projects.MiniBank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByCustomerId(Long customerId);
}
