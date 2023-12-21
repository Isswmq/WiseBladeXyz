package org.wiseblade.wisebladexyz.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Integer UID;

    @Column(unique = true)
    @NonNull
    private String username;

    @Column(unique = true)
    @NonNull
    private String email;

    @NonNull
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    private String hwid;

    private LocalDate registrationDate;

    @PrePersist
    public void prePersist() {
        if (role == null) {
            role = Role.USER;
        }

        if(registrationDate == null){
            registrationDate = LocalDate.now();
        }
    }
}
