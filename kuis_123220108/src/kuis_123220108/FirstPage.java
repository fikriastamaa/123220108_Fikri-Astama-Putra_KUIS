/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220108;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.*;

public class FirstPage extends JFrame implements ActionListener{
    JLabel header = new JLabel("Selamat Datang di rental fikri!");
    JLabel subheader = new JLabel("Silakan masuk untuk melanjutkan.");
    
    JLabel labelPilihan = new JLabel("Silahkan Pilih Kendaraan yang ingin anda sewa");

    JRadioButton pilihMotor = new JRadioButton("Motor");
    JRadioButton pilihMobil = new JRadioButton("Mobil", true);

    JButton tombolLogin = new JButton("Lanjutkan");

    FirstPage() {
        setVisible(true);
        setSize(480, 480);
        setTitle("Rental Motor dan Mobil Fikri");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        add(header);
        add(subheader);
        add(labelPilihan);
        add(pilihMotor);
        add(pilihMobil);
        add(tombolLogin);

        header.setFont(header.getFont().deriveFont(20.0f));
        header.setBounds(20, 20, 440, 24);
        subheader.setBounds(20, 50, 440, 12);

        ButtonGroup group = new ButtonGroup();
        group.add(pilihMotor);
        group.add(pilihMobil);

        labelPilihan.setBounds(20, 216, 440, 12);
        pilihMotor.setBounds(14, 232, 128, 32);
        pilihMobil.setBounds(224, 232, 128, 32);

        tombolLogin.setBounds(14, 280, 452, 36);
        tombolLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {            
            String jenisKendaraan = pilihMotor.isSelected() ? "Motor" : "Mobil";

            new NextPage(jenisKendaraan);
            this.dispose();
            
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
