package com.livemilton.loans.service;

import com.livemilton.loans.dto.LoansDto;

public interface ILoansService {

    /**
     *
     * @param loansDto - LoanDto Object
     */
    void createLoan(String mobileNumber);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Loans Details based on a given mobileNumber
     */
    LoansDto fetchLoan(String mobileNumber);

    /**
     *
     * @param loansDto - LoanDto Object
     * @return booelan indicating if the update of Loan details is successful or not
     */
    boolean updateLoan(LoansDto loansDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteLoan(String mobileNumber);
}
