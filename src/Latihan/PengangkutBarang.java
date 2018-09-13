/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author DANYAV
 */
public class PengangkutBarang {
     public static void main(String[] args) {
     System.out.println("###Dany Achmad Virgian###");
     System.out.println("### XRPL5 ###");
     System.out.println("### Absen 10 ###");
     Scanner input = new Scanner(System.in);
     System.out.print("Masukkan berat barang : ");
     int berat = input.nextInt();
     int total[] = new int[] {7,5,4,3,2};
     int bayar;
     int jumlah;
     int semua=0;
     
     for (int i = 0; i < total.length; i++){
         if(berat >= total[i]){
             jumlah = berat / total[i];
             berat = berat % total[i];
            if(total[i]==7) {
                    bayar = 10000*jumlah;
            }
            else if(total[i]==5) {
                    bayar = 7000*jumlah;
            }
            else if(total[i]==4) {
                    bayar = 5000*jumlah;
            }
            else if(total[i]==3){
                    bayar = 3000*jumlah;
            }
            else{
                bayar = 2000*jumlah;
            }
            semua += bayar;
            System.out.println(" Jumlah berat " + total[i] + " Kg " + " sebanyak " + jumlah+ " seharga " + bayar);
            }
            
            }
            System.out.println(" Total Harga : "+semua+" Rupiah "); 
}
         }
    
     

