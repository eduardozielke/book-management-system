package com.eduardo.zielke.bookmanagementsystem.modules.user.service;

import com.eduardo.zielke.bookmanagementsystem.modules.user.dto.UserDTO;
import com.eduardo.zielke.bookmanagementsystem.modules.user.entity.UserEntity;
import com.eduardo.zielke.bookmanagementsystem.modules.user.mapper.UserMapper;
import com.eduardo.zielke.bookmanagementsystem.modules.user.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;

    public UserDTO save(UserDTO userDto) {
        final UserEntity userEntity = UserMapper.INSTANCE.toEntity(userDto);
        final UserEntity savedUserEntity = repository.save(userEntity);
        return UserMapper.INSTANCE.toDTO(savedUserEntity);
    }

    public List<UserDTO> findAll() {
        final List<UserEntity> allUsers = repository.findAll();
        return UserMapper.INSTANCE.toDTO(allUsers);
    }

    public UserDTO findById(Long userId) {
        final UserEntity userEntity = repository.findById(userId).orElseThrow(EntityNotFoundException::new);
        return UserMapper.INSTANCE.toDTO(userEntity);
    }

    public void delete(Long userId) {
        if(!repository.existsById(userId))
            throw new EntityNotFoundException(String.format("User with id %d not found", userId));

        repository.deleteById(userId);
    }
}
