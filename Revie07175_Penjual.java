package Identitas;
public class Revie07175_Penjual {
    private String id, nama, password;
    
    public Revie07175_Penjual(String id, String nama, String pass){
        this.id = id;
        this.nama = nama;
        this.password = pass;
    }

    public String getId(){
        return this.id;
    }    
    public void setId(String id){
        this.id = id;
    }    
    public String getNama(){
        return this.nama;
    }    
    public void setNama(String nama){
        this.nama = nama;
    }    
    public String getPass(){
        return this.password;
    }    
    public void setPass(String pass){
        this.password = pass;
    }
}
