package com.example.agricultureloan.repository.Admin;




import com.example.agricultureloan.model.Admin.LoanModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<LoanModel, Long> {
}
