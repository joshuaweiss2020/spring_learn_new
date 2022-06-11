package com.joshua.spring.test;

import com.joshua.spring3.School;
import com.joshua.spring3.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {

    @Test
    public void testStudentSpring(){
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        School school = (School) ac.getBean("school");

        System.out.println(school);

        Student stu = (Student) ac.getBean("stu");

        System.out.println(stu);

        Student stuSeq = (Student) ac.getBean("stuSeq");

        System.out.println(stuSeq);


    }
}
