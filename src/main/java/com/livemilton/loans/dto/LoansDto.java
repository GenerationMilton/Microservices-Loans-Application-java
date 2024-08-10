package com.livemilton.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
@Schema(
    name="Loans",description = "Schema to loans for people"
)
public class LoansDto {

    @Schema(
            description = "Mobile number of the customer", example = "3003778753"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @NotEmpty(message = "Loan Number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Loan Number must be 10 digits")
    @Schema(
            description = "Loan Number of client", example = "4560606060"
    )
    private String loanNumber;

    @NotEmpty(message = "LoanType can not be a null or empty")
    @Schema(
            description = "Loan type of client",
            example = "free investment credit"
    )
    private String loanType;

    @Positive(message = "total Loan amount should be greater than zero")
    @Schema(
            description = "total Loan of a client",
            example = "$100000"
    )
    private int totalLoan;

    @Positive(message = "total Loan amount paid should be greater than zero")
    @Schema(
            description = "amount paid of a client",
            example = "$1000"
    )
    private int amountPaid;

    @Positive(message = "total outstanding amount should be equal or greater than zero")
    @Schema(
            description = "outstanding Amount to pay",
            example = "$1000"
    )
    private int outstandingAmount;
}
