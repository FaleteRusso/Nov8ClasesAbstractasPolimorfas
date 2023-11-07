package com.corenetworks.prueba;

import com.corenetworks.modelo.Circulo;
import com.corenetworks.modelo.Figura;
import com.corenetworks.modelo.Rectangulo;


public class PruebaFigura {
    public static void main(String[] args) {
       /* No se puede instancias la clase Figura por que es abstracta
        Figura f1=new Figura() ;
        */
        Rectangulo r1=new Rectangulo(0,0,4,2);
        System.out.println("Area del rectangulo: "+ r1.calcularArea()+ "cm");
        System.out.println(r1.toString());
        Circulo c1=new Circulo(4,4,2);
        System.out.println("Area del circulo " + c1.calcularArea()+ "cm");
        System.out.println(c1.toString());
    }



        }

