package com.salmontt.model.colaborador;

public abstract class Colaborador {
    private String name;
    private String capacity;
    private String expiration;

    public Colaborador(){}

    public Colaborador(String name, String capacity, String expiration) {
        this.name = name;
        this.capacity = capacity;
        this.expiration = expiration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

}
