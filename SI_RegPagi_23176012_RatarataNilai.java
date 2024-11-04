/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pertemuan6;

import java.util.Scanner;

/**
 *  Nama      : MOHAMMAD FAJAR SUBECHI
 *  NIM       : 23176012
 *  Prodi     : Sistem Infprmasi
 *  Deskripsi : program ini untuk menghitung rata-rata nilai mahasiswa dari jumlah banyaknya mahasiswa
 * @author ACER
 */
public class SI_RegPagi_23176012_RatarataNilai {
public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        int jumlahMahasiswa = inputan.nextInt();
        
        int totalNilai = 0;
        for(int i=1; i<=jumlahMahasiswa; i++){
            System.out.print("Nilai mahasiswa ke-" +i+ " : ");
            int nilai = inputan.nextInt();   
            
            if(nilai < 1 || nilai > 100){
                System.out.println("Masukan nilai dengan benar (1-100)");
                i--;
                continue;
            }
            totalNilai += nilai;
        }
        
        double rataRata = (double) totalNilai / jumlahMahasiswa;
        
        System.out.println("\nMaka rata-rata nilainya adalah " +rataRata);                
        System.out.println("Developed by : Danish Fadlan Azam");    
        
    }
    
}
