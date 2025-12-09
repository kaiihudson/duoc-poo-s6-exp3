package com.salmontt.data;

import com.salmontt.model.Registrable;
import com.salmontt.model.colaborador.Externo;
import com.salmontt.model.colaborador.Interno;
import com.salmontt.model.colaborador.Proveedor;
import com.salmontt.model.unidadesOperativas.CentroCultivo;
import com.salmontt.model.unidadesOperativas.PlantaProceso;
import com.salmontt.model.unidadesOperativas.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {
    private List<Registrable> registrables = new ArrayList<>();

    public void addDefaultItems(){
            registrables.add(new Externo("Empresa Externa 1", "200", "20/01/2026", "001e"));
            registrables.add(new Interno("Julian E.", "1", "20/01/2026","9/12/2025", 250000, 1));
            registrables.add(new Proveedor("Proveedor 1", "250", "20/01/2026", "Cafeteria", "001p"));
            registrables.add(new CentroCultivo("Centro Cultivo 1", "Comuna 1" , "200"));
            registrables.add(new PlantaProceso("Planta 1", "Comuna 1", "250"));
    }

    public void addItem(Registrable r){
        registrables.add(r);
    }

    public void showAllInfo(){
        if (registrables.isEmpty()){
            addDefaultItems();
        } else {
            return;
        }
        for (Registrable r: registrables) {
            if (r instanceof UnidadOperativa){
                r.mostrarResumen();
            }
        }
    }
}
