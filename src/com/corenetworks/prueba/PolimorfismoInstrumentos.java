package com.corenetworks.prueba;

import com.corenetworks.modelo.Bateria;
import com.corenetworks.modelo.Flauta;
import com.corenetworks.modelo.Guitarra;
import com.corenetworks.modelo.InstrumentoMusical;

public class PolimorfismoInstrumentos {
    public static void main(String[] args) {
        InstrumentoMusical guido=new Guitarra("Yamaha","cobre");
        InstrumentoMusical bataca=new Bateria("Yamaha",3);
        InstrumentoMusical ham= new Flauta("Hammer","metal");

        InstrumentoMusical[] instrumento=new InstrumentoMusical[3];
        instrumento[0]=guido;
        instrumento[1]=bataca;
        instrumento[2]=ham;
        for (InstrumentoMusical element:instrumento
        ) {
            System.out.println("Instrumentos: "+ element.emitirSonido());
            System.out.println(element.toString());
        }

    }
}


