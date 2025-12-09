package com.salmontt.ui.forms.colaborador;

import javax.swing.*;

public class FormColaboradorExterno extends FormColaborador {
    private final JTextField contractNumber;

    public FormColaboradorExterno(){
        super();
        JLabel contractNumberLabel = new JLabel("Numero de Contrato");
        contractNumber = new JTextField(40);
        add(contractNumberLabel);
        add(contractNumber);
    }

    public String getContractNumber(){
        return contractNumber.getText();
    }
}
