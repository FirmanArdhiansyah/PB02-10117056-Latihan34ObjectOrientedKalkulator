
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nama     : Firman Ardhiansyah
 *         Kelas    : IF-2 (10117056)
 *         NIM      : 10117056
 * Deskripsi Program : operasi kabatakusi(kali bagi tambah kurang sisa)
 * dengan dua operand yang diinputkan melalui keyboard
 */
public class main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kal.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kal.value2 = scn.nextDouble();

        //format dua digit di belakang koma
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : " + kal.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kal.kurangBiangan());
        System.out.println("Hasil Perkalian : " + kal.kaliBilangan());
        System.out.println("Hasil Pembagian : " + df.format(kal.bagiBilangan()));
        System.out.println("Hasil Sisa : " + kal.sisaBilangan());

    }
}
