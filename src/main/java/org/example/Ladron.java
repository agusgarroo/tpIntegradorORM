package org.example;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@DiscriminatorValue("Ladron")
public class Ladron extends Personaje{
    @Column(name="Nivel Siniestro")
    private int nivelSiniestro;

    @Column(name="Tiene Navaja")
    private  boolean tieneNavaja;
    public void atacar(Personaje personaje){}

}
