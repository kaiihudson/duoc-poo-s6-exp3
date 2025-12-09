package com.salmontt.data;

import com.salmontt.model.common.Registrable;
import com.salmontt.model.colaborador.Colaborador;
import com.salmontt.model.colaborador.Externo;
import com.salmontt.model.colaborador.Interno;
import com.salmontt.model.colaborador.Proveedor;
import com.salmontt.model.unidadOperativa.CentroCultivo;
import com.salmontt.model.unidadOperativa.PlantaProceso;
import com.salmontt.model.unidadOperativa.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {
    private final List<Registrable> registrables = new ArrayList<>();

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

    public void startUp() {
        if (registrables.isEmpty()){
            addDefaultItems();
        }
    }

    public String showAllUnidades(){
        StringBuilder sb = new StringBuilder();
        for (Registrable r: registrables) {
            if (r instanceof UnidadOperativa){
                sb.append(r.mostrarResumen()).append("\n");
            }
        }
        return sb.toString();
    }
    public String showAllColaboradores(){
        StringBuilder sb = new StringBuilder();
        for (Registrable r: registrables) {
            if (r instanceof Colaborador){
                sb.append(r.mostrarResumen()).append("\n");
            }
        }
        return sb.toString();
    }
}
