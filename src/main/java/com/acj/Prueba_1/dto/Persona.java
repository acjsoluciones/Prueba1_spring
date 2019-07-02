package com.acj.Prueba_1.dto;

import javax.persistence.*;

@Entity
@Table(name = "persona") //para la tabla de la base de datos
public class Persona {
    //hace referencia a la tabla de la BD (es el mismo nombre de los campos de la BD)
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String apellido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
