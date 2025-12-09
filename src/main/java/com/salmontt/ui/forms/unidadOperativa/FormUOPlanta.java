package com.salmontt.ui.forms.unidadOperativa;

import javax.swing.*;

public class FormUOPlanta extends FormUO {
    private final JTextField capacity;

    public FormUOPlanta(){
        super();
        JLabel capacityLabel = new JLabel("Capacidad de Produccion (tons): ");
        capacity = new JTextField(40);

        add(capacityLabel);
        add(capacity);
    }
    public String getCapacity(){
        return capacity.getText();
    }
}
