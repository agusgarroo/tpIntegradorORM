package org.example;

import Converters.ElementoDefensorAttributeConverter;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="Personaje")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_personaje")
public abstract class Personaje {
    @Id
    @GeneratedValue
    private long id;
    @ElementCollection
    @CollectionTable(name="personaje_elemento_defensor", joinColumns = @JoinColumn(name ="elemento") )
    @Convert(converter = ElementoDefensorAttributeConverter.class)
    @Column(name="elemento")
    private List<ElementoDefensor> elementos;

    @Column(name="Estamina")
    private int estamina;

    @Column(name="Puntos de Vida")
    private int puntosDeVida;
    public void atacar(Personaje personaje){}

}
