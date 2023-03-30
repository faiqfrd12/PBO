/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan4d;
import java.util.Scanner
/**
 *
 * @author Farid
 */
public class Latihan4d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("-------input-------");
        System.out.print("Maukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan no pelanggan : ");
        String noPelanggan = input.nextLine();
        System.out.print("Masukkan jumlah air yang dipakai (m3) : ");
        int air = input.nextInt();
        int biaya = 0;
        if(air <= 10)
        {
            biaya = air * 1000;
        }
        else if(air <= 20){
            biaya = 10000 + ((air - 10) * 2000);
        }
        else{
            biaya = 10000 + 20000 + ((air - 20) * 5000);
        }
        System.out.println("");
        System.out.println("---------output----------");
        System.out.println("Nama : "+nama);
        System.out.println("No pelanggan : "+noPelanggan);
        System.out.println("Pemakaian Air : "+air);
        System.out.println("Biaya pemakaian air : "+biaya);
    }
}
 