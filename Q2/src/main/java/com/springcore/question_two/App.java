package com.springcore.question_two;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Question 2");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/question_two/q2config.xml");
        q2 obj1 = (q2) context.getBean("q2");
        System.out.println(obj1);
    }
}