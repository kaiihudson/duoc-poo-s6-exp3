package com.salmontt.model.unidadOperativa;

import com.salmontt.model.common.Registrable;

public class CentroCultivo extends UnidadOperativa implements Registrable {
    private final String productionTons;

    public CentroCultivo(String name, String commune, String productionTons) {
        super(name, commune);
        this.productionTons = productionTons;
    }

    public String getProductionTons() {
        return productionTons;
    }

    @Override
    public String toString() {
        return "CentroCultivo{" +
                "name=" + getName() +
                "commune=" + getCommune() +
                "productionTons='" + productionTons + '\'' +
                '}';
    }

    @Override
    public String mostrarResumen() {
        return "Centro de cultivo " + getName() + " ubicada en la comuna: " + getCommune() + " con producción: " + productionTons;
    }
}
