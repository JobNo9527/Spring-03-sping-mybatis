package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {

    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ac.getBean(AccountService.class);

        Account account = accountService.findById(1);

        System.out.println(account);


    }
}
