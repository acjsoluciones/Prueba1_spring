package com.acj.Prueba_1.dto;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Integer> { //hereda del spring data repository
//    //utilizar los nombre de metodos recomendados por spring
//    List<Persona>findAll();
//    Persona findOne(int id);
//    Persona save(Persona p);
//    void delete(Persona p);
}
