package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JPanel getFieldNama = new JPanel();
    private JPanel getFieldNim= new JPanel();
    private JPanel getFieldTanggal= new JPanel();
    private JTextField FieldNama = new JTextField(10);
    private JTextField Nim  = new JTextField(10);
    private JLabel labelNama = new JLabel("FieldNama");
    private JLabel labelNim = new JLabel("Nim");
    private JTextField Tanggal =new JTextField(10);;
    private JButton kirim = new JButton("Kirim Data");
    private JLabel labelTTL = new JLabel("TTL");
    private JPanel fieldNama;
    private JPanel fieldTanggal;
    private JPanel fieldNim;
    private JButton Kembali = new JButton("Kembali");
    ;


    public Login(String kiriman) {
        Container form = getContentPane();
        setLayout(new FlowLayout());
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        form.add(labelNama);
        form.add(FieldNama);
        form.add(labelNim);
        form.add(Nim);
        form.add(labelTTL);
        form.add(Tanggal);
        form.add(kirim);
        form.add(Kembali);
        Nim.setText(kiriman);

        setSize(300,160);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);



        kirim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, FieldNama.getText());
            }
        });
        Kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormPendaftaran formPendaftaran = new FormPendaftaran();
                formPendaftaran.setVisible(true);
                setVisible(false);
            }
        });
    }


}


