package com.salmontt.data;

import com.salmontt.model.CentroCultivo;
import com.salmontt.model.PlantaProceso;
import com.salmontt.model.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;

public class GestorUnidades {
    private final UnidadOperativa u1 = new CentroCultivo("nombre 1", "comuna 1", "100");
    private final UnidadOperativa u2 = new CentroCultivo("nombre 2", "comuna 2", "200");
    private final UnidadOperativa u3 = new PlantaProceso("nombre 3", "comuna 3", "100");
    private final UnidadOperativa u4 = new PlantaProceso("nombre 4", "comuna 4", "200");
    private final UnidadOperativa u5 = new PlantaProceso("nombre 5", "comuna 5", "500");

    private final List<UnidadOperativa> consolidation = new ArrayList<>();

    public void addInfoIfEmpty(){
        if (consolidation.isEmpty()){
            consolidation.add(u1);
            consolidation.add(u2);
            consolidation.add(u3);
            consolidation.add(u4);
            consolidation.add(u5);
        }
    }

    public void showInfo(){
        addInfoIfEmpty();
        for(UnidadOperativa u: consolidation){
            u.mostrarInformacion();
        }
    }

}
