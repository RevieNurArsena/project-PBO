package View07175;

import Controller.Revie07175_ObjLemariController;
import Controller.Revie07175_ObjMejaController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Revie07175_Tambah {
    JFrame logT = new JFrame();
    JLabel kodelabel, namalabel, jenislabel, ukuranlabel, bahanlabel, 
            warnalabel, banyaklabel, hargalabel, judul;
    JTextField kodetext, namatext, jenistext, ukurantext, bahantext, 
            warnatext, banyaktext, hargatext;
    JButton tambahbutton, backbutton, nextbutton;
    private static Revie07175_ObjLemariController objLemari = new Revie07175_ObjLemariController();
    private static Revie07175_ObjMejaController objMeja = new Revie07175_ObjMejaController();
    private static String jenisL = "lemari";
    private static String jenisM = "meja"; 
    private static DefaultTableModel model = new DefaultTableModel();
    
    public Revie07175_Tambah(){
        logT.setSize(700,630);
        logT.setLayout(null);
        logT.getContentPane().setBackground(Color.BLUE);
        
        judul = new JLabel("SILAHKAN TAMBAH BARANG");
        judul.setBounds(120, 10, 600, 50);
        judul.setFont(new Font("Times New Roman", Font.BOLD, 30));
        logT.add(judul);
        
        kodelabel = new JLabel("Kode");
        kodelabel.setBounds(115, 60, 100, 50);
        logT.add(kodelabel);
        
        kodetext = new JTextField();
        kodetext.setBounds(115, 100, 200, 30);
        logT.add(kodetext);
        
        namalabel = new JLabel("Nama");
        namalabel.setBounds(115, 140, 100, 50);
        logT.add(namalabel);
        
        namatext = new JTextField();
        namatext.setBounds(115, 180, 200, 30);
        logT.add(namatext);
        
        jenislabel = new JLabel("Jenis");
        jenislabel.setBounds(115, 220, 100, 50);
        logT.add(jenislabel);
        
        jenistext = new JTextField();
        jenistext.setBounds(115, 260, 200, 30);
        logT.add(jenistext);
        
        ukuranlabel = new JLabel("Ukuran");
        ukuranlabel.setBounds(115, 300, 100, 50);
        logT.add(ukuranlabel);
        
        ukurantext = new JTextField();
        ukurantext.setBounds(115, 340, 200, 30);
        logT.add(ukurantext);
        
        bahanlabel = new JLabel("Bahan");
        bahanlabel.setBounds(370, 60, 100, 50);
        logT.add(bahanlabel);
        
        bahantext = new JTextField();
        bahantext.setBounds(370, 100, 200, 30);
        logT.add(bahantext);
        
        warnalabel = new JLabel("Warna");
        warnalabel.setBounds(370, 140, 100, 50);
        logT.add(warnalabel);
        
        warnatext = new JTextField();
        warnatext.setBounds(370, 180, 200, 30);
        logT.add(warnatext);
        
        banyaklabel = new JLabel("Banyak");
        banyaklabel.setBounds(370, 220, 100, 50);
        logT.add(banyaklabel);
        
        banyaktext = new JTextField();
        banyaktext.setBounds(370, 260, 200, 30);
        logT.add(banyaktext);
        
        hargalabel = new JLabel("Harga");
        hargalabel.setBounds(370, 300, 100, 50);
        logT.add(hargalabel);
        
        hargatext = new JTextField();
        hargatext.setBounds(370, 340, 200, 30);
        logT.add(hargatext);
        
        tambahbutton = new JButton("Tambah");
        tambahbutton.setBounds(295, 410, 100, 40);
        tambahbutton.setBackground(Color.white);
        logT.add(tambahbutton);
       
        backbutton = new JButton("Back");
        backbutton.setBounds(50, 530, 100, 40);
        backbutton.setBackground(Color.white);
        logT.add(backbutton);
        
        nextbutton = new JButton("Next");
        nextbutton.setBounds(530, 530, 100, 40);
        nextbutton.setBackground(Color.white);
        logT.add(nextbutton);
        
        logT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logT.setVisible(true);
        logT.setLocationRelativeTo(null);
        
        backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Revie07175_PendataanGUI a = new Revie07175_PendataanGUI();
                logT.dispose();
            }
        });
        
        nextbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Revie07175_PendataanGUI a = new Revie07175_PendataanGUI();
                logT.dispose();
            }
        });
        
        tambahbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                if(jenistext.getText().equals(jenisL)){
                    objLemari.tambahL(kodetext.getText(), namatext.getText()
                                , jenistext.getText(), ukurantext.getText(), 
                                bahantext.getText(), warnatext.getText(), 
                                banyaktext.getText(), hargatext.getText());
                    kosong();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Inputkan", 
                    "information", JOptionPane.INFORMATION_MESSAGE);
                }else if(jenisM.equals(jenistext.getText())){
                    objMeja.tambahM(kodetext.getText(), namatext.getText()
                                , jenistext.getText(), ukurantext.getText(), 
                                bahantext.getText(), warnatext.getText(), 
                                banyaktext.getText(), hargatext.getText());
                    kosong();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Inputkan", 
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
    public void kosong(){
        kodetext.setText(null);
        namatext.setText(null);
        jenistext.setText(null);
        ukurantext.setText(null);
        bahantext.setText(null);
        warnatext.setText(null);
        banyaktext.setText(null);
        hargatext.setText(null);
    }
}
