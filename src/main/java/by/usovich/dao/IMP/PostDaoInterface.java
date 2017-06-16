package by.usovich.dao.IMP;

import by.usovich.dto.PostJson;
import by.usovich.entity.PostEntity;
import by.usovich.entity.PostEntityForTest;

/**
 * Created by yanus on 15.05.2017.
 */
public interface PostDaoInterface {

    public PostEntity getPostAtTitel(String nameGameTable);
}
