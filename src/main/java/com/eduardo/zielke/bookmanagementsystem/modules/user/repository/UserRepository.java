package com.eduardo.zielke.bookmanagementsystem.modules.user.repository;

import com.eduardo.zielke.bookmanagementsystem.modules.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
