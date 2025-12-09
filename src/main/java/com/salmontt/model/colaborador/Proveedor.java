package com.salmontt.model.colaborador;

import com.salmontt.model.common.Registrable;

public class Proveedor extends Colaborador implements Registrable {
    private final String tipo;
    private final String numeroContrato;

    public Proveedor(String name, String capacity, String expiration, String tipo, String numeroContrato) {
        super(name, capacity, expiration);
        this.tipo = tipo;
        this.numeroContrato = numeroContrato;
    }

    public String getTipo() {
        return tipo;
    }


    public String getNumeroContrato() {
        return numeroContrato;
    }

    @Override
    public String mostrarResumen() {
        return ("Proveedor: " + getName() +". Expira: "+  getExpiration() +
                ". Numero de contrato " + numeroContrato + " Capacidad Especifica: " + tipo);
    }
}
