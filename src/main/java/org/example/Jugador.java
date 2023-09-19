package org.example;

import javax.persistence.*;
import java.time.LocalDate;
@Table(name = "Jugador")
@Entity
public class Jugador {
    @Id
    private long id;

    @Column(name="Apellido")
    private String apellido;
    @Column(name="FechaAlta",columnDefinition = "DATE")
    private LocalDate fechaAlta;
    @Column(name="Nombre")
    private String nombre;

    @OneToOne
    @Column(name="Personaje")
    private Personaje personaje;

    public void cambiarPersonaje(Personaje personaje){
    }
}