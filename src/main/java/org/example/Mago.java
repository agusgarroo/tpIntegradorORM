package org.example;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("Mago")
public class Mago extends Personaje{
    @Column(name="Nivel de Magia")
    private int nivelDeMagia;

    @Column(name="Tiene Alas")
    private  boolean tieneAlas;


    public void atacar(Personaje personaje){}

}
