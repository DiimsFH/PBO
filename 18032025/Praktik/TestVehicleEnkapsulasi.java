/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum18032025;

/**
 *
 * @author KingFinix200
 */
import java.util.Scanner;
public class TestVehicleEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kendaraan 1 Beban Max 10.000KG");
        VehicleEnkapsulasi kendaraan1 = new VehicleEnkapsulasi(10000);
        
        //menambhkan beban
        System.out.println("Menambahkan beban 1 (500KG)"+kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 2 (250KG)"+kendaraan1.addLoad(250));
        System.out.println("Menambahkan beban 3 (5000KG)"+kendaraan1.addLoad(5000));
        System.out.println("Menambahkan beban 4 (4000KG)"+kendaraan1.addLoad(4000));
        System.out.println("Menambahkan beban 5 (350KG)"+kendaraan1.addLoad(350));
        
        System.out.println("Tampilkan beban kendarran saat ini = "+kendaraan1.getLoad()+"Kg");
        
        //membuat object kendaraaan menggunakan constructor kosong/ default constructor
        Scanner in = new Scanner(System.in);
        System.out.println("Kendaraan 2. Beban Max belum ada.");
        VehicleEnkapsulasi kendaraan2= new VehicleEnkapsulasi();
        //set maxLoad menggunakan method setMaxLoad
        kendaraan2.setMaxLoad(15000);
        //isi beban pada kedaraan
        System.out.println("Masukkan beban maksimal kendaraan :");
        double bebanmax = in.nextDouble();
        kendaraan2.setMaxLoad(bebanmax);
         System.out.println("Masukkan beban kendaraan yang akan diletakkan di kendaraan 2 = ");
         double beban = in.nextDouble();
         while(kendaraan2.addLoad(beban)){
              System.out.println("Beban ditambahkan "+beban+"KG");
              beban = in.nextDouble();
         }
         if(!kendaraan2.addLoad(beban)){ //not true or False
            System.out.println("Beban kendaraan saat ini = "+kendaraan2.getLoad()+"KG");
             System.out.println("Beban akan berlebih Penambahan beban yang dibatalkan");
         }else
             System.out.println("Beban kendaraan saat ini = "+kendaraan2.getLoad()+"KG");
        //isi beban
         System.out.println("Tampilkan beban kendarran saat ini = "+kendaraan2.getLoad()+"Kg");
        
     }
    
}
