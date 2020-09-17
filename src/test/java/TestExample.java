import com.sly.mybatis.mapper.UserMapper;
import com.sly.mybatis.pojo.User;
import com.sly.mybatis.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * @author It扫地僧
 * @create 2020-09-17
 */
public class TestExample {
    SqlSession sqlSession;
    UserMapper userMapper;
    @Before
    public void before(){
        sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession(true);
        userMapper = sqlSession.getMapper(UserMapper.class);
    }
    @Test
    public void testInsertUser(){
        User user = new User("张无忌1", "男", new Date(), "华山1");
        userMapper.insertUser(user);
    }

    @Test
    public void testSelectUserById(){
        User user = userMapper.getUserById(2);
        String info = user.toString();
        System.out.println(info);
    }
    @After
    public void after(){
        sqlSession.close();
    }
}
