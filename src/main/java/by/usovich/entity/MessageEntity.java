package by.usovich.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yanus on 9/6/2017.
 */
@Entity
@Table(name = "message")
public class MessageEntity implements Serializable {


    @ManyToOne()
    private CommonChatEnity userEntity;

    @OneToOne(cascade = CascadeType.ALL) // устанавливаем связь с классом/таблицец UserEntity
    @JoinColumn(name="fk_user_id")
    private UserEntity user;

    @Id
    @Column(name = "message_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;

    @Column(name = "message_avatar")
    private String _avatar;

    @Column(name = "message_time")
    private String _time;

    @Column(name = "message_content")
    private String _content;

    public CommonChatEnity getUserEntity() {
        return userEntity;
    }

    @Column(name = "fk_user_id",insertable = false,updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int fk_user_id;

    public void setUserEntity(CommonChatEnity userEntity) {
        this.userEntity = userEntity;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_avatar() {
        return _avatar;
    }

    public void set_avatar(String _avatar) {
        this._avatar = _avatar;
    }

    public String get_time() {
        return _time;
    }

    public void set_time(String _time) {
        this._time = _time;
    }

    public String get_content() {
        return _content;
    }

    public void set_content(String _content) {
        this._content = _content;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public int getFk_user_id() {
        return fk_user_id;
    }

    public void setFk_user_id(int fk_user_id) {
        this.fk_user_id = fk_user_id;
    }
}
