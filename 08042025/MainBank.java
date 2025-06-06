/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum08042025D;



/**
 *
 * @author KingFinix
 */

import java.util.Scanner;


public class MainBank {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        char ulang = 0;

        // Nasabah yang sudah ada dari awal

        bank.tambahNasabah("Andriyana", "Tralelo", new Tabungan(1000));

        bank.tambahNasabah("Robert", "Phi Mon", new Tabungan(5000));

        do {
            System.out.println("=====Program Data -Data Nasabah Bank=====");
            System.out.println("1.Menampilkan Nasabah dan jumlahnya");
            System.out.println("2. Dafrat Nasabah");
            System.out.println("3. Deposito");
            System.out.println("4. Ambil Uang");
            System.out.println("5. Transfer");
            System.out.println("6. Exit");
            System.out.println("==========================================");
            System.out.print("Program yang ingin dipilih: ");
            int program = scanner.nextInt();
            scanner.nextLine();

            switch (program) {
                case 1: {
                    // Hanya menampilkan Nama nama Nasabah ddan jumlahnya
                    System.out.println("\nDaftar Nasabah:");
                    for (int i = 0; i < bank.getJumlahNasabah(); i++) {
                        System.out.println("Nama: " + bank.getNasabah(i).toString());

                    }
                    System.out.println("Jumlah Nasabah: " + bank.getJumlahNasabah());
                }break;

                 case 2: {
                    // Untuk memudahkan mencari data si nasabah
                    System.out.println("\nDaftar Nasabah:");
                    for (int i = 0; i < bank.getJumlahNasabah(); i++) {
                        System.out.println("Nama: " + bank.getNasabah(i).toString());
                        System.out.println("Nomor Indeks: " + i);
                    }
                 }break;

                 case 3:{
                    System.out.print("\nMasukkan indeks nasabah untuk menyimpan uang: ");
                    int indeksNasabah = scanner.nextInt();
                    if (indeksNasabah < bank.getJumlahNasabah() && indeksNasabah >= 0) 
                    {
                        System.out.println(bank.getNasabah(indeksNasabah).toString());
                        System.out.println("Nomor Indeks: " + indeksNasabah);
                        System.out.print("Masukkan jumlah uang yang akan disimpan: ");
                        int jumlahSimpan = scanner.nextInt();
                        Tabungan tabunganNasabah = bank.getNasabah(indeksNasabah).getTabungan();
                        if (tabunganNasabah != null) {
                            tabunganNasabah.simpanUang(jumlahSimpan);
                            System.out.println(bank.getNasabah(indeksNasabah).toString());
                        } else {
                            System.out.println("Nasabah tidak memiliki tabungan.");
                        }
                    } 
                    else 
                    {   
                       int indeksPenerima = scanner.nextInt();
                       System.out.println("Nasabah dengan nomor : "+indeksPenerima+" Tidak ditemukan");
                    }
                 }break;
                case 4: {
                    // Menarik uang
                    System.out.print("\nMasukkan indeks nasabah untuk mengambil uang: ");
                    int indeksNasabah = scanner.nextInt();
                    if (indeksNasabah < bank.getJumlahNasabah() && indeksNasabah >= 0) {
                        System.out.println(bank.getNasabah(indeksNasabah).toString());
                        System.out.println("Nomor Indeks: " + indeksNasabah);
                        System.out.print("Masukkan jumlah uang yang akan diambil: ");
                        int jumlahAmbil = scanner.nextInt();
                        Tabungan tabunganNasabah = bank.getNasabah(indeksNasabah).getTabungan();
                        if (tabunganNasabah != null) {
                            tabunganNasabah.ambilUang(jumlahAmbil);
                            System.out.println(bank.getNasabah(indeksNasabah).toString());
                        } else {
                            System.out.println("Nasabah tidak memiliki tabungan.");
                        }
                    } else {
                       int indeksPenerima = scanner.nextInt();
                       System.out.println("Nasabah dengan nomor  Tidak ditemukan");
                    }
                }break;

                case 5: {
                    // Mentrafserr  uang
                    System.out.print("\nMasukkan indeks nasabah pengirim: ");
                    int indeksPengirim = scanner.nextInt();
                    System.out.println(bank.getNasabah(indeksPengirim).toString());
                    System.out.println("Nomor Indeks: " + indeksPengirim);
                    System.out.print("Masukkan indeks nasabah penerima: ");
                    int indeksPenerima = scanner.nextInt();
                    System.out.println(bank.getNasabah(indeksPenerima).toString());
                    System.out.println("Nomor Indeks: " + indeksPenerima);

                    if (indeksPengirim < bank.getJumlahNasabah() && indeksPengirim >= 0 &&
                        indeksPenerima < bank.getJumlahNasabah() && indeksPenerima >= 0) {

                        Tabungan tabunganPengirim = bank.getNasabah(indeksPengirim).getTabungan();
                        Tabungan tabunganPenerima = bank.getNasabah(indeksPenerima).getTabungan();

                        if (tabunganPengirim != null) {
                            System.out.print("Masukkan jumlah uang yang akan ditransfer: ");
                            int jumlahTransfer = scanner.nextInt();

                            if (tabunganPengirim.transfer(tabunganPenerima, jumlahTransfer)) {
                                System.out.println("Transfer berhasil!");
                                System.out.println(bank.getNasabah(indeksPengirim).toString());
                                System.out.println("Nomor Indeks: " + indeksPengirim);
                                System.out.println(bank.getNasabah(indeksPenerima).toString());
                                System.out.println("Nomor Indeks: " + indeksPenerima);
                            } else {
                                System.out.println("Transfer gagal! Saldo tidak cukup.");
                            }
                        } else {
                            System.out.println("Salah satu nasabah tidak memiliki tabungan.");
                        }
                    } else {
                        System.out.println("Nasabah Tidak ditemukan");
                    }
                }break;
                
                 case 6: {
                    System.out.println("Terima kasih telah menggunakan layanan kami");
                } break;
            }
            
            
                 
                
                if ( program > 0 && program< 6) 
                {
                    System.out.print("\nApakah ingin melakukan pengechekan kembali? Yes/No (Y/N) ");
                    ulang = scanner.next().charAt(0);
                    System.out.println("\n");
                 }   
                 else 
                {
                    ulang = 'n';
                    System.out.println("Terima kasih telah menggunakan layanan kami");
                    System.out.println("\n Semoga hari mu beruntung");
                    System.out.println("--------- :D -----------");
                 }
            
        }while (ulang == 'y' || ulang == 'Y');
      }
   }
    

