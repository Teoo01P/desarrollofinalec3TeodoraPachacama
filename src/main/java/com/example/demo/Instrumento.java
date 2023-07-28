package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;


@Entity
@Table(name="tbl_instrumento")
public class Instrumento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    
    @OneToMany(targetEntity = Instrumento.class, mappedBy = "carrera")
    @OrderBy("nombre ASC")
    private Set<Instrumento> cursos = new HashSet<Instrumento>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Instrumento> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Instrumento> cursos) {
        this.cursos = cursos;
    }


}