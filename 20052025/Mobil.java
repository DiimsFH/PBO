/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2401083004;

/**
 *
 * @author Dimas Sigma
 * 26 - May - 2026
 */
public class Mobil extends Kendaraan {
    
    protected String bahanBakar;
    protected int kapasitasMesin;
    
    public Mobil(){
        super();
    }
    
    public void setBahanBakar(String bahanBakar){
        this.bahanBakar=bahanBakar;
    }
    
    public String getBahanBakar(){
        return bahanBakar;
    }
    
    public void setKapasitasMesin(int kapasitasMesin){
        this.kapasitasMesin=kapasitasMesin;
    }
    
    public int getKapasitasMesin(){
        return kapasitasMesin;
    }
}
