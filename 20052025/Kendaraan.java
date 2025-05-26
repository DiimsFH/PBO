/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2401083004;

/**
 *
 * @author Dimas Sigma
 * 26 - May - 2025
 */
public class Kendaraan {
    protected int jmlRoda;
    protected String warna;
    
    public Kendaraan(){
    
    }
    
    public Kendaraan(int jmlRoda, String warna){
        this.jmlRoda=jmlRoda;
        this.warna=warna;
    }
    
    public void setJmlRoda(int jmlRoda){
        this.jmlRoda=jmlRoda;
    }
    
    public int getJmlRoda(){
        return jmlRoda;
    }
    
    public void setWarna(String warna){
        this.warna=warna;
    }
    
    public String getWarna(){
        return warna;
    }
}
