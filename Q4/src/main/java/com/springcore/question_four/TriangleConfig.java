package com.springcore.question_four;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.springcore.question_four","com.springcore.aspect"})
public class TriangleConfig {
    @Bean
    public Triangle triangle() {
    	return new Triangle();
    }
}