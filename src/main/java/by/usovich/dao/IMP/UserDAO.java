package by.usovich.dao.IMP;

import org.hibernate.SessionFactory;
import by.usovich.dao.UserDAOinterface;
import by.usovich.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by yanus on 10.05.2017.
 */
@Repository
public class UserDAO implements UserDAOinterface {

    @PersistenceContext
    protected EntityManager emf;

    @Autowired
    private MessageSource messageSource;

    @Resource(name = "sessionFactory")
    public SessionFactory sessionFactory;

    public List findAll() {

       return emf.createQuery("from Users u").getResultList();
    }

    public User getUserByNickname(String nickname){

        String userHQL = "FROM users WHERE login = :login";

       // SessionFactory sessionFactory;
        Query query = sessionFactory.getCurrentSession().createQuery(userHQL);
        query.setParameter("login", nickname);

        return (User) query.getSingleResult();
    }
}
