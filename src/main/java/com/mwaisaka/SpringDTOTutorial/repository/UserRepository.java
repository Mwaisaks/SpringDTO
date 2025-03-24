package com.mwaisaka.SpringDTOTutorial.repository;

import com.mwaisaka.SpringDTOTutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
