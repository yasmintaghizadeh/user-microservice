package org.example.user.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Version
    private int version;
    @LastModifiedDate
    private Date lastModifiedDate;
    @CreatedDate
    private Date createdDate;
    private String  name;
    private String surname;
    private String email;
    private String password;
    private String username;
}
