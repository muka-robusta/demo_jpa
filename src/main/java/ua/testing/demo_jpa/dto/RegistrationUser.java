package ua.testing.demo_jpa.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RegistrationUser {
    private String email;
    private String password;
    private String firstName;
    private String secondName;
}
