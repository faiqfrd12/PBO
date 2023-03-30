/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan4c;
import java.util.Scanner;
/**
 *
 * @author Farid
 */
public class Latihan4c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("-------input-------");
        System.out.print("Maukkan nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan prodi : ");
        String prodi = input.nextLine();
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        System.out.println("");
        System.out.println("---------output----------");
        System.out.println("Nama : "+nama);
        System.out.println("Prodi : "+prodi);
        System.out.println("Nilai : "+nilai);
        if(nilai >= 85 && nilai <= 100){
            System.out.println("Nilai huruf : A");
        }else if(nilai >= 70 && nilai < 85){
            System.out.println("Nilai huruf : B");
        }else if(nilai >= 60 && nilai < 70){
            System.out.println("Nilai huruf : C");
        }else if(nilai >= 50 && nilai < 60){
            System.out.println("Nilai huruf : D");
        }else if(nilai >= 0 && nilai < 50){
            System.out.println("Nilai huruf : E");
        }else{
            System.out.println("Nilai tidak valid");
        }
    }
}
