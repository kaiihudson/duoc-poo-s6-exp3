package com.salmontt.model.unidadOperativa;

public abstract class UnidadOperativa {
    private final String name;
    private final String commune;

    public UnidadOperativa(String name, String commune) {
        this.name = name;
        this.commune = commune;
    }

    public String getName() {
        return name;
    }

    public String getCommune() {
        return commune;
    }

    @Override
    public String toString() {
        return "UnidadOperativa{" +
                "name='" + name + '\'' +
                ", commune='" + commune + '\'' +
                '}';
    }
}
