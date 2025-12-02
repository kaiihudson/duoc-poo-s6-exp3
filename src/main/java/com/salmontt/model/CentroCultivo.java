package com.salmontt.model;

public class CentroCultivo extends UnidadOperativa {
    private String productionTons;

    public CentroCultivo(String name, String commune, String productionTons) {
        super(name, commune);
        this.productionTons = productionTons;
    }

    public String getProductionTons() {
        return productionTons;
    }

    public void setProductionTons(String productionTons) {
        this.productionTons = productionTons;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Centro de cultivo con producción: " + productionTons);
    }

    @Override
    public String toString() {
        return "CentroCultivo{" +
                "name=" + getName() +
                "commune=" + getCommune() +
                "productionTons='" + productionTons + '\'' +
                '}';
    }
}
