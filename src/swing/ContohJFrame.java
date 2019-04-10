package swing;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ContohJFrame extends JFrame {
    public ContohJFrame(){
        Container b = getContentPane();
        setLayout(new FlowLayout());

        JTextField angka1   = new JTextField(10);
        JTextField angka2   = new JTextField(10);
        JButton ok          = new JButton("Tambah");
        JLabel hasil        = new JLabel("Hasil");
        String[] jenisOperasi = {"+", "-", "*", "/"};
        JComboBox operasi   = new JComboBox(jenisOperasi);



        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input1 = Integer.parseInt(angka1.getText());
                int input2 = Integer.parseInt(angka2.getText());
                String operasiPilihan = operasi.getSelectedItem().toString();
                int hasilTambah = 0;
                switch (operasiPilihan){
                    case "+":
                        hasilTambah  = input1+input2;
                        break;
                    case "-":
                        hasilTambah = input1-input2;
                        break;
                    case "*":
                        hasilTambah = input1*input2;
                        break;
                    default:
                        hasilTambah = input1/input2;

                }

                //Tampilkan penjumlahan ke JLabel
                hasil.setText("Hasil operasi "+operasiPilihan+" adalah : " +
                        Integer.toString(hasilTambah));
            }
        });


        b.add(angka1);
        b.add(angka2);
        b.add(operasi);
        b.add(ok);
        b.add(hasil);

        setSize(300,160);
        setVisible(true);
    }
}
