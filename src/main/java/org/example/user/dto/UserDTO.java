package org.example.user.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Data
public class UserDTO {
    private String  name;
    private String surname;
    private String email;
    private String username;
}
