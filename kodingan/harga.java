/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesramen;

/**
 *
 * @author Asus
 */
public class harga extends menu {
    private int hargaMakan, jumlahPesan;
    
   harga (int hargaMakan, int jumlahPesan) {
        this.hargaMakan=hargaMakan;
        this.jumlahPesan=jumlahPesan;
        
    }
    public int getHargaMakan(){
        return hargaMakan;
        
    }
    public int getJumlahPesan(){
        return jumlahPesan;
    }
    
}
