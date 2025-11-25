package com.salmontt.data;

import com.salmontt.model.CentroCultivo;
import com.salmontt.model.PlantaProceso;
import com.salmontt.model.UnidadOperativa;

public class GestorUnidades {
    private final UnidadOperativa u1 = new CentroCultivo("nombre 1", "comuna 1", "100");
    private final UnidadOperativa u2 = new CentroCultivo("nombre 2", "comuna 2", "200");
    private final UnidadOperativa u3 = new PlantaProceso("nombre 3", "comuna 3", "100");
    private final UnidadOperativa u4 = new PlantaProceso("nombre 4", "comuna 4", "200");

    public void printData(){
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
    }
}
