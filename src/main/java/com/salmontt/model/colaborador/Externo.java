package com.salmontt.model.colaborador;

import com.salmontt.model.Registrable;

public class Externo extends Colaborador implements Registrable {
    private String numeroContrato;


    public Externo(String name, String capacity, String expiration, String numeroContrato) {
        super(name, capacity, expiration);
        this.numeroContrato = numeroContrato;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Colaborador Externo." + getName() +"Expira: "+  getExpiration() + ". Numero de contrato" + numeroContrato);
    }
}
