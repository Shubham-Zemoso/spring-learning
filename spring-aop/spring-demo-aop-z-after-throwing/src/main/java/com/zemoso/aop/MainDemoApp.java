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

        // get membership bean from spring container
        MembershipDAO theMembershipDAO =
                context.getBean("membershipDAO", MembershipDAO.class);

        // call the business method
        Account myAccount = new Account();
        myAccount.setName("Shubham");
        myAccount.setLevel("Platinum");
        theAccountDAO.addAccount(myAccount, true);
        theAccountDAO.doWork();

        // call the accountdao getter/setter methods
        theAccountDAO.setName("foobar");
        theAccountDAO.setServiceCode("silver");

        String name = theAccountDAO.getName();
        String code = theAccountDAO.getServiceCode();

        // call the membership business method
        theMembershipDAO.addSillyMember();
        theMembershipDAO.goToSleep();

        // close the context
        context.close();
    }


}

