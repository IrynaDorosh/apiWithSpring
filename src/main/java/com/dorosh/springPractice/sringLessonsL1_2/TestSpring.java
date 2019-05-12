package com.dorosh.springPractice.sringLessonsL1_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();


        TestBean testBean1 = new TestBean("Ira");
        System.out.println(testBean1.getName());

    }
}
