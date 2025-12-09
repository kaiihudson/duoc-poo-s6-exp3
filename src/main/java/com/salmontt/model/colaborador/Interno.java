package com.salmontt.model.colaborador;

import com.salmontt.model.Registrable;

public class Interno extends Colaborador implements Registrable {
    private String fechaContrato;
    private int sueldo;
    private int numeroEquipo;

    public Interno(String name, String capacity, String expiration, String fechaContrato, int sueldo, int numeroEquipo) {
        super(name, capacity, expiration);
        this.fechaContrato = fechaContrato;
        this.sueldo = sueldo;
        this.numeroEquipo = numeroEquipo;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public int getSueldo() {
        return sueldo;
    }

    public int getNumeroEquipo() {
        return numeroEquipo;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Colaborador Interno." + getName() +"Expira: "+  getExpiration() +
                ". Contratado en: " + fechaContrato + " por: " + sueldo + " para el equipo: " + numeroEquipo);
    }
}
