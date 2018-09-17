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
public class Soal1 {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Nilai panjang jari jari : ");
        int r = masukan.nextInt();
        double phi = 3.14;
        System.out.println("=======================");
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.println("=======================");
        System.out.println("Luas Permukaan Balok = "+(4*phi*r*r));
    }
}
