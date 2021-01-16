package Data;

import Identitas.Revie07175_objMeja;
import java.util.ArrayList;

public class Revie07175_DataObjMeja implements Revie07175_Interface{
    static ArrayList<Revie07175_objMeja> ObjMejaArrayList;
    
    public Revie07175_DataObjMeja(){
        ObjMejaArrayList = new ArrayList<>();
    }
    
    public void tambah(Revie07175_objMeja objMeja){
        ObjMejaArrayList.add(objMeja);
    }
    
    public void hapus(String kode){
        ObjMejaArrayList.remove(cariData(kode));
    }
    
    public void update(String kode, String warna, String harga){
        if(cariData(kode) != -1){
           ObjMejaArrayList.get(cariData(kode)).setWarna(warna);
           ObjMejaArrayList.get(cariData(kode)).setHarga(harga);
        }
    }
        
    @Override
    public void view(){
        System.out.println("Daftar Meja   : \n");
        for(Revie07175_objMeja objmeja : ObjMejaArrayList){
            System.out.println("no      : " + objmeja.getNo());
            System.out.println("nama    : " + objmeja.getNamaBarang());
            System.out.println("jenis   : " + objmeja.getJenis());
            System.out.println("ukuran  : " + objmeja.getUkuran());
            System.out.println("warna   : " + objmeja.getWarna());
            System.out.println("bahan   : " + objmeja.getBahan());
            System.out.println("banyak  : " + objmeja.getBanyak());
            System.out.println("harga   : " + objmeja.getHarga() + "\n\n");
            
        }
    }
    
    private int cariData(String kode){
        int index = -1;
        for(int i=0; i<ObjMejaArrayList.size(); i++){
            if(kode.equals(ObjMejaArrayList.get(i).getNo())){
                index = i;
            }
        }
        return index;
    }
    
    public ArrayList<Revie07175_objMeja> alldataM(){
        return ObjMejaArrayList;
    }
}

