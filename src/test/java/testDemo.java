import com.sly.mybatis.mapper.UserMapper;
import com.sly.mybatis.pojo.User;
import com.sly.mybatis.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;

public class testDemo {
    public static void main(String[] args){

        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User("张三丰", "男", new Date(), "武当山");

        mapper.insertUser(user);
        sqlSession.close();
    }
}
