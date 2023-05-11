package com.eduardo.zielke.bookmanagementsystem.modules.role.service;

import com.eduardo.zielke.bookmanagementsystem.modules.role.dto.RoleDTO;
import com.eduardo.zielke.bookmanagementsystem.modules.role.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleService {

    private final RoleRepository repository;

    
}
