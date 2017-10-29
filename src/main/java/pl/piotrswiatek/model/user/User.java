package pl.piotrswiatek.model.user;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Piotrek on 2017-07-01.
 */
@Data
@Entity
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "login")
    private String login;
    @Column(name = "email")
    private String email;
    @Column(name = "user_password")
    private String password;
    @Column(name = "admin_profile")
    private Boolean admin;
}
