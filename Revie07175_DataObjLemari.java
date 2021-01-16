package Data;

import Identitas.Revie07175_objLemari;
import java.util.ArrayList;

public class Revie07175_DataObjLemari implements Revie07175_Interface{
    static ArrayList<Revie07175_objLemari> ObjLemariArrayList;
    
    public Revie07175_DataObjLemari(){
        ObjLemariArrayList = new ArrayList<>();
    }
    
    public void tambahL(Revie07175_objLemari objLemari){
        ObjLemariArrayList.add(objLemari);
    }
    
    public void hapusL(String kode){
        ObjLemariArrayList.remove(cariData(kode));
    }
    
    public void updateL(String kode, String warna, String harga){
        if(cariData(kode) != -1){
           ObjLemariArrayList.get(cariData(kode)).setWarna(warna);
           ObjLemariArrayList.get(cariData(kode)).setHarga(harga);
        }
    }
        
    @Override
    public void view(){
        System.out.println("Daftar Lemari   : \n");
        for(Revie07175_objLemari objlemari : ObjLemariArrayList){
            System.out.println("no      : " + objlemari.getNo());
            System.out.println("nama    : " + objlemari.getNamaBarang());
            System.out.println("jenis   : " + objlemari.getJenis());
            System.out.println("ukuran  : " + objlemari.getUkuran());
            System.out.println("warna   : " + objlemari.getWarna());
            System.out.println("bahan   : " + objlemari.getBahan());
            System.out.println("banyak  : " + objlemari.getBanyak());
            System.out.println("harga   : " + objlemari.getHarga() + "\n\n");
            
        }
    }
    
    private int cariData(String kode){
        int index = -1;
        for(int i=0; i<ObjLemariArrayList.size(); i++){
            if(kode.equals(ObjLemariArrayList.get(i).getNo())){
                index = i;
            }
        }
        return index;
    }
    
    public ArrayList<Revie07175_objLemari> alldataL(){
        return ObjLemariArrayList;
    }
}
