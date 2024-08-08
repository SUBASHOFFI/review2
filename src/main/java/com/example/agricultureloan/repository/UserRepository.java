package com.example.agricultureloan.repository;



import com.example.agricultureloan.model.User;
import java.util.Optional;
// import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  
    User findByEmailAndPassword(String email, String password);
      Optional<User>findByEmail(String email);
   
}
