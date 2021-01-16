package Controller;

import Identitas.Revie07175_objLemari;
import javax.swing.table.DefaultTableModel;

public class Revie07175_ObjLemariController {

    public Revie07175_ObjLemariController() {
    } 
    public void tambahL(String no, String namaBarang, String jenis, String ukuran, 
            String bahan, String warna, String banyak, String harga){
        Revie07175_AllObjectModel.ObjLemari.tambahL(new Revie07175_objLemari(no, namaBarang, jenis, 
                ukuran, bahan, warna, banyak, harga));
    }
    public void HapusL(String kode){
        Revie07175_AllObjectModel.ObjLemari.hapusL(kode);
    }
    public void UpdateL(String kode, String warna, String harga){
        Revie07175_AllObjectModel.ObjLemari.updateL(kode, warna, harga);
    }
    public void viewL(){
        Revie07175_AllObjectModel.ObjLemari.view();
    }
    
    public DefaultTableModel daftarL(){
        DefaultTableModel dtmdaftarL = new DefaultTableModel();
        Object[] kolom ={"Kode", "Nama", "Jenis", "Ukuran", "Bahan", 
            "Warna", "Banyak", "Harga"};
        dtmdaftarL.setColumnIdentifiers(kolom);
        int size = Revie07175_AllObjectModel.ObjLemari.alldataL().size();
        for(int i=0; i<size; i++){

        Object [] data = new Object[8];
        data[0] = Revie07175_AllObjectModel.ObjLemari.alldataL().get(i).getNo();
        data[1] = Revie07175_AllObjectModel.ObjLemari.alldataL().get(i).getNamaBarang();
        data[2] = Revie07175_AllObjectModel.ObjLemari.alldataL().get(i).getJenis();
        data[3] = Revie07175_AllObjectModel.ObjLemari.alldataL().get(i).getUkuran();
        data[4] = Revie07175_AllObjectModel.ObjLemari.alldataL().get(i).getBahan();
        data[5] = Revie07175_AllObjectModel.ObjLemari.alldataL().get(i).getWarna();
        data[6] = Revie07175_AllObjectModel.ObjLemari.alldataL().get(i).getBanyak();
        data[7] = Revie07175_AllObjectModel.ObjLemari.alldataL().get(i).getHarga();
        dtmdaftarL.addRow(data);
        }
        return dtmdaftarL;
    }
}
