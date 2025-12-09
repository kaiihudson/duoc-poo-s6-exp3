package com.salmontt.model.unidadesOperativas;

import com.salmontt.model.Registrable;

public class PlantaProceso extends UnidadOperativa implements Registrable {
    private String processCapacity;

    public PlantaProceso(String name, String commune, String processCapacity) {
        super(name, commune);
        this.processCapacity = processCapacity;
    }

    public String getProcessCapacity() {
        return processCapacity;
    }

    public void setProcessCapacity(String processCapacity) {
        this.processCapacity = processCapacity;
    }


    @Override
    public String toString() {
        return "CentroCultivo{" +
                "name=" + getName() +
                "commune=" + getCommune() +
                "productionTons='" + processCapacity + '\'' +
                '}';
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Planta de Proceso " + getName() + " ubicada en la comuna: " + getCommune() + " con capacidad de produccion: " + processCapacity);
    }
}
