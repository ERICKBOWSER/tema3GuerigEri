/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author guerig
 */
public class ElQueYoQuiera {
    public static void main(String[] args) {
        /*
        Realiza un programa que imprima por consola los 35 primeros términos de la siguiente serie:
        FO = 0;
        F1 = 1;
        Fn = Fn-1 + Fn-2;
        Ejemplo: F2-1 + F2-2 = F1 + F0 = 0 + 1 = 1
        */
        final int F0 = 0, F1 = 1;
        int fn, f2 = 1;
        
        System.out.println((F0 + F1));
        
        for(int i = 0; i <= 35; i++){
            fn = f2 - 1 + f2 - 2;
            f2 = fn;
            System.out.println(fn);
            
        }
    }
}
