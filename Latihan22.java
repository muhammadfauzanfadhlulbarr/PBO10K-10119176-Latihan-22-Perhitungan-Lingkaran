
import java.util.Scanner;

import javax.xml.crypto.Data;
/**
 * Latihan17
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program : Perhitungan lingkaran
 */
public class Latihan22 {
    public static void main(String[] args) {
        int diameter;
        double phi,jari2,luas,keliling,pangkat;
        System.out.println("======Perhitungan Lingkaran======" );
        System.out.print("Masukan nilai diameter lingkaran :" );
        try {
            diameter = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.println("Nilai Diameter tidak sesuai" );
            System.out.print("Masukan nilai diameter lingkaran :" );
            diameter = new Scanner(System.in).nextInt();
        }
        phi = 3.14;
        pangkat=2;
    
        if (diameter>=0) {
            jari2 = diameter/2;
            System.out.println("Jari-jari lingkaran :" + jari2 + "cm");
            luas=phi*Math.pow(jari2, pangkat);
            System.out.println("Luas lingkaran :" + luas + "cm");
            keliling=phi * diameter;
            System.out.println("Keliling lingkaran :" + keliling + "cm");
        }

    }
}
