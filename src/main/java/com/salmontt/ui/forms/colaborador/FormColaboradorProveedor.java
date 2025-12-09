package com.salmontt.ui.forms.colaborador;

import javax.swing.*;

public class FormColaboradorProveedor extends FormColaborador {
    private final JTextField type;
    private final JTextField contractNumber;

    public FormColaboradorProveedor(){
        super();
        JLabel typeLabel = new JLabel("Tipo de Servicio");
        JLabel contractNumberLabel = new JLabel("Numero de contrato");
        type = new JTextField(40);
        contractNumber = new JTextField(40);

        add(typeLabel);
        add(type);
        add(contractNumberLabel);
        add(contractNumber);
    }

    public String getType(){
        return type.getText();
    }
    public String getContractNumber(){
        return contractNumber.getText();
    }
}
