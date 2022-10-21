/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author guerig
 */
public class EjemploWhile {
    public static void main(String[] args) {
        
        // Inicialización de la variable de control
        int numero = 0;
        
        // Condición del bucle
        // Mientras la condición del buble sea true se repite el código entre { }
        while(numero < 10){
            // SIEMPRE DENTRO DEL BUCLE, hay que actualizar la variable de control
            System.out.println(numero);
            numero++;
        }
        
        
        // Del 20 al 0
        
        int numero2 = 20;
        
        while(numero2 != 0){
            System.out.println(numero2);
            numero2--;
        }
        
        
        int numero3 = 50;
        while(numero3 <= 70){
            System.out.println(numero3);
            numero3 = numero3 + 3;
        }
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inroduce un número: (100 - 200)");
        int num = teclado.nextInt();
        // Pedir al usuario el número si no está entre 100 y 200
        while(num < 100 || num > 200){
            System.out.println("Te has equivocado, por favor introduce de nuevo: ");
            num = teclado.nextInt();
        }
        
    }
}
