package com.example.prueba.model;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String ubication;
    String position;
    String fullname;
    String image;

    public Persona(Long id, String ubication, String position, String fullname, String image) {
       this.id=id;
       this.ubication=ubication;
       this.position=position;
       this.fullname=fullname;
       this.image=image;



    }

    public Persona() {
    }
}
