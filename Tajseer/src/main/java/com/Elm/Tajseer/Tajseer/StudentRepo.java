package com.Elm.Tajseer.Tajseer;

import com.Elm.Tajseer.Tajseer.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    List<Student> findAll();
}
