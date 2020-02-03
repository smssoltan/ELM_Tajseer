package com.Elm.Tajseer.Tajseer;

import com.Elm.Tajseer.Tajseer.Model.Class;
import com.Elm.Tajseer.Tajseer.Model.Student;

import java.util.List;

@org.springframework.stereotype.Service
public interface Service {

    public Student addStudent(Student student);
    List<Student> getAllStudents();
    public void deleteStudent(int id);
    public Student getStudent(int id);

    Student updateStudent(Student student, int id);


    public Class addClass(Class aClass);
    public List<Class> getAllClasses();
    public void deleteClass(int id);
    public Class getClass(int id);
    public Class updateClass(Class aClass, int id);
}
