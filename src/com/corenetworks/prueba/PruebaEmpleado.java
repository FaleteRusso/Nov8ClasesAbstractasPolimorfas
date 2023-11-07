package com.corenetworks.prueba;

import com.corenetworks.modelo.Gerente;
import com.corenetworks.modelo.Operador;
import com.corenetworks.modelo.Vendedor;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Gerente g1=new Gerente("Carlos Jímenez",3_500,700);
        System.out.println("Su nomina asciende a: " + g1.calcularNomina()+"€");
        System.out.println(g1.toString());

        Vendedor v1=new Vendedor("José Moreno",2_000,180,7);
        System.out.println("Su nomina asciende a : " + v1.calcularNomina() +"€");
        System.out.println(v1.toString());
        Operador o1=new Operador("Blanca Sánchez",1_800,150,2);
        System.out.println("Su nomina asciende a: " + o1.calcularNomina()+"€");
        System.out.println(o1.toString());
    }

}
