package com.salmontt.ui.forms.colaborador;

import javax.swing.*;

public abstract class FormColaborador extends JPanel {
    private final JTextField username;
    private final JTextField capacity;
    private final JTextField expiration;

    protected FormColaborador() {
        JLabel nameLabel = new JLabel("Nombre:");
        JLabel capacityLabel = new JLabel("Capacidad:");
        JLabel expirationLabel = new JLabel("Expiracion Contrato: ");
        username = new JTextField(40);
        capacity = new JTextField(40);
        expiration = new JTextField(40);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(nameLabel);
        add(username);
        add(capacityLabel);
        add(capacity);
        add(expirationLabel);
        add(expiration);
    }

    public String getUsername(){
        return username.getText();
    }

    public String getCapacity(){
        return capacity.getText();
    }

    public String getExpiration(){
        return expiration.getText();
    }
}
