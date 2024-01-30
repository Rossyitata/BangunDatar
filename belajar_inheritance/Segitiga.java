
package belajar_inheritance;

public class Segitiga extends bangunDatar{
    float alas;
    float tinggi;
    
    @Override
    float luas (){
      float luas = (alas * tinggi) * 1/2 ;
        System.out.println("Luas segitiga: " + luas);
        return luas;
    }
    
}
