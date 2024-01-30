
package belajar_inheritance;

import java.util.Scanner;


public class Belajar_inheritance {

        public static void main(String[] args) {
            
            Scanner scanner = new Scanner (System.in);
            
            bangunDatar bangunDatar = new bangunDatar();
        
            Persegi Persegi = new Persegi();
            System.out.print("Masukkan panjang sisi persegi: ");
            Persegi.sisi = scanner.nextFloat();
            
            Lingkaran Lingkaran = new Lingkaran ();
            System.out.print("Maukkan r lingkaran: ");
            Lingkaran.r =scanner.nextFloat() ;
            
            persegiPanjang persegiPanjang = new persegiPanjang();
            System.out.print("Masukkan panjang persegi panjang: ");
            persegiPanjang.panjang = scanner.nextFloat();
            System.out.print("masukkan lebar persegi panjang: ");
            persegiPanjang.lebar = scanner.nextFloat();
            
            Segitiga Segitiga = new Segitiga ();
            System.out.print("Masukkan alas segitiga: ");
            Segitiga.alas = scanner.nextFloat() ;
            System.out.print("Masukkan tinggi segitiga: ");
            Segitiga.tinggi = scanner.nextFloat() ;
            
            bangunDatar.luas();
            bangunDatar.keliling();
            
            Persegi.luas();
            Persegi.keliling();
            
            Lingkaran.luas ();
            Lingkaran.keliling();
            
            persegiPanjang.luas();
            persegiPanjang.keliling();
            
            Segitiga.luas();
            Segitiga.keliling();
    }
    
}
