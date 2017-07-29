package by.usovich.dao.IMP;

import by.usovich.dao.UserDaoInterface;
import by.usovich.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yanus on 7/14/2017.
 */
@Repository("userDaoImp")
@Transactional
public class UserDaoImplement implements UserDaoInterface {

    @Resource(name = "sessionFactory")
    public SessionFactory sessionFactory;

    public boolean isLoginExists(String login){

        String HQL = "FROM UserEntity WHERE user_nick=:login";
        String paramInHQL ="login";

        List postEntity = null;
        try {
            postEntity = getListAtHQL(HQL,login,paramInHQL,sessionFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(postEntity == null){
            return false;
        }
        return postEntity.size() > 0;

    }


    public boolean isEmailExists(String email){

        String postHQL = "FROM UserEntity WHERE user_email=:email";
        String paramInHQL ="email";

        List postEntity = null;
        try {
            postEntity = getListAtHQL(postHQL,email,paramInHQL,sessionFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(postEntity == null){
            return false;
        }
        return postEntity.size() > 0;

    }


    public boolean isPassword(String password){

        String postHQL = "FROM UserEntity WHERE user_password=:password";
        String paramInHQL ="password";

        List postEntity = null;

        try {
            postEntity = getListAtHQL(postHQL,password,paramInHQL,sessionFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(postEntity == null){
            return false;
        }
        return postEntity.size() > 0;

    }

    @Override
    public void createUser(UserEntity profile) {

    }

    @Override
    public void deleteUser(UserEntity profile) {

    }


    public List getUserEntityByLogin() {
        return null;
    }

    private List getListAtHQL(String HQL, String required, String paramInHQL, SessionFactory sessionFactory) throws Exception{//Топовое блбла но как назвать не знаю//ToDo

            Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery(HQL);
            query.setParameter(paramInHQL, required);
            return query.getResultList();

    }
}
