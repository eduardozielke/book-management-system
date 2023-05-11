package com.eduardo.zielke.bookmanagementsystem.modules.role.repository;

import com.eduardo.zielke.bookmanagementsystem.modules.role.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
