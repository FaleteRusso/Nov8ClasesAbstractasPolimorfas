package com.corenetworks.prueba;

import com.corenetworks.modelo.Bateria;
import com.corenetworks.modelo.Flauta;
import com.corenetworks.modelo.Guitarra;

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

    }
}
