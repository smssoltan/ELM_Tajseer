package com.Elm.Tajseer.Tajseer;

import com.Elm.Tajseer.Tajseer.Model.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepo extends JpaRepository<Class,Integer> {
    List<Class> findAll();
}
