package com.eduardo.zielke.bookmanagementsystem.modules.user.controller;

import com.eduardo.zielke.bookmanagementsystem.modules.user.dto.UserDTO;
import com.eduardo.zielke.bookmanagementsystem.modules.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

   private final UserService service;

   @PostMapping
   ResponseEntity<UserDTO> save(@RequestBody @Valid UserDTO userDto) {
      final UserDTO saved = service.save(userDto);
      return new ResponseEntity<>(saved, HttpStatus.CREATED);
   }

   @GetMapping
   ResponseEntity<List<UserDTO>> findAll() {
      final List<UserDTO> users = service.findAll();
      return new ResponseEntity<>(users, HttpStatus.OK);
   }

   @GetMapping("/{userId}")
   ResponseEntity<UserDTO> getById(@PathVariable("userId") Long userId) {
      final UserDTO userDTO = service.findById(userId);
      return new ResponseEntity<>(userDTO, HttpStatus.OK);
   }

   @DeleteMapping("/{userId}")
   ResponseEntity<Void> delete(@PathVariable("userId") Long userId) {
      service.delete(userId);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
   }

}
