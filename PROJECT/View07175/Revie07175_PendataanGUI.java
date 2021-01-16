package View07175;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Revie07175_PendataanGUI {
    JFrame logP = new JFrame();
    JButton tambahbutton, hapusbutton, updatebutton, viewbutton, exitbutton; 
    JLabel judul;
    
    Revie07175_PendataanGUI(){
        logP.setSize(650, 500);
        logP.setLayout(null);
        logP.getContentPane().setBackground(Color.BLUE);
        
        judul = new JLabel("SILAHKAN PILIH");
        judul.setBounds(200, 10, 600, 50);
        judul.setFont(new Font("Times New Roman", Font.BOLD, 30));
        logP.add(judul);
        
        tambahbutton = new JButton("TAMBAH");
        tambahbutton.setBounds(280, 100, 100, 40);
        tambahbutton.setBackground(Color.white);
        logP.add(tambahbutton);
        
        hapusbutton = new JButton("HAPUS");
        hapusbutton.setBounds(280, 160, 100, 40);
        hapusbutton.setBackground(Color.white);
        logP.add(hapusbutton);
        
        updatebutton = new JButton("UPDATE");
        updatebutton.setBounds(280, 220, 100, 40);
        updatebutton.setBackground(Color.white);
        logP.add(updatebutton);
        
        viewbutton = new JButton("VIEW");
        viewbutton.setBounds(280, 280, 100, 40);
        viewbutton.setBackground(Color.white);
        logP.add(viewbutton);
        
        exitbutton = new JButton("EXIT");
        exitbutton.setBounds(280, 340, 100, 40);
        exitbutton.setBackground(Color.white);
        logP.add(exitbutton);
        
        logP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logP.setVisible(true);
        logP.setLocationRelativeTo(null);
        
        tambahbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Revie07175_Tambah t = new Revie07175_Tambah();
                logP.dispose();
            }
        });
        
        hapusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Revie07175_Hapus h = new Revie07175_Hapus();
                logP.dispose();
            }
        });
        
        updatebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Revie07175_Update u = new Revie07175_Update();
                logP.dispose();
            }
        });        
        viewbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Revie07175_View v = new Revie07175_View();
                logP.dispose();
            }
        });        
        exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Revie07175_GUI g = new Revie07175_GUI();
                logP.dispose();
            }
        });       
    }
}
