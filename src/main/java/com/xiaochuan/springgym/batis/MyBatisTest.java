package com.xiaochuan.springgym.batis;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory =  builder.build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        // sqlSession.select();

        System.out.println("env id is: " + sqlSession.getConfiguration().getEnvironment().getId());

        sqlSession.close();
    }
}
