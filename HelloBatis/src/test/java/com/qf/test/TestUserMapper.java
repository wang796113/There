package com.qf.test;

import com.qf.entity.Order;
import com.qf.entity.user;
import com.qf.mapper.OrderMapper;
import com.qf.mapper.userMapper;
import com.qf.util.MyUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestUserMapper {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init()throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void TestFindAll() throws Exception{

        SqlSession sqlSession = sqlSessionFactory.openSession();
        userMapper userMapper = sqlSession.getMapper(userMapper.class);
        List<user> list = userMapper.findAll();
        if(list!=null){
            for (user user : list) {
                System.out.println(user);
            }
        }
    }
    @Test
    public void TestInsert() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        userMapper userMapper = sqlSession.getMapper(userMapper.class);
        user user = new user();
        user.setUsername("王二");
        user.setPassword("1234");
        user.setAge(18);
        int insert = userMapper.insert(user);
        sqlSession.commit();
        System.out.println(user);
    }

    @Test
    public void TestDelete() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        userMapper userMapper = sqlSession.getMapper(userMapper.class);
        int delete = userMapper.delete(6);
        System.out.println(delete);
        sqlSession.commit();
    }
    @Test
    public void findAllByNameLike(){
        userMapper mapper = MyUtils.getMapper(userMapper.class);
        List<user> users = mapper.findAllByNameLike("四");
        for (user user : users) {
            System.out.println(user);
        }
    }
}
