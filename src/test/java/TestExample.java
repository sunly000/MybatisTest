import com.sly.mybatis.mapper.UserMapper;
import com.sly.mybatis.pojo.User;
import com.sly.mybatis.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.util.Date;
import java.util.List;

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

    @Test
    public void testSelectUserByUsername(){
        List<User> users = userMapper.getUserByUserName("张");
        users.forEach(System.out::println);
    }

    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setId(3);
        user.setUsername("灭绝师太");
        user.setGender("女");
        user.setAddress("峨眉山");
        userMapper.updateUser(user);
        System.out.println("修改成功");
        System.out.println(user);
    }

    @Test
    public void testDeleteUser(){
        userMapper.deleteUser(4);
        System.out.println("删除成功");
    }

    @Test
    public void testGetUserCount(){
        Integer userCount = userMapper.getUserCount();
        System.out.println("用户数量为"+userCount);
    }

    //通过用户名或性别查询用户
    @Test
    public void testGetUserByPojo(){
        User user = new User();
        user.setUsername("张");
        user.setGender("男");
        List<User> users = userMapper.getUserByPojo(user);
        users.forEach(System.out::println);
    }
    @After
    public void after(){
        sqlSession.close();
    }
}
