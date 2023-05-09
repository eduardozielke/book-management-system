package com.eduardo.zielke.bookmanagementsystem.modules.user.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;
}
