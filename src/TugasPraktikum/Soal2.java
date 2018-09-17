/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author Tarishaulia
 */
public class Soal2 {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        double suhu = 78.0 ;
        System.out.println("Pilihan Mengubah Satuan Suhu");
        System.out.println("1.Reamur");
        System.out.println("2.Farenheit");
        System.out.println("3.Kelvin");
        System.out.print("Masukkan pilihan : ");
        int pil = masukan.nextInt();
        switch (pil){
            case 1 :
                System.out.println("Reamur = "+(suhu*4/5)+" R");
                break;
            case 2 :
                System.out.println("Farenheit = "+((suhu*9/5)+32)+" F");
                break;
            case 3 :
                System.out.println("Kelvin = "+(suhu+273)+" K");
                break;
        }
    }
}
