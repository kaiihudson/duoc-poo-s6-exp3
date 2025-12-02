package com.salmontt.model;

public class PlantaProceso extends UnidadOperativa{
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
    public void mostrarInformacion() {
        System.out.println("Planta de proceso de capacidad: " + processCapacity);
    }

    @Override
    public String toString() {
        return "CentroCultivo{" +
                "name=" + getName() +
                "commune=" + getCommune() +
                "productionTons='" + processCapacity + '\'' +
                '}';
    }
}
