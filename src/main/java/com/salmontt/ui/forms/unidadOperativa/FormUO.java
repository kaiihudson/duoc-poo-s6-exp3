package com.salmontt.ui.forms.unidadOperativa;

import javax.swing.*;

public abstract class FormUO extends JPanel {
    private final JTextField username;
    private final JTextField commune;

    public FormUO(){
        JLabel nameLabel = new JLabel("Nombre:");
        JLabel communeLabel = new JLabel("Comuna:");
        username = new JTextField(40);
        commune = new JTextField(40);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(nameLabel);
        add(username);
        add(communeLabel);
        add(commune);
    }

    public String getUserame(){
        return username.getText();
    }

    public String getCommune(){
        return commune.getText();
    }

}
