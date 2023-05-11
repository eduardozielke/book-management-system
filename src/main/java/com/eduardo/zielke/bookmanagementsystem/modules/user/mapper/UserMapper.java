package com.eduardo.zielke.bookmanagementsystem.modules.user.mapper;

import com.eduardo.zielke.bookmanagementsystem.modules.user.dto.UserDTO;
import com.eduardo.zielke.bookmanagementsystem.modules.user.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDTO toDTO(UserEntity userEntity);

    List<UserDTO> toDTO(List<UserEntity> userEntity);

    UserEntity toEntity(UserDTO userDTO);

    List<UserEntity> toEntity(List<UserDTO> userDTO);

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
}