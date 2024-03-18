/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220108;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextPage extends JFrame implements ActionListener {
    JLabel header = new JLabel();
    JLabel subheader = new JLabel("Isi formulir di bawah dengan data diri Anda");
    
    JLabel labelNama = new JLabel("Nama");
    JLabel labelNoHP = new JLabel("No HP");
    JLabel labelJumlahHari = new JLabel("Jumlah Hari Sewa");
    
    JTextField fieldNama = new JTextField();
    JTextField fieldNoHP = new JTextField();
    JTextField fieldJumlahHari = new JTextField();
    
    JRadioButton pilihMotor = new JRadioButton("Motor - 50.000");
    JRadioButton pilihMobil = new JRadioButton("Mobil - 100.000");
    JRadioButton pilihPesawat = new JRadioButton("Pesawat - 500.000");
    
    JButton tombolSimpan = new JButton("Simpan");
    
    String jenisKendaraan;

    NextPage(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
        
        setVisible(true);
        setSize(480, 480);
        setTitle("Halaman Data Diri");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        add(header);
        add(subheader);
        add(labelNama);
        add(labelNoHP);
        add(labelJumlahHari);
        add(fieldNama);
        add(fieldNoHP);
        add(fieldJumlahHari);
        add(pilihMotor);
        add(pilihMobil);
        add(pilihPesawat);
        add(tombolSimpan);
        
        header.setFont(header.getFont().deriveFont(20.0f));
        header.setBounds(20, 20, 440, 24);
        subheader.setBounds(20, 50, 440, 16);
        labelNama.setBounds(20, 84, 84, 32);
        labelNoHP.setBounds(20, 120, 84, 32);
        labelJumlahHari.setBounds(20, 156, 120, 32);
        fieldNama.setBounds(150, 84, 310, 32);
        fieldNoHP.setBounds(150, 120, 310, 32);
        fieldJumlahHari.setBounds(150, 156, 310, 32);
        
        ButtonGroup group = new ButtonGroup();
        group.add(pilihMotor);
        group.add(pilihMobil);
        group.add(pilihPesawat);

        pilihMotor.setBounds(20, 192, 200, 32);
        pilihMobil.setBounds(20, 224, 200, 32);
        pilihPesawat.setBounds(20, 256, 200, 32);
        
        tombolSimpan.setBounds(20, 292, 84, 32);

        tombolSimpan.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tombolSimpan) {
            String nama = fieldNama.getText();
            String noHP = fieldNoHP.getText();
            int jumlahHari = Integer.parseInt(fieldJumlahHari.getText());

            String jenisKendaraan = "";
            if (pilihMotor.isSelected()) {
                jenisKendaraan = "Motor";
            } else if (pilihMobil.isSelected()) {
                jenisKendaraan = "Mobil";
            } else if (pilihPesawat.isSelected()) {
                jenisKendaraan = "Pesawat";
            }

            new LastPage(nama, noHP, jenisKendaraan, jumlahHari);

            dispose();
        }   
    }
}
