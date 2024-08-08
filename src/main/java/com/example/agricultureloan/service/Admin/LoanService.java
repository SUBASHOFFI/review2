package com.example.agricultureloan.service.Admin;

import com.example.agricultureloan.model.Admin.LoanModel;
import com.example.agricultureloan.repository.Admin.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    public List<LoanModel> getAllLoans() {
        return loanRepository.findAll();
    }

    public Optional<LoanModel> getLoanById(Long id) {
        return loanRepository.findById(id);
    }

    public LoanModel saveOrUpdateLoan(LoanModel loan) {
        return loanRepository.save(loan);
    }

    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }
}
