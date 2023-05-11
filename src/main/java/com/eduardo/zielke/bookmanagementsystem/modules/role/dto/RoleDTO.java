package com.eduardo.zielke.bookmanagementsystem.modules.role.dto;

import java.time.LocalDateTime;

public class RoleDTO {

    Long id = null;
    private String name;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
}
