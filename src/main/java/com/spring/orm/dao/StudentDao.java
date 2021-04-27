package com.spring.orm.dao;

import com.spring.orm.model.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.io.Serializable;

public class StudentDao {

    private HibernateTemplate template;

    public int insert(Student student) {
        Integer result = (Integer) template.save(student);
        return result;
    }

}
