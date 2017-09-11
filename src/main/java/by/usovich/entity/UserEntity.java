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



    //ToDo Error in BD
    @OneToOne(cascade = CascadeType.ALL) // устанавливаем связь с классом/таблицец UserEntity
    @JoinColumn(name="fk_games_id")
    private GamesEntity games;
    //    @OneToOne

    @OneToOne(mappedBy = "user")
    private MessageEntity messageEntity;




    public UserEntity( ) {
    }

    @Id
    @Column(name = "user_id",updatable = true,insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int _id;

    @Column(name = "user_nick")
    private String _login;

    @Column(name = "user_email")
    private String _email;

    @Column(name = "user_password")
    private String _password;


    @Column(name = "user_country")
    private String _country;

    @Column(name = "fk_games_id",insertable = false,updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int fk_games_id;

    public int getFk_games_id() {
        return fk_games_id;
    }

    public void setFk_games_id(int fk_games_id) {
        this.fk_games_id = fk_games_id;
    }

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

    public String get_country() {
        return _country;
    }

    public void set_country(String _country) {
        this._country = _country;
    }


    public GamesEntity get_games() {
        return games;
    }

    public void set_games(GamesEntity games) {
        this.games = games;
    }
}