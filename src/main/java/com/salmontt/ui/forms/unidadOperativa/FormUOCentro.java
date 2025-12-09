package com.salmontt.ui.forms.unidadOperativa;

import javax.swing.*;

public class FormUOCentro extends FormUO {
    private final JTextField production;

    public FormUOCentro(){
        super();
        JLabel productionLabel = new JLabel("Produccion (tons): ");
        production = new JTextField(40);

        add(productionLabel);
        add(production);
    }

    public String getProduction(){
        return production.getText();
    }
}
