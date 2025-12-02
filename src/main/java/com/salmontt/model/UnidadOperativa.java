package com.salmontt.model;

public class UnidadOperativa {
    private String name;
    private String commune;

    public UnidadOperativa() {
    }

    public UnidadOperativa(String name, String commune) {
        this.name = name;
        this.commune = commune;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public void mostrarInformacion(){
        System.out.println("Mostrando Informacion:");
    }

    @Override
    public String toString() {
        return "UnidadOperativa{" +
                "name='" + name + '\'' +
                ", commune='" + commune + '\'' +
                '}';
    }
}
