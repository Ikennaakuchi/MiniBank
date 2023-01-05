package com.projects.MiniBank.repositories;

import com.projects.MiniBank.entity.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loans, Long> {
    List<Loans> findByCustomerIdOrderByStartDtDesc(Long customerId);
}
