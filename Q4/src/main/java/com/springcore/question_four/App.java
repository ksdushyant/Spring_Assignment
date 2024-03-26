package com.springcore.question_four;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {     
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TriangleConfig.class);
        Triangle triangle = (Triangle) context.getBean(Triangle.class);
        triangle.setBase(15);
        triangle.setHeight(12);
        triangle.getArea(15,12);
        triangle.draw();
        context.close();
    }
}
