package com.salmontt.ui;

import com.salmontt.data.GestorEntidades;
import com.salmontt.model.colaborador.Colaboradores;
import com.salmontt.model.colaborador.Externo;
import com.salmontt.model.colaborador.Interno;
import com.salmontt.model.colaborador.Proveedor;
import com.salmontt.model.common.Registrable;
import com.salmontt.model.unidadOperativa.CentroCultivo;
import com.salmontt.model.unidadOperativa.PlantaProceso;
import com.salmontt.model.unidadOperativa.UnidadesOperativas;
import com.salmontt.ui.forms.colaborador.FormColaborador;
import com.salmontt.ui.forms.colaborador.FormColaboradorExterno;
import com.salmontt.ui.forms.colaborador.FormColaboradorInterno;
import com.salmontt.ui.forms.colaborador.FormColaboradorProveedor;
import com.salmontt.ui.forms.unidadOperativa.FormUO;
import com.salmontt.ui.forms.unidadOperativa.FormUOCentro;
import com.salmontt.ui.forms.unidadOperativa.FormUOPlanta;

import javax.swing.*;
import java.util.Objects;

public class Main {
    static GestorEntidades gestorEntidades = new GestorEntidades();

    public static void addColaborador(FormColaborador jPanel, Colaboradores col){
        String name = jPanel.getUsername();
        String capacity = jPanel.getCapacity();
        String expiration = jPanel.getExpiration();
        String contractDate = "";
        int salary = -1;
        int teamNumber = -1;
        String contractNumber = "";
        String contractType = "";
        if (jPanel instanceof FormColaboradorInterno){
            contractDate = ((FormColaboradorInterno) jPanel).getContractDate();
            salary = ((FormColaboradorInterno) jPanel).getSalary();
            teamNumber = ((FormColaboradorInterno) jPanel).getTeamNumber();
            if (Objects.equals(name, "") ||
                    Objects.equals(capacity, "") ||
                    Objects.equals(expiration, "") ||
                    Objects.equals(contractDate, "") ||
                    Objects.equals(salary, -1) ||
                    Objects.equals(teamNumber, -1)
            ){
                JOptionPane.showMessageDialog(jPanel, "Uno de los campos no es correcto, revisa e intenta nuevamente.");
                return;
            }
        }
        if (jPanel instanceof FormColaboradorExterno){
            contractNumber = ((FormColaboradorExterno) jPanel).getContractNumber();
            if (Objects.equals(name, "") ||
                    Objects.equals(capacity, "") ||
                    Objects.equals(expiration, "") ||
                    Objects.equals(contractNumber, "")
            ){
                JOptionPane.showMessageDialog(jPanel, "Uno de los campos no es correcto, revisa e intenta nuevamente.");
                return;
            }
        }
        if (jPanel instanceof FormColaboradorProveedor){
            contractNumber = ((FormColaboradorProveedor) jPanel).getContractNumber();
            contractType = ((FormColaboradorProveedor) jPanel).getType();
            if (Objects.equals(name, "") ||
                    Objects.equals(capacity, "") ||
                    Objects.equals(expiration, "") ||
                    Objects.equals(contractNumber, "") ||
                    Objects.equals(contractType, "")
            ){
                JOptionPane.showMessageDialog(jPanel, "Uno de los campos no es correcto, revisa e intenta nuevamente.");
                return;
            }
        }
        Registrable r = null;
        if (col == Colaboradores.INTERNO){
            r =  new Interno(name, capacity, expiration, contractDate, salary, teamNumber);
        }
        if (col == Colaboradores.EXTERNO){
            r =  new Externo(name, capacity, expiration, contractNumber);
        }
        if (col == Colaboradores.PROVEEDOR){
            r = new Proveedor(name, capacity, expiration, contractType, contractNumber);
        }
        gestorEntidades.addItem(r);
        assert r != null;
        JOptionPane.showMessageDialog(jPanel, r.mostrarResumen());
    }

    public static void selectColaborador(){
        String[] options = {
                "Externo", // 0
                "Interno", // 1
                "Proveedor", // 2
                "Cancelar"// 3
        };
        var option = 0;
        while (option != 3) {
            option = JOptionPane.showOptionDialog(null,
                    "Seleccione una opción",
                    "Salmontt",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            int returnedValue;
            switch (option) {
                case 0:
                    FormColaboradorExterno formColaboradorExterno = new FormColaboradorExterno();
                    returnedValue = JOptionPane.showOptionDialog(
                            null,
                            formColaboradorExterno,
                            "Agregando Colaborador Externo",
                            JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            null,
                            null
                    );
                    if (JOptionPane.OK_OPTION == returnedValue) {
                        addColaborador(formColaboradorExterno, Colaboradores.EXTERNO);
                    }
                    option = 3;
                    break;
                case 1:
                    FormColaboradorInterno formColaboradorInterno = new FormColaboradorInterno();
                    returnedValue = JOptionPane.showOptionDialog(
                            null,
                            formColaboradorInterno,
                            "Agregando Colaborador Interno",
                            JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            null,
                            null
                    );
                    if (JOptionPane.OK_OPTION == returnedValue) {
                        addColaborador(formColaboradorInterno, Colaboradores.INTERNO);
                    }
                    option = 3;
                    break;
                case 2:
                    FormColaboradorProveedor formColaboradorProveedor = new FormColaboradorProveedor();
                    returnedValue = JOptionPane.showOptionDialog(
                            null,
                            formColaboradorProveedor,
                            "Agregando Proveedor",
                            JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            null,
                            null
                    );
                    if (JOptionPane.OK_OPTION == returnedValue) {
                        addColaborador(formColaboradorProveedor, Colaboradores.PROVEEDOR);
                    }
                    option = 3;
                    break;
                case 3:
                    break;
            }
        }
    }

    public static void addUO(FormUO jPanel, UnidadesOperativas uo){
        String name = jPanel.getUserame();
        String commune = jPanel.getCommune();
        String production = "";
        String capacity = "";
        if (jPanel instanceof FormUOCentro){
            production = ((FormUOCentro) jPanel).getProduction();
            if (Objects.equals(name, "") ||
                    Objects.equals(commune, "") ||
                    Objects.equals(production, "")){
                JOptionPane.showMessageDialog(jPanel, "Uno de los campos no es correcto, revisa e intenta nuevamente.");
                return;
            }
        }
        if (jPanel instanceof FormUOPlanta){
            capacity = ((FormUOPlanta) jPanel).getCapacity();
            if (Objects.equals(name, "") ||
                    Objects.equals(commune, "") ||
                    Objects.equals(capacity, "")){
                JOptionPane.showMessageDialog(jPanel, "Uno de los campos no es correcto, revisa e intenta nuevamente.");
                return;
            }
        }
        Registrable r = null;
        if (uo == UnidadesOperativas.CENTRO_CULTIVO){
            r =  new CentroCultivo(name, commune, production);
        }
        if (uo == UnidadesOperativas.PLANTA_PROCESO){
            r =  new PlantaProceso(name, commune, capacity);
        }
        gestorEntidades.addItem(r);
        assert r != null;
        JOptionPane.showMessageDialog(jPanel, r.mostrarResumen());
    }

    public static void selectUO(){
        String[] options = {
                "Centro Cultivo", // 0
                "Planta de Proceso", // 1
                "Cancelar"// 2
        };
        var option = 0;
        while (option != 2) {
            option = JOptionPane.showOptionDialog(null,
                    "Seleccione una opcion",
                    "Salmontt",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            int returnedValue;
            switch (option) {
                case 0:
                    FormUOCentro formUOCentro = new FormUOCentro();
                    returnedValue = JOptionPane.showOptionDialog(
                            null,
                            formUOCentro,
                            "Agregando Centro",
                            JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            null,
                            null
                    );
                    if (JOptionPane.OK_OPTION == returnedValue) {
                        addUO(formUOCentro, UnidadesOperativas.CENTRO_CULTIVO);
                    }
                    option = 2;
                    break;
                case 1:
                    FormUOPlanta formUOPlanta = new FormUOPlanta();
                    returnedValue = JOptionPane.showOptionDialog(
                            null,
                            formUOPlanta,
                            "Agregando Planta de Proceso",
                            JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            null,
                            null
                    );
                    if (JOptionPane.OK_OPTION == returnedValue) {
                        addUO(formUOPlanta, UnidadesOperativas.PLANTA_PROCESO);
                    }
                    option = 2;
                    break;
                case 2:
                    break;
            }
        }
    }

    public static void mainOptions(){
        String[] options = {
                "Agregar Colaborador", // 0
                "Agregar Unidad Operativa", // 1
                "Mostrar Colaboradores", // 2
                "Mostrar Unidades Operativas", // 3
                "Salir" // 4
        };
        var option = 0;
        while (option != 4){
            option = JOptionPane.showOptionDialog(null,
                    "Seleccione una opción",
                    "Salmontt",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            switch (option){
                case 0:
                    selectColaborador();
                    break;
                case 1:
                    selectUO();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, gestorEntidades.showAllColaboradores());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, gestorEntidades.showAllUnidades());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por usar este sistema.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        gestorEntidades.startUp();
        mainOptions();
    }
}