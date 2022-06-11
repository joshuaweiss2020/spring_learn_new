package com.joshua.spring.test;

import com.joshua.spring.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public  void testStudent(){
        Student stu = new Student();
        System.out.println(stu);
    }
    @Test
    public void testStudentSpring(){
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student) ac.getBean("stu");
        System.out.println(stu);

    }
}
