package Data;

import Identitas.Revie07175_Penjual;
import java.util.ArrayList;

public class Revie07175_DataPenjual {
    private ArrayList<Revie07175_Penjual> penjual;
    
    public Revie07175_DataPenjual(){
        penjual = new ArrayList<>();
    }
    
    public void daftar(Revie07175_Penjual objPenjual){
        penjual.add(objPenjual);
    }
    
    public boolean login(String id, String pass){
        boolean isVerified = false;
        for(int i=0; i<penjual.size(); i++){
            if(id.equals(penjual.get(i).getId())&& pass.equals(penjual.get(i).getPass())){
                isVerified = true;
            }
        }
       return isVerified; 
    }  
}