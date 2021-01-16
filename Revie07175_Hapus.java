package View07175;

import Controller.*;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;
import javax.swing.*;

public class Revie07175_Hapus {
    JFrame logH = new JFrame();
    JLabel judul, lemarilabel, mejalabel, kodelabel, jenislabel;
    JTextField kodetext, jenistext;
    JTable tableviewL, tableviewM;
    JScrollPane scrollL, scrollM;
    JButton backbutton, hapusbutton, nextbutton;
    private static String jenisL = "lemari";
    private static String jenisM = "meja";
    private static Revie07175_ObjLemariController ObjLemari = 
            new Revie07175_ObjLemariController();
    private static Revie07175_ObjMejaController ObjMeja = 
            new Revie07175_ObjMejaController();
    
    public Revie07175_Hapus() {
        logH.setSize(700, 630);
        logH.setLayout(null);
        logH.getContentPane().setBackground(Color.BLUE);
        
        judul = new JLabel("HAPUS DATA");
        judul.setBounds(250, 10, 600, 50);
        judul.setFont(new Font("Times New Roman", Font.BOLD, 30));
        logH.add(judul);
        
        lemarilabel = new JLabel("Data Lemari : ");
        lemarilabel.setBounds(30, 60, 100, 50);
        logH.add(lemarilabel);
        
        tableviewL = new JTable();
        scrollL = new JScrollPane(tableviewL);
        scrollL.setBounds(30, 100, 620, 100);
        tableviewL.setModel(ObjLemari.daftarL());
        logH.add(scrollL);
        
        mejalabel = new JLabel("Data Meja : ");
        mejalabel.setBounds(30, 200, 100, 50);
        logH.add(mejalabel);
        
        tableviewM = new JTable();
        scrollM = new JScrollPane(tableviewM);
        scrollM.setBounds(30, 240, 620, 100);
        tableviewM.setModel(ObjMeja.daftarM());
        logH.add(scrollM);
        
        kodelabel = new JLabel("Kode");
        kodelabel.setBounds(30, 350, 100, 50);
        logH.add(kodelabel);
        
        kodetext = new JTextField();
        kodetext.setBounds(30, 390, 200, 30);
        logH.add(kodetext);
        
        jenislabel = new JLabel("Jenis");
        jenislabel.setBounds(30, 410, 100, 50);
        logH.add(jenislabel);
        
        jenistext = new JTextField();
        jenistext.setBounds(30, 450, 200, 30);
        logH.add(jenistext);
        
        hapusbutton = new JButton("Hapus");
        hapusbutton.setBounds(350, 410, 100, 40);
        hapusbutton.setBackground(Color.white);
        logH.add(hapusbutton);
        
        backbutton = new JButton("Back");
        backbutton.setBounds(30, 530, 100, 40);
        backbutton.setBackground(Color.white);
        logH.add(backbutton);
        
        nextbutton = new JButton("Next");
        nextbutton.setBounds(530, 530, 100, 40);
        nextbutton.setBackground(Color.white);
        logH.add(nextbutton);
        
        logH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logH.setVisible(true);
        logH.setLocationRelativeTo(null);
        
        backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Revie07175_PendataanGUI a = new Revie07175_PendataanGUI();
                logH.dispose();
            }
        });
        
        nextbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Revie07175_PendataanGUI a = new Revie07175_PendataanGUI();
                logH.dispose();
            }
        });
        
        hapusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                if(jenistext.getText().equals(jenisL)){
                    ObjLemari.HapusL(kodetext.getText());
                    logH.dispose();
                    Revie07175_Hapus h = new Revie07175_Hapus();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus", 
                    "information", JOptionPane.INFORMATION_MESSAGE);
                }else if(jenisM.equals(jenistext.getText())){
                    ObjMeja.HapusM(kodetext.getText());
                    logH.dispose();
                    Revie07175_Hapus h = new Revie07175_Hapus();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus", 
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
