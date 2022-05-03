package com.zemoso.aop;

import com.zemoso.aop.dao.AccountDAO;
import com.zemoso.aop.dao.MembershipDAO;
import org.aspectj.weaver.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);


        theMembershipDAO.addSillyMember();
        // call the business method
        theAccountDAO.addAccount();


        // close the context
        context.close();
    }

}

