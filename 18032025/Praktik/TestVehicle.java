/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum18032025;

/**
 *
 * ------------------------------------------TANPA ENAKLAPSULASKI------------------------------------
 * @author KingFinix
 */
public class TestVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //buat vehicle dengan beban maksimal 10.000kg
        System.out.println("Kendaraan 1. Beban Maksimal 10.000Kg");
        Vehicle kendaraan1 = new Vehicle(10000); 
        
        // menambahkan beberapa beban (load)
        System.out.println("Menambahkan beban 1 (500Kg)");
        kendaraan1.load = kendaraan1.load + 500;
        System.out.println("Menambahkan beban 2 (250Kg)");
        kendaraan1.load = kendaraan1.load + 250;
        System.out.println("Menambahkan beban 3 (5000Kg)");
        kendaraan1.load = kendaraan1.load + 5000;
        System.out.println("Menambahkan beban 4 (4000Kg)");
        kendaraan1.load = kendaraan1.load + 4000;
        System.out.println("Menambahkan beban 5 (350Kg)");
        kendaraan1.load = kendaraan1.load + 350;
        
        System.out.println("Beban kendaraan saat ini"+kendaraan1.getLoad()+"Kg");
       
    }
    
}
