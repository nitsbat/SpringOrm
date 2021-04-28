package com.spring.orm.dao;

import com.spring.orm.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDao {

    @Autowired
    private HibernateTemplate template;

    @Transactional
    public int insert(Student student) {
        Integer result = (Integer) template.save(student);
        return result;
    }

    public Student getStudent(int studentId) {
        return template.load(Student.class, studentId);
    }

    public List<Student> getData() {
        return template.loadAll(Student.class);
    }

    @Transactional
    public void delete(int studentId) {
        Student student = template.get(Student.class, studentId);
        template.delete(student);
    }

    @Transactional
    public void update(Student student) {
        template.update(student);
    }

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
}
