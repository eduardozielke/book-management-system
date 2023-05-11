package com.eduardo.zielke.bookmanagementsystem.modules.role.controller;

import com.eduardo.zielke.bookmanagementsystem.modules.role.dto.RoleDTO;
import com.eduardo.zielke.bookmanagementsystem.modules.role.service.RoleService;
import com.eduardo.zielke.bookmanagementsystem.modules.user.dto.UserDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/roles")
public class RoleController {

    private final RoleService service;

    @PostMapping
    ResponseEntity<RoleDTO> save(@RequestBody @Valid RoleDTO roleDTO) {
        final RoleDTO saved = service.save(roleDTO);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping
    ResponseEntity<List<RoleDTO>> findAll() {
        final List<RoleDTO> roles = service.findAll();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    @DeleteMapping("/{roleId}")
    ResponseEntity<Void> delete(@PathVariable("roleId") Long roleId) {
        service.delete(roleId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
