
package belajar_inheritance;

public class persegiPanjang extends bangunDatar {
    float panjang;
    float lebar;
    
    @Override
    float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);
        return luas;
        
    }
    @Override
    float keliling(){
        float kll = 2*panjang + 2*lebar;
        System.out.println("Keliling persegi panjang: " + kll);
        return kll;
        
    }
    
}
