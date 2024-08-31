package com.livemilton.loans.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.livemilton.loans.entity.Loans;

import jakarta.transaction.Transactional;

public interface LoansRepository extends JpaRepository<Loans, Long> {

    Optional<Loans> findByLoanNumber(String loanNumber);

    @Transactional
    @Modifying
    void deleteByLoanId(Long LoanId);

    Optional<Loans> findByMobileNumber(String mobileNumber);
}
