package com.zemoso.aop;

import com.zemoso.aop.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterThrowingDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        // call method to find the accounts
        List<Account> theAccounts = null;

        try{

            boolean tripWire = true;
            theAccountDAO.findAccounts(tripWire);
        }
        catch(Exception exc) {
            System.out.println("\n\nMain Program ... caught exception: " + exc);
        }


        // display the accounts
        System.out.println("\n\nMain Program: AfterReturningDemoApp");
        System.out.println("----");

        System.out.println(theAccounts);

        System.out.println("\n");

        // close the context
        context.close();
    }

}
