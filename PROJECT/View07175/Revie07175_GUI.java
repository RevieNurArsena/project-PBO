package View07175;

import Controller.Revie07175_PenjualController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import javax.swing.*;

public class Revie07175_GUI {
    JFrame log = new JFrame();
    JLabel login, daftar, judul;
    JTextField textid, textnama;
    JTextField textiddaftar, textnamadaftar;
    JLabel labelid, labelnama, labelpass;
    JLabel labeliddftar, labelnamadaftar, labelpassdaftar;
    JButton daftarbutton, loginbutton;
    JPasswordField passlogin, passdaftar;
    private boolean ceklogin = false;
    Revie07175_PenjualController penjual = new Revie07175_PenjualController();
    
    public Revie07175_GUI(){
        log.setSize(700,630);
        log.setLayout(null);
        log.getContentPane().setBackground(Color.BLUE);
        judul = new JLabel("SELAMAT DATANG");
        judul.setBounds(150, 10, 600, 50);
        judul.setFont(new Font("Times New Roman", Font.BOLD, 40));
        log.add(judul);
   
        login = new JLabel("Login");
        login.setBounds(100, 50, 100, 100);
        login.setFont(new Font("Times New Roman", Font.BOLD, 30));
        log.add(login);
        
        labelid = new JLabel("ID");
        labelid.setBounds(30, 150, 30, 30);
        log.add(labelid);
        
        textid = new JTextField();
        textid.setBounds(30, 180, 200, 30);
        log.add(textid);
        
        labelpass = new JLabel("Password");
        labelpass.setBounds(30, 220, 100, 30);
        log.add(labelpass);
        
        passlogin = new JPasswordField();
        passlogin.setBounds(30, 250, 200, 30);
        log.add(passlogin);
        
        loginbutton = new JButton("Login");
        loginbutton.setBounds(80, 310, 100, 40);
        loginbutton.setBackground(Color.white);
        log.add(loginbutton);
        
        daftar = new JLabel("Daftar Akun");
        daftar.setFont(new Font("Times New Roman", Font.BOLD, 30));
        daftar.setBounds(430, 50, 250, 100);
        log.add(daftar);
        
        labeliddftar = new JLabel("ID");
        labeliddftar.setBounds(400, 150, 30, 30);
        log.add(labeliddftar);
        
        textiddaftar = new JTextField();
        textiddaftar.setBounds(400, 180, 200, 30);
        log.add(textiddaftar);
        
        labelnamadaftar = new JLabel("Nama");
        labelnamadaftar.setBounds(400, 220, 200, 30);
        log.add(labelnamadaftar);
        
        textnamadaftar = new JTextField();
        textnamadaftar.setBounds(400, 250, 200, 30);
        log.add(textnamadaftar);
        
        labelpassdaftar = new JLabel("Password");
        labelpassdaftar.setBounds(400, 290, 200, 30);
        log.add(labelpassdaftar);
        
        passdaftar = new JPasswordField();
        passdaftar.setBounds(400, 320, 200, 30);
        log.add(passdaftar);
        
        daftarbutton = new JButton("Daftar");
        daftarbutton.setBounds(450, 380, 100, 40);
        daftarbutton.setBackground(Color.white);
        log.add(daftarbutton);
        
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        log.setVisible(true);
        log.setLocationRelativeTo(null);        
        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    if (penjual.login(textid.getText(), passlogin.getText()) == false){
                        JOptionPane.showMessageDialog(null, "ID Atau Password Salah", 
                            "information", JOptionPane.INFORMATION_MESSAGE);
                    }else {
                       Revie07175_PendataanGUI a = new Revie07175_PendataanGUI();
                       log.dispose();
                    }      
            }
        });
        daftarbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    penjual.Daftar(textiddaftar.getText(), textnamadaftar.getText(),passdaftar.getText());
                    kosong(); 
                    JOptionPane.showMessageDialog(null, "Daftar Berhasil", 
                            "information", JOptionPane.INFORMATION_MESSAGE);       
            }
        });
    }
    public void kosong(){
        textiddaftar.setText(null);
        textnamadaftar.setText(null);
        passdaftar.setText(null);
    }       }
