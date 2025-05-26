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

public class SepedaListrik extends Sepeda{
    protected int kecepatanMaks;
    protected int jarakTempuh;
    
    public SepedaListrik(){
        super();
    }
    
    public SepedaListrik(int kecepatanMaks, int jarakTempuh){
        this.kecepatanMaks=kecepatanMaks;
        this.jarakTempuh=jarakTempuh;
    }
    
    public void setKecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks=kecepatanMaks;
    }
    
    public int getKecepatanMaks(){
        return kecepatanMaks;
    }
    
    public void setJarakTempuh(int jarakTempuh){
        this.jarakTempuh=jarakTempuh;
    }
    
    public int getJarakTempuh(){
        return jarakTempuh;
    }
}
