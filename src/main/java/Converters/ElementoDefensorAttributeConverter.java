package Converters;
import org.example.*;

import javax.persistence.AttributeConverter;

public class ElementoDefensorAttributeConverter implements AttributeConverter<ElementoDefensor, String> {
    @Override
    public String convertToDatabaseColumn(ElementoDefensor elementoDefensor){
            return this.toString(elementoDefensor);
    }
    @Override
    public ElementoDefensor convertToEntityAttribute (String elementoDefensor){
            return this.toElementoDefensor(elementoDefensor);
    }

    private ElementoDefensor toElementoDefensor(String elementoDefensor){
        ElementoDefensor elementoDefensor1 = null;
        if(elementoDefensor.equals("Arco")){
            elementoDefensor1 = new Arco();
        }
        if(elementoDefensor.equals("Espada")){
            elementoDefensor1 = new Espada();
        }
        if(elementoDefensor.equals("Escudo")) {
            elementoDefensor1 = new Escudo();
        }
        return elementoDefensor1;
    }
    private String toString(ElementoDefensor elementoDefensor){
        String elementoDefensor1 = null;
        if(elementoDefensor.getClass() == Arco.class){
            elementoDefensor1 = "Arco";
        }
        if(elementoDefensor.getClass() == Espada.class){
            elementoDefensor1 = "Espada";
        }
        if(elementoDefensor.getClass() == Escudo.class) {
            elementoDefensor1 = "Escudo";
        }
        return elementoDefensor1;
    }

}
