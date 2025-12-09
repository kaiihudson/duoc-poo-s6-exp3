package com.salmontt.model.colaborador;

import com.salmontt.model.Registrable;

public class Proveedor extends Colaborador implements Registrable {
    private String tipo;
    private String numeroContrato;

    public Proveedor(String name, String capacity, String expiration, String tipo, String numeroContrato) {
        super(name, capacity, expiration);
        this.tipo = tipo;
        this.numeroContrato = numeroContrato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Colaborador Externo." + getName() +"Expira: "+  getExpiration() +
                ". Numero de contrato" + numeroContrato + " Capacidad Especifica: " + tipo);
    }
}
