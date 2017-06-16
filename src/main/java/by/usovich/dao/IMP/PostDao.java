package by.usovich.dao.IMP;

import by.usovich.entity.PostEntity;
import by.usovich.entity.PostEntityForTest;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import javax.management.Query;

/**
 * Created by yanus on 15.05.2017.
 */
@Repository("postDaoImp")
@Transactional
public class PostDao implements PostDaoInterface {

//    private final Logger LOGGER = Logger.getLogger(getClass());

//    PostEntityForTest postEntityForTest_1 = new PostEntityForTest(0,"tableDOTA","tableDOTA","tableDOTA");
//    PostEntityForTest postEntityForTest_2 = new PostEntityForTest(0,"tableCS","tableCS","tableCS");
//    PostEntityForTest postEntityForTest_3 = new PostEntityForTest(0,"tablePARAGON","tablePARAGON","tablePARAGON");
//    PostEntityForTest postEntityForTest_4 = new PostEntityForTest(0,"tableWOT","tableWOT","tableWOT");

  //  @Resource(name = "sessionFactory")
//  @Autowired
//  private MessageSource messageSource;

    public SessionFactory sessionFactory;

//    public PostEntityForTest getPostAtNameGame(String nameGameTable) {
//
//        switch (nameGameTable){
//            case "tableDOTA":return postEntityForTest_1;
//            case "tableCS":return postEntityForTest_2;
//            case "tablePARAGON":return postEntityForTest_3;
//            case "tableWOT":return postEntityForTest_4;
//        }
//
//        return null;
//    }

    public PostEntity getPostAtTitel(String titel){

        System.out.println("3) : DAO");
        System.out.println("3) : DAO(titel : " + titel + ")");
        String postHQL = "FROM PostEntity WHERE post_titel=:titel";

        //titel = "tableDOTA";
        PostEntity postEntity = null;
        org.hibernate.query.Query query = null;


        try {
            query = sessionFactory.getCurrentSession().createQuery(postHQL);
            query.setParameter("titel", titel);
            postEntity = (PostEntity)query.uniqueResult();

        }catch (Exception e){
            System.out.println("Exception : " + e);
        }



//        System.out.println("Debug(DTO) : " + query.uniqueResult() + "\n" +
//         (PostEntity)query.uniqueResult());

        System.out.println("3) : DAO(return)");
        return postEntity;

    }
}
