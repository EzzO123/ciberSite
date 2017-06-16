package by.usovich.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yanus on 15.05.2017.
 */

@Entity
@Table(name = "post")
public class PostEntity implements Serializable {


    @Id
    @Column(name = "post_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int _id;

    @Column(name = "post_titel")
    private String _titel;

    @Column(name = "post_content")
    private String _content;

    @Column(name = "post_date")
    private String _date;

    @Column(name = "post_image")
    private String _image;


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_titel() {
        return _titel;
    }

    public void set_titel(String _titel) {
        this._titel = _titel;
    }

    public String get_content() {
        return _content;
    }

    public void set_content(String _content) {
        this._content = _content;
    }

    public String get_date() {
        return _date;
    }

    public void set_date(String _date) {
        this._date = _date;
    }

    public String get_image() {
        return _image;
    }

    public void set_image(String _image) {
        this._image = _image;
    }
}
