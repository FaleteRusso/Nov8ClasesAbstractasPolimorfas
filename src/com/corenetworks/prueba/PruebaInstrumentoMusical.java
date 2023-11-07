package com.corenetworks.prueba;

import com.corenetworks.modelo.Bateria;
import com.corenetworks.modelo.Flauta;
import com.corenetworks.modelo.Guitarra;
import com.corenetworks.modelo.InstrumentoMusical;

public class PruebaInstrumentoMusical {
    public static void main(String[] args) {
        Guitarra g1=new Guitarra("Yamaha","Cobre");
        System.out.println(g1.emitirSonido());
        System.out.println(g1.toString());
        Bateria b1=new Bateria("Yamaha",4);
        System.out.println(b1.emitirSonido());
        System.out.println(b1.toString());
        Flauta f1=new Flauta("Strato","metal");
        System.out.println(f1.emitirSonido());
        System.out.println(f1.toString());

        InstrumentoMusical i1=new Guitarra("Guido","cobre");
        InstrumentoMusical i2=new Bateria("Bataca",3);
        InstrumentoMusical i3= new Flauta("Ham","metal");

        InstrumentoMusical[] instrumentoMusicals=new InstrumentoMusical[3];
        instrumentoMusicals[0]=i1;
        instrumentoMusicals[1]=i2;
        instrumentoMusicals[2]=i3;
        for (InstrumentoMusical element:instrumentoMusicals
             ) {
            System.out.println("Instrumentos: "+ element.emitirSonido());
            System.out.println(element.toString());
        }

    }
}
