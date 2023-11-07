package com.corenetworks.modelo;

public class Gerente extends Empleado{
    private double bono;
    @Override
    public double calcularNomina() {
        return bono + sueldo;
    }

    public Gerente() {
    }

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}
