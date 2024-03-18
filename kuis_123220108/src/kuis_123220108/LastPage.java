/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220108;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastPage extends JFrame {
    JLabel labelDetail = new JLabel();
    JLabel labelTotalHarga = new JLabel();

    LastPage(String nama, String noHP, String jenisKendaraan, int jumlahHari) {
        setVisible(true);
        setSize(480, 480);
        setTitle("INVOICEE!!!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel labelNama = new JLabel("Nama: " + nama);
        JLabel labelNoHP = new JLabel("No HP: " + noHP);
        JLabel labelJenisKendaraan = new JLabel("Jenis Kendaraan: " + jenisKendaraan);
        JLabel labelJumlahHari = new JLabel("Jumlah Hari: " + jumlahHari);

        labelNama.setBounds(20, 20, 200, 16);
        labelNoHP.setBounds(20, 40, 200, 16);
        labelJenisKendaraan.setBounds(20, 60, 200, 16);
        labelJumlahHari.setBounds(20, 80, 200, 16);

        add(labelNama);
        add(labelNoHP);
        add(labelJenisKendaraan);
        add(labelJumlahHari);

        double hargaPerHari = 0;
        if (jenisKendaraan.equals("Motor")) {
            hargaPerHari = 50000;
        } else if (jenisKendaraan.equals("Mobil")) {
            hargaPerHari = 100000;
        } else if (jenisKendaraan.equals("Pesawat")) {
            hargaPerHari = 500000;
        }

        double totalHarga = hargaPerHari * jumlahHari;
        JLabel labelTotalHarga = new JLabel("Total Harga: Rp" + totalHarga);
        labelTotalHarga.setBounds(20, 100, 200, 16);
        add(labelTotalHarga);

        JButton tombolSelesai = new JButton("Selesai");
        tombolSelesai.setBounds(20, 140, 100, 30);
        tombolSelesai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(tombolSelesai);
    }
}