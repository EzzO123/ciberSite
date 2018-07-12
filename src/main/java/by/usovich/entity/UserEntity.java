package by.usovich.entity;

import org.hibernate.mapping.Set;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yanus on 7/11/2017.
 */
@Entity
@Table(name = "user")
public class UserEntity implements Serializable {

    public UserEntity( ) {
    }

    @Id
    @Column(name = "user_id",updatable = true,insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int _id;

    @Column(name = "user_nick")
    private String _login;

    @Column(name = "user_name")
    private String _name;

    @Column(name = "user_email")
    private String _email;

    @Column(name = "user_password")
    private String _password;

    @Column(name = "user_role")
    private String _role;

    // @OneToOne(cascade = CascadeType.ALL,targetEntity = GamesEntity.class)

    //@OneToOne(cascade = CascadeType.ALL,mappedBy = "user") // устанавливаем связь с классом/таблицец UserEntity







    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_login() {
        return _login;
    }

    public void set_login(String _login) {
        this._login = _login;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_role() {
        return _role;
    }

    public void set_role(String _role) {
        this._role = _role;
    }
}