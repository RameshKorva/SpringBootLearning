package com.dailycode.user.repositary;

import com.dailycode.user.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositary  extends JpaRepository<Users, Long> {
    Users findByUserId(Long userId);
}
