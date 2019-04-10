package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FormUpdate extends JFrame{
    private JTextField textField1, textField2, textField3;
    private JLabel labelNama, labelNim, labelIPK;
    private JButton updateButton;
    private JButton backButton;

    public void isiForm(String nama, Integer nim, Double ipk){
        textField1.setText(nama);
        textField2.setText(nim.toString());
        textField3.setText(ipk.toString());
    }

    public FormUpdate(){
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        textField3 = new JTextField(20);
        labelNama  = new JLabel("Nama");
        labelNim   = new JLabel("NIM");
        labelIPK   = new JLabel("IPK");
        updateButton = new JButton("Update");
        backButton   = new JButton("Back");

        textField2.setEditable(false);
        Container b = getContentPane();
        SpringLayout layout = new SpringLayout();
        b.setLayout(layout);
        b.add(labelNama);
        b.add(textField1);
        b.add(labelNim);
        b.add(textField2);
        b.add(labelIPK);
        b.add(textField3);
        b.add(backButton);
        b.add(updateButton);

        layout.putConstraint(SpringLayout.WEST, labelNama, 5, SpringLayout.WEST, b);
        layout.putConstraint(SpringLayout.NORTH, labelNama, 5, SpringLayout.NORTH, b);
        layout.putConstraint(SpringLayout.WEST, textField1, 15, SpringLayout.EAST, labelNama);
        layout.putConstraint(SpringLayout.NORTH, textField1, 5, SpringLayout.NORTH, b);

        layout.putConstraint(SpringLayout.WEST, labelNim, 5, SpringLayout.WEST, b);
        layout.putConstraint(SpringLayout.NORTH, labelNim, 30, SpringLayout.NORTH, b);
        layout.putConstraint(SpringLayout.WEST, textField2, 20, SpringLayout.EAST, labelNim);
        layout.putConstraint(SpringLayout.NORTH, textField2, 30, SpringLayout.NORTH, b);

        layout.putConstraint(SpringLayout.WEST, labelIPK, 5, SpringLayout.WEST, b);
        layout.putConstraint(SpringLayout.NORTH, labelIPK, 55, SpringLayout.NORTH, b);
        layout.putConstraint(SpringLayout.WEST, textField3, 20, SpringLayout.EAST, labelIPK);
        layout.putConstraint(SpringLayout.NORTH, textField3, 55, SpringLayout.NORTH, b);

        layout.putConstraint(SpringLayout.WEST, updateButton, 5, SpringLayout.WEST, b);
        layout.putConstraint(SpringLayout.NORTH, updateButton, 95, SpringLayout.NORTH, b);
        layout.putConstraint(SpringLayout.WEST, updateButton, 20, SpringLayout.EAST, backButton);
        layout.putConstraint(SpringLayout.NORTH, backButton, 95, SpringLayout.NORTH, b);



        setSize(700,460);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField1.getText();
                String nim  = textField2.getText();
                String ipk  = textField3.getText();

                        FormPendaftaran formPendaftaran = new FormPendaftaran();

                        formPendaftaran.setVisible(true);
                        setVisible(false);

            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormPendaftaran formPendaftaran = new FormPendaftaran();
                formPendaftaran.setVisible(true);
                setVisible(false);
            }
        });
    }
}
