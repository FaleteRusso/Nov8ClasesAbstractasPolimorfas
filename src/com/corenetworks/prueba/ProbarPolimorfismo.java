package com.corenetworks.prueba;

import com.corenetworks.modelo.Empleado;
import com.corenetworks.modelo.Gerente;
import com.corenetworks.modelo.Operador;
import com.corenetworks.modelo.Vendedor;

public class ProbarPolimorfismo {
    public static void main(String[] args) {
        //Probar polimorfismo
        //Gerente g1=new Gerente("pepe",2_000,500); esto es lo que haríamos normalmente en abstracto
        Empleado e1=new Gerente("poli",3_000,700);
        System.out.println("Calcular nómina ->"+ e1.calcularNomina()+ "€");
        System.out.println(e1.toString());
        Gerente g2 =(Gerente) e1;//(Casting)//con esto convertimos a empleado en estructura de gerente
        System.out.println("Bono: " + g2.getBono()+"€");

        Empleado e2= new Vendedor("Carlos",1_500,20_000,0.01);
        System.out.println("Calcular nomina: "+ e2.calcularNomina()+ "€");
        System.out.println(e2.toString());

        Empleado e3= new Operador("Peter",1_000,1_000,.02);
        System.out.println("Calcular nomina: "+ e3.calcularNomina());
        System.out.println(e3.toString());
        Empleado[] empleados =new Empleado[3];
        empleados[0]= e1;
        empleados[1]= e2;
        empleados[2]=e3;
        for (Empleado elemento:empleados
             ) {
            System.out.println("Calcular nomina: "+ elemento.calcularNomina());
            System.out.println(elemento.toString());

        }
    }
}
