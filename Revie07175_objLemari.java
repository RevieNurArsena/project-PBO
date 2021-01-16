package Identitas;

public class Revie07175_objLemari extends Revie07175_Mabel{
    private String namaBarang, jenis, ukuran, bahan, warna, banyak;
    
    public Revie07175_objLemari (String no, String namaBarang, String jenis, String ukuran, 
            String bahan, String warna, String banyak, String harga){
        
        super.setNamaBarang(namaBarang);
        this.jenis = jenis;
        this.ukuran = ukuran;
        this.warna = warna;
        this.bahan = bahan;
        this.banyak = banyak;
        super.setNo(no);
        super.setHarga(harga);
    }

    public String getJenis(){
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public String getUkuran(){
        return ukuran;
    }
    public void setUkuran(String ukuran){
        this.ukuran = ukuran;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public String getBahan(){
        return bahan;
    }
    public void setBahan(String bahan){
        this.bahan = bahan;
    }
    public String getBanyak(){
        return banyak;
    }
    public void setBanyak(String banyak){
        this.banyak = banyak;
    }
    
    @Override
    public String getNo(){
        return no;
    }
       
    @Override
    public String getHarga(){
        return harga;
    }
}
