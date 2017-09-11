package by.usovich.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yanus on 9/6/2017.
 */

@Entity
@Table(name = "commonchat")
public class CommonChatEnity implements Serializable {

    @Id
    @Column(name = "cChat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;

    @OneToOne(cascade = CascadeType.ALL) // устанавливаем связь с классом/таблицец UserEntity
    @JoinColumn(name="fk_message_id")
    private MessageEntity messageEntity;

    @Column(name = "fk_message_id",insertable = false,updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int fk_message_id;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public MessageEntity getMessageEntity() {
        return messageEntity;
    }

    public void setMessageEntity(MessageEntity messageEntity) {
        this.messageEntity = messageEntity;
    }

    public int getFk_message_id() {
        return fk_message_id;
    }

    public void setFk_message_id(int fk_message_id) {
        this.fk_message_id = fk_message_id;
    }
}
