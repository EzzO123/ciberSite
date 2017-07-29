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
    private GamesEntity games;
    //    @OneToOne
//    @JoinColumn(name = "fk_user_id", referencedColumnName = "games_id")
    @OneToOne(mappedBy = "user") // устанавливаем связь с классом/таблицец UserEntity

    public int getGames_id() {
        return games_id;
    }

    public void setGames_id(int games_id) {
        this.games_id = games_id;
    }





    public UserEntity( ) {
    }

    @Id
    @Column(name = "user_id", nullable = false, insertable = true, updatable = true)
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




    @Column(name = "fk_games_id", nullable = false, insertable = false, updatable = false)
    private int games_id;

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


    @Column(name = "fk_ad_id", nullable = false, insertable = false, updatable = false)
    public GamesEntity get_games() {
        return games;
    }

    public void set_games(GamesEntity games) {
        this.games = games;
    }
}