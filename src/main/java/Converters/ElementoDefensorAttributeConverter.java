package Converters;
import org.example.*;

import javax.persistence.AttributeConverter;

public class ElementoDefensorAttributeConverter implements AttributeConverter<ElementoDefensor, String> {
    @Override
    public String convertToDatabaseColumn(ElementoDefensor elementoDefensor){
            return elementoDefensor.getClass().getSimpleName();
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

}
