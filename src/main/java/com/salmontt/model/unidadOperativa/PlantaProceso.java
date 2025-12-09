package com.salmontt.model.unidadOperativa;

import com.salmontt.model.common.Registrable;

public class PlantaProceso extends UnidadOperativa implements Registrable {
    private final String processCapacity;

    public PlantaProceso(String name, String commune, String processCapacity) {
        super(name, commune);
        this.processCapacity = processCapacity;
    }

    public String getProcessCapacity() {
        return processCapacity;
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
    public String mostrarResumen() {
         return "Planta de Proceso " + getName() + " ubicada en la comuna: " + getCommune() + " con capacidad de produccion: " + processCapacity;
    }
}
