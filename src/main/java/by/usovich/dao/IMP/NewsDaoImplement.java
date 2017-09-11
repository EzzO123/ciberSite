package by.usovich.dao.IMP;

import by.usovich.dao.NewsDaoInterface;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by yanus on 15.05.2017.
 */
@Repository("newsDaoImp")
@Transactional
public class NewsDaoImplement implements NewsDaoInterface {

    @Resource(name = "sessionFactory")
    public SessionFactory sessionFactory;

    public List getNewsAtTitel(String titel) {


        System.out.println("DAO(titel : " + titel + ")");
        String postHQL = "FROM NewsEntity WHERE news_titel=:titel";

        //titel = "tableDOTA";
        List postEntity = null;
        org.hibernate.query.Query query = null;
        Session session = null;


        try {
            session = sessionFactory.getCurrentSession();
            query = session.createQuery(postHQL);
            query.setParameter("titel", titel);
            postEntity = query.getResultList();

        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        return postEntity;
    }


}
