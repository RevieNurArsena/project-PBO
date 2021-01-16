package Controller;

import Identitas.Revie07175_Penjual;

public class Revie07175_PenjualController implements Revie07175_ControllerInterface{

    public Revie07175_PenjualController(){
        
    }
    public void Daftar(String id, String nama, String pass){
        Revie07175_AllObjectModel.penjual.daftar(new Revie07175_Penjual(id, nama, pass));
    }
    
    @Override
    public boolean login(String id, String pass){
        return Revie07175_AllObjectModel.penjual.login(id, pass);    
    }   
}
