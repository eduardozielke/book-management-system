package com.eduardo.zielke.bookmanagementsystem.modules.role.service;

import com.eduardo.zielke.bookmanagementsystem.modules.role.dto.RoleDTO;
import com.eduardo.zielke.bookmanagementsystem.modules.role.entity.RoleEntity;
import com.eduardo.zielke.bookmanagementsystem.modules.role.mapper.RoleMapper;
import com.eduardo.zielke.bookmanagementsystem.modules.role.repository.RoleRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository repository;

    public RoleDTO save(RoleDTO roleDto) {
        final RoleEntity toSave = RoleMapper.INSTANCE.toEntity(roleDto);
        final RoleEntity savedRole = repository.save(toSave);
        return RoleMapper.INSTANCE.toDto(savedRole);
    }

    public List<RoleDTO> findAll() {
        final List<RoleEntity> roleList = repository.findAll();
        return RoleMapper.INSTANCE.toDto(roleList);
    }

    public void delete(Long roleId) {
        repository.deleteById(roleId);
    }
}
