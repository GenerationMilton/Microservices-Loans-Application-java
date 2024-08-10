package com.livemilton.loans.repository;


import com.livemilton.loans.entity.Loans;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.Pattern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;

public interface LoansRepository extends JpaRepository<Loans, Long> {

    Optional<Loans> findByLoanNumber(String loanNumber);

    @Transactional
    @Modifying
    void deleteByLoanId(Long LoanId);

    Optional<Loans> findByMobileNumber(String mobileNumber);
}
