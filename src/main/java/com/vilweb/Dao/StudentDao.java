package com.vilweb.Dao;

import com.vilweb.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentByID(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
