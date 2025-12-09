package com.salmontt.model.colaborador;

import com.salmontt.model.common.Registrable;

public class Externo extends Colaborador implements Registrable {
    private final String numeroContrato;

    public Externo(String name, String capacity, String expiration, String numeroContrato) {
        super(name, capacity, expiration);
        this.numeroContrato = numeroContrato;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }


    @Override
    public String mostrarResumen() {
        return ("Colaborador Externo: " + getName() +". Expira: "+  getExpiration() + ". Numero de contrato " + numeroContrato);
    }
}
