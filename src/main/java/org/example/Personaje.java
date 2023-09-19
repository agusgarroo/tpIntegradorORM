package org.example;

import Converters.ElementoDefensorAttributeConverter;

import javax.persistence.*;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_personaje")
public abstract class Personaje {
    @Id private long id;
    @ManyToOne
    @Convert(converter = ElementoDefensorAttributeConverter.class)
    private List<ElementoDefensor> elementos;

    @Column(name="Estamina")
    private int estamina;

    @Column(name="Puntos de Vida")
    private int puntosDeVida;
    public void atacar(Personaje personaje){}

}
