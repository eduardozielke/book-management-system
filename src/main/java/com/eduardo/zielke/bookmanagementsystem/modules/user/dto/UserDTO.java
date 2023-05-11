package com.eduardo.zielke.bookmanagementsystem.modules.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    public Long id;
    public String name;
    public String lastName;
    @Email(message = "Email must be valid")
    public String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public String password;
    public LocalDateTime createdAt = LocalDateTime.now();
    public LocalDateTime updatedAt = LocalDateTime.now();
}
