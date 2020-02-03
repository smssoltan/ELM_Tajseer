package com.Elm.Tajseer.Tajseer;
import com.Elm.Tajseer.Tajseer.Model.Class;
import com.Elm.Tajseer.Tajseer.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@org.springframework.stereotype.Service
public class Service_Implementation implements Service
{
    @Autowired
     private StudentRepo studentRepo;
    @Autowired
    private ClassRepo classRepo;


    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }

    @Override
    public Student getStudent(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student, int id) {
        student.setID(id);
        return studentRepo.save(student);
    }

    @Override
    public Class addClass(Class aClass) {
        return classRepo.save(aClass);
    }

    @Override
    public List<Class> getAllClasses() {
        return classRepo.findAll();
    }

    @Override
    public void deleteClass(int id) {
        classRepo.deleteById(id);
    }

    @Override
    public Class getClass(int id) {
        return classRepo.findById(id).get();
    }

    @Override
    public Class updateClass(Class aClass, int id) {
        aClass.setID(id);
        return classRepo.save(aClass);
    }
}
