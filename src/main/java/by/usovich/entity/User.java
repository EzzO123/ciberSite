package by.usovich.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yanus on 10.05.2017.
 */

@Entity
@Table(name = "users")
public class User implements Serializable {

    public User() {
    }


    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", length = 64)
    private String email;

    @Column(name = "nickname", length = 64, unique = true)
    private String nickname;

    @Column(name = "password", length = 64)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}