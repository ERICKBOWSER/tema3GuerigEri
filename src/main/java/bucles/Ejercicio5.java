/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Ejercicio5 {

    /*public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        while (x<=n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }*/
    //  Implementa el programa del ejercicio 2 usando un do – while.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, x;
        
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        
        do{
            System.out.println(x);
            System.out.println(" - ");
            x++;
        }while(x <= n);
        
    }

}
