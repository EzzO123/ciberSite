package by.usovich.dao.IMP;

import by.usovich.entity.PostEntity;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import javax.management.Query;
import java.util.*;

/**
 * Created by yanus on 15.05.2017.
 */
@Repository("postDaoImp")
@Transactional
public class PostDao implements PostDaoInterface {

    @Resource(name = "sessionFactory")
    public SessionFactory sessionFactory;

    public List getPostAtTitel(String titel) {


        System.out.println("DAO(titel : " + titel + ")");
        String postHQL = "FROM PostEntity WHERE post_titel=:titel";

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
