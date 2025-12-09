package com.salmontt.ui.forms.colaborador;

import javax.swing.*;

import static com.salmontt.common.Validate.validateInteger;

public class FormColaboradorInterno extends FormColaborador {
    private final JTextField contractDate;
    private final JTextField salary;
    private final JTextField teamNumber;

    public FormColaboradorInterno(){
        super();
        JLabel contractDateLabel = new JLabel("Fecha de Contrato: ");
        JLabel salaryLabel = new JLabel("Salario: ");
        JLabel teamNumberLabel = new JLabel("Numero de Equipo: ");
        contractDate = new JTextField(40);
        salary = new JTextField(40);
        teamNumber = new JTextField(40);

        add(contractDateLabel);
        add(contractDate);
        add(salaryLabel);
        add(salary);
        add(teamNumberLabel);
        add(teamNumber);
    }

    public String getContractDate(){
        return contractDate.getText();
    }
    public int getSalary(){
        try {
            return validateInteger(salary.getText());
        } catch (NumberFormatException e ){
            return -1;
        }
    }
    public int getTeamNumber(){
        try {
            return validateInteger(teamNumber.getText());
        } catch (NumberFormatException e){
            return -1;
        }
    }
}
