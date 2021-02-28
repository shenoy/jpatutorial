package com.jpa.jpatutorial.Service;
import com.jpa.jpatutorial.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long >  {



}
