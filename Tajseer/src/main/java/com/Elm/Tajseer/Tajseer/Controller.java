package com.Elm.Tajseer.Tajseer;

import com.Elm.Tajseer.Tajseer.Model.Class;
import com.Elm.Tajseer.Tajseer.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
      //create 2 paths.
public class Controller {

    @Autowired
    private Service Serv_imp;

    //Student






    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) { //request body = object
        return Serv_imp.addStudent(student);
    }
    @GetMapping("/students")
    public  List<Student> getAllStudents(){

        return Serv_imp.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id){

        return Serv_imp.getStudent(id);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") int id){
        Serv_imp.deleteStudent(id);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") int id){
        return  Serv_imp.updateStudent(student,id);
    }

    //Class

    @PostMapping("/classes")
    public Class addClass(@RequestBody Class aClass) { //request body = object
        return Serv_imp.addClass(aClass);
    }
    @GetMapping("/classes")
    public  List<Class> getAllClasses(){

        return Serv_imp.getAllClasses();
    }
    @GetMapping("/classes/{id}")
    public Class getClass(@PathVariable("id") int id){

        return Serv_imp.getClass(id);
    }

    @DeleteMapping("/classes/{id}")
    public void deleteClass(@PathVariable("id") int id){
        Serv_imp.deleteClass(id);
    }

    @PutMapping("/classes/{id}")
    public Class updateClass(@RequestBody Class aClass, @PathVariable("id") int id){
        return  Serv_imp.updateClass(aClass,id);
    }


}
