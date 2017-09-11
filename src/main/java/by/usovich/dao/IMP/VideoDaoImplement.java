package by.usovich.dao.IMP;

import by.usovich.dao.VideoDaoInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yanus on 8/19/2017.
 */
@Repository("videoDaoImp")
@Transactional
public class VideoDaoImplement implements VideoDaoInterface{

    @Resource(name = "sessionFactory")
    public SessionFactory sessionFactory;

    public List getVideoAtTitel(String titel) {


        System.out.println(" Video DAO(titel : " + titel + ")");
        String postHQL = "FROM VideoEntity WHERE video_titel=:titel";

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