package com.itheima;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class App {

    public static void main(String[] args) throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml.bak");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();


        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        Account account = accountDao.findById(2);
        System.out.println(account);

        sqlSession.commit();
        sqlSession.close();
    }
}
