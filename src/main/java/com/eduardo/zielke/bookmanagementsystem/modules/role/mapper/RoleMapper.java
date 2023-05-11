package com.eduardo.zielke.bookmanagementsystem.modules.role.mapper;

import com.eduardo.zielke.bookmanagementsystem.modules.role.dto.RoleDTO;
import com.eduardo.zielke.bookmanagementsystem.modules.role.entity.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RoleMapper {

    RoleDTO toDto(RoleEntity roleEntity);

    List<RoleDTO> toDto(List<RoleEntity> roleEntity);

    RoleEntity toEntity(RoleDTO role);

    List<RoleEntity> toEntity(List<RoleDTO> role);

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);
}
