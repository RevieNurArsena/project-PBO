package View07175;

import Controller.*;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;
import javax.swing.*;

public class Revie07175_Update {
    JFrame logU = new JFrame();
    JLabel judul, lemarilabel, mejalabel, kodelabel, jenislabel, warnalabel, hargalabel;
    JTextField kodetext, jenistext, warnatext, hargatext;
    JTable tableviewL, tableviewM;
    JScrollPane scrollL, scrollM;
    JButton backbutton, updatebutton, nextbutton;
    private static String jenisL = "lemari";
    private static String jenisM = "meja";
    private static Revie07175_ObjLemariController ObjLemari = 
            new Revie07175_ObjLemariController();
    private static Revie07175_ObjMejaController ObjMeja = 
            new Revie07175_ObjMejaController();

    public Revie07175_Update() {
        logU.setSize(700, 630);
        logU.setLayout(null);
        logU.getContentPane().setBackground(Color.BLUE);
        
        judul = new JLabel("UPDATE DATA");
        judul.setBounds(240, 10, 600, 50);
        judul.setFont(new Font("Times New Roman", Font.BOLD, 30));
        logU.add(judul);
        
        lemarilabel = new JLabel("Data Lemari : ");
        lemarilabel.setBounds(30, 60, 100, 50);
        logU.add(lemarilabel);
        
        tableviewL = new JTable();
        scrollL = new JScrollPane(tableviewL);
        scrollL.setBounds(30, 100, 620, 100);
        tableviewL.setModel(ObjLemari.daftarL());
        logU.add(scrollL);
        
        mejalabel = new JLabel("Data Meja : ");
        mejalabel.setBounds(30, 200, 100, 50);
        logU.add(mejalabel);
        
        tableviewM = new JTable();
        scrollM = new JScrollPane(tableviewM);
        scrollM.setBounds(30, 240, 620, 100);
        tableviewM.setModel(ObjMeja.daftarM());
        logU.add(scrollM);
        
        kodelabel = new JLabel("Kode");
        kodelabel.setBounds(80, 350, 100, 50);
        logU.add(kodelabel);
        
        kodetext = new JTextField();
        kodetext.setBounds(80, 390, 200, 30);
        logU.add(kodetext);
        
        jenislabel = new JLabel("Jenis");
        jenislabel.setBounds(80, 410, 100, 50);
        logU.add(jenislabel);
        
        jenistext = new JTextField();
        jenistext.setBounds(80, 450, 200, 30);
        logU.add(jenistext);
        
        warnalabel = new JLabel("Warna");
        warnalabel.setBounds(400, 350, 100, 50);
        logU.add(warnalabel);
        
        warnatext = new JTextField();
        warnatext.setBounds(400, 390, 200, 30);
        logU.add(warnatext);
        
        hargalabel = new JLabel("Harga");
        hargalabel.setBounds(400, 410, 100, 50);
        logU.add(hargalabel);
        
        hargatext = new JTextField();
        hargatext.setBounds(400, 450, 200, 30);
        logU.add(hargatext);
        
        updatebutton = new JButton("Update");
        updatebutton.setBounds(290, 500, 100, 40);
        updatebutton.setBackground(Color.white);
        logU.add(updatebutton);
        
        backbutton = new JButton("Back");
        backbutton.setBounds(30, 530, 100, 40);
        backbutton.setBackground(Color.white);
        logU.add(backbutton);
        
        nextbutton = new JButton("Next");
        nextbutton.setBounds(530, 530, 100, 40);
        nextbutton.setBackground(Color.white);
        logU.add(nextbutton);
        
        logU.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logU.setVisible(true);
        logU.setLocationRelativeTo(null);
        
        backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Revie07175_PendataanGUI a = new Revie07175_PendataanGUI();
                logU.dispose();
            }
        });
        
        nextbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Revie07175_PendataanGUI a = new Revie07175_PendataanGUI();
                logU.dispose();
            }
        });
        
        updatebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                if(jenistext.getText().equals(jenisL)){
                    ObjLemari.UpdateL(kodetext.getText(), warnatext.getText(), 
                            hargatext.getText());
                    logU.dispose();
                    Revie07175_Update u = new Revie07175_Update();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Update", 
                    "information", JOptionPane.INFORMATION_MESSAGE);
                }else if(jenisM.equals(jenistext.getText())){
                    ObjMeja.UpdateM(kodetext.getText(), warnatext.getText(), 
                            hargatext.getText());
                    logU.dispose();
                    Revie07175_Update u = new Revie07175_Update();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Update", 
                    "information", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    throw new InputMismatchException();
                }
                }catch(InputMismatchException e){
                    JOptionPane.showMessageDialog(null, "Jenis Barang Tidak Tersedia", 
                            "information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
