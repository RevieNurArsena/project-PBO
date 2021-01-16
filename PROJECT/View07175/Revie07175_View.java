package View07175;

import Controller.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Revie07175_View {
    JFrame logV = new JFrame();
    JLabel judul , lemarilabel, mejalabel;
    JTable tableviewL, tableviewM;
    JScrollPane scrollL, scrollM;
    JButton backbutton;
    private static Revie07175_ObjLemariController ObjLemari = 
            new Revie07175_ObjLemariController();
    private static Revie07175_ObjMejaController ObjMeja = 
            new Revie07175_ObjMejaController();
    
    public Revie07175_View() {
        logV.setSize(700, 630);
        logV.setLayout(null);
        logV.getContentPane().setBackground(Color.BLUE);
        
        judul = new JLabel("VIEW DATA");
        judul.setBounds(270, 10, 600, 50);
        judul.setFont(new Font("Times New Roman", Font.BOLD, 30));
        logV.add(judul);
        
        lemarilabel = new JLabel("Data Lemari : ");
        lemarilabel.setBounds(30, 60, 100, 50);
        logV.add(lemarilabel);
        
        tableviewL = new JTable();
        scrollL = new JScrollPane(tableviewL);
        scrollL.setBounds(30, 100, 620, 150);
        tableviewL.setModel(ObjLemari.daftarL());
        logV.add(scrollL);
        
        mejalabel = new JLabel("Data Meja : ");
        mejalabel.setBounds(30, 260, 100, 50);
        logV.add(mejalabel);
        
        tableviewM = new JTable();
        scrollM = new JScrollPane(tableviewM);
        scrollM.setBounds(30, 300, 620, 150);
        tableviewM.setModel(ObjMeja.daftarM());
        logV.add(scrollM);
        
        backbutton = new JButton("Back");
        backbutton.setBounds(30, 530, 100, 40);
        backbutton.setBackground(Color.white);
        logV.add(backbutton);
        
        logV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logV.setVisible(true);
        logV.setLocationRelativeTo(null);
        
        backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Revie07175_PendataanGUI a = new Revie07175_PendataanGUI();
                logV.dispose();
            }
        });
    }
}
