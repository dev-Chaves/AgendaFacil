package com.agendarai.Agenda.Facil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.usertype.UserType;

@Entity
@Table(name="tb_user")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserModel {
    private static long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false)
    private String user_name;

    @Column(nullable = false, unique = true)
    private String user_email;

    @Column(nullable = false)
    private char password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserType user_type;

}
