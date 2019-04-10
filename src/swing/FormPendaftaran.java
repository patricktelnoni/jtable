package swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class FormPendaftaran extends JFrame {
    private JButton button1 = new JButton("Ganti");
    private JTextField textField1 = new JTextField(10);
    private JTable tabelData;
    private JButton edit = new JButton("Edit");;
    private String[][] tampilTabel;
    private DefaultTableModel model = new DefaultTableModel(new String[]{"Nama", "Nim", "IPK"}, 0);

    void isiData(){

    }

    public FormPendaftaran() {


        Container b = getContentPane();
        setLayout(new FlowLayout());
        String[] columnNames = {"Nama",
                                "Nim",
                                "IPK"};

        Object[][] data = {
                            {"Andi",1234,3.92},
                            {"Budi",4321,3.41},
                            {"Citra",1111,2.97},
                            {"Dedi",2222,3.06}
                        };

        System.out.println(tampilTabel);
        tabelData               = new JTable(data, columnNames);
//        tabelData.setModel(model);

        JScrollPane scrollPane  = new JScrollPane(tabelData);
        tabelData.setFillsViewportHeight(false);

        //                int row = tabelData.getSelectedRow();
//                int col = tabelData.getSelectedColumn();
//                String value  = tabelData.getModel().getValueAt(row, col).toString();

        b.add(scrollPane, BorderLayout.CENTER);
        b.add(button1);
        b.add(edit);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textField1.getText();
                Login login = new Login(value);
                login.setVisible(true);
                setVisible(false);
            }
        });
        setSize(700,460);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = tabelData.getSelectedRow();
                System.out.println(row);
                if(row > -1){
                    String nama = String.valueOf(tabelData.getModel().getValueAt(row, 0));
                    Integer nim = Integer.parseInt(tabelData.getModel().getValueAt(row, 1).toString());
                    Double ipk  = Double.parseDouble(tabelData.getModel().getValueAt(row, 2).toString());
                    FormUpdate formUpdate = new FormUpdate();
                    formUpdate.isiForm(nama, nim, ipk);
                    setVisible(false);
                    formUpdate.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Silahkan pilih data yang mau diedit");
                }
            }
        });
    }
}
