package Controller;

import Identitas.Revie07175_objMeja;
import javax.swing.table.DefaultTableModel;

public class Revie07175_ObjMejaController {
    public Revie07175_ObjMejaController() {
    } 
    public void tambahM(String no, String namaBarang, String jenis, String ukuran, 
            String bahan, String warna, String banyak, String harga){
        Revie07175_AllObjectModel.ObjMeja.tambah(new Revie07175_objMeja(no, namaBarang, jenis, 
                ukuran, bahan, warna, banyak, harga));
    }
    public void HapusM(String kode){
        Revie07175_AllObjectModel.ObjMeja.hapus(kode);
    }
    public void UpdateM(String kode, String warna, String harga){
        Revie07175_AllObjectModel.ObjMeja.update(kode, warna, harga);
    }
    public void viewM(){
        Revie07175_AllObjectModel.ObjMeja.view();
    }
    
    public DefaultTableModel daftarM(){
        DefaultTableModel dtmdaftarM = new DefaultTableModel();
        Object[] kolom ={"Kode", "Nama", "Jenis", "Ukuran", "Bahan", 
            "Warna", "Banyak", "Harga"};
        dtmdaftarM.setColumnIdentifiers(kolom);
        int size = Revie07175_AllObjectModel.ObjMeja.alldataM().size();
        for(int i=0; i<size; i++){

        Object [] data = new Object[8];
        data[0] = Revie07175_AllObjectModel.ObjMeja.alldataM().get(i).getNo();
        data[1] = Revie07175_AllObjectModel.ObjMeja.alldataM().get(i).getNamaBarang();
        data[2] = Revie07175_AllObjectModel.ObjMeja.alldataM().get(i).getJenis();
        data[3] = Revie07175_AllObjectModel.ObjMeja.alldataM().get(i).getUkuran();
        data[4] = Revie07175_AllObjectModel.ObjMeja.alldataM().get(i).getBahan();
        data[5] = Revie07175_AllObjectModel.ObjMeja.alldataM().get(i).getWarna();
        data[6] = Revie07175_AllObjectModel.ObjMeja.alldataM().get(i).getBanyak();
        data[7] = Revie07175_AllObjectModel.ObjMeja.alldataM().get(i).getHarga();
        dtmdaftarM.addRow(data);
        }
        return dtmdaftarM;
    }
}
