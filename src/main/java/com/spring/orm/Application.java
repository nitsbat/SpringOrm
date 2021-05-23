package com.spring.orm;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        /* Insert
        int result = studentDao.insert(getStudent());
        System.out.println(result + " done");
        */

        /* Get Student Select Query
        Student student = studentDao.getStudent(3498);
        System.out.println(student);
         */

        /* Delete and select all query
        studentDao.delete(3498);
        List<Student> studentList = studentDao.getData();ll
        studentList.forEach(student -> System.out.println(student));
        */

        // Update query
        studentDao.update(getStudent());
        List<Student> studentList = studentDao.getData();
        studentList.forEach(student -> System.out.println(student));
    }

    private static Student getStudent() {
        Student student = new Student(3145, "nits", "pune", 25);
        return student;
    }
}
