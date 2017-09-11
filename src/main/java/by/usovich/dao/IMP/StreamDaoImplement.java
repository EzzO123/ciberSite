package by.usovich.dao.IMP;

import by.usovich.dao.StreamsDaoInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yanus on 8/19/2017.
 */
@Repository("streamDaoImp")
@Transactional
public class StreamDaoImplement implements StreamsDaoInterface {

    @Resource(name = "sessionFactory")
    public SessionFactory sessionFactory;

    public List getStreamAtTitel(String titel) {


        System.out.println(" Stream DAO(titel : " + titel + ")");
        String postHQL = "FROM StreamEntity WHERE Streams_titel=:titel";

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
