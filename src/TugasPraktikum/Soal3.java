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
public class Soal3 {
    public static void main(String[]args){
        //deklarasi variabel
        String nama, alamatdimalang, tempatlahir, mottohidup, jeniskelamin;
        int nis, tanggallahir;
        
        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //Tampilan output ke user
        System.out.println("### DATA SISWA SMK TELKOM MALANG ###");
        System.out.print("Nama : ");
        nama = keyboard.next();
        System.out.print("NIS : ");
        nis = keyboard.nextInt();
        System.out.print("Tempat lahir : ");
        tempatlahir = keyboard.next();
        System.out.print("Tanggal lahir : ");
        tanggallahir = keyboard.nextInt();
        System.out.print("Jenis Kelamin : ");
        jeniskelamin = keyboard.next();
        System.out.print("Alamat di Malang : ");
        alamatdimalang = keyboard.next();
        System.out.print("Motto Hidup : ");
        mottohidup = keyboard.next();
        
        
        //menampilkan apa yang sudah simpan di variabel
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("Nama : " + nama);
        System.out.println("NIS : " + nis);
        System.out.println("Tempat lahir : " + tempatlahir);
        System.out.println("Tanggal lahir : " + tanggallahir);
        System.out.println("Jenis Kelamin : " + jeniskelamin);
        System.out.println("Alamat di Malang : " + alamatdimalang);
        System.out.println("Motto Hidup : " + mottohidup);
    }
}
