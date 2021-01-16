package Identitas;

public abstract class Revie07175_Mabel {
    protected String no, harga, namaBarang;
    
    public Revie07175_Mabel(String no, String harga, String namaBarang){
        this.no = no;
        this.namaBarang = namaBarang;
        this.harga = harga;
    }    
    public Revie07175_Mabel(){
        
    }
    public abstract String getNo();
    
    public void setNo(String no){
        this.no = no;
    }
    public String getNamaBarang(){
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }    
    public abstract String getHarga();
    
    public void setHarga(String harga){
        this.harga = harga;
    }   
}
