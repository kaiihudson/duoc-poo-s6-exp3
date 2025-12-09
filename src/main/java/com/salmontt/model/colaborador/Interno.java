package com.salmontt.model.colaborador;

import com.salmontt.model.common.Registrable;

public class Interno extends Colaborador implements Registrable {
    private final String fechaContrato;
    private final int sueldo;
    private final int numeroEquipo;

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
    public String mostrarResumen() {
        return ("Colaborador Interno: " + getName() +". Expira: "+  getExpiration() +
                ". Contratado en: " + fechaContrato + " por: $" + sueldo + " para el equipo: " + numeroEquipo);
    }
}
