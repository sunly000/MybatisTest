//import com.sly.mybatis.mapper.UserMapper;
////import com.sly.mybatis.pojo.QueryVo;
//import com.sly.mybatis.pojo.User;
//import com.sly.mybatis.util.SqlSessionFactoryUtils;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.After;
//import org.junit.Before;
//
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//
///**
// * @author It扫地僧
// * @create 2020-07-11
// */
//public class Test {
//    SqlSession sqlSession;
//    UserMapper userMapper;
//    @Before
//    public void befoe(){
//         sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession(true);
//         userMapper = sqlSession.getMapper(UserMapper.class);
//    }
//    @org.junit.Test
//    public void testInsertUser() {
//        User user = new User("张三丰1","男",new Date(),"武当山");
//        userMapper.insertUser(user);
//        System.out.println(user);
//    }
////    @org.junit.Test
////    public void testUpdatetUser() {
////        User user = new User();
////        user.setId(4);
////        user.setUsername("张三丰");
////        user.setAddress("武当山");
////        userMapper.updateUser(user);
//////        System.out.println(user);
////    }
////    @org.junit.Test
////    public void testDeleteUser(){
////        userMapper.deleteUser(5);
////    }
////    @org.junit.Test
////    public void testGetUserCount(){
////        Integer userCount = userMapper.getUserCount();
////        System.out.printf("user表中有%d条数据\n",userCount);
////    }
////    @org.junit.Test
////    public void testGetUserById(){
////        User user = userMapper.getUserById(6);
////        System.out.println(user);
////    }
////    @org.junit.Test
////    public void testGetUserByUserName(){
////        List<User> users = userMapper.getUserByUserName("张");
////        users.forEach(System.out::println);
////    }
////    @org.junit.Test
////    public void testGetUserByPojo(){
////        User user = new User();
////        user.setUsername("张");
////        user.setGender("0");
////        List<User> users = userMapper.getUserByPojo(user);
////        users.forEach(System.out::println);
////    }
//////    @org.junit.Test
//////    public void testGetUserByIds(){
//////        QueryVo queryVo = new QueryVo();
//////        queryVo.setIds(Arrays.asList(7,8,9));
//////        List<User> list = userMapper.getUserByIds(queryVo);
//////        list.forEach(System.out::println);
//////    }
//    @After
//    public void after(){
//        sqlSession.close();
//    }
//}
