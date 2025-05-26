/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Sepeda extends Kendaraan{
    protected String jmlSadel;
    protected int jmlGir;
    
    public Sepeda(){
        super();
    }
    
    public Sepeda(String jmlSadel, int jmlGir){
        this.jmlSadel=jmlSadel;
        this.jmlGir=jmlGir;
    }
    
    public void setJmlSadel(String jmlSadel){
        this.jmlSadel=jmlSadel;
    }
    
    public String getJmlSadel(){
        return jmlSadel;
    }
    
    public void setJmlGir(int jmlGir){
        this.jmlGir=jmlGir;
    }
    
    public int getJmlGir(){
        return jmlGir;
    }
}

public class Truk extends Mobil{
    protected int muatanMaks;
    
    public Truk(){
        super();
    }
    
    public void setMuatanMaks(int muatanMaks){
        this.muatanMaks=muatanMaks;
    }
    
    public int getMuatanMaks(){
        return muatanMaks;
    }
}
