/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasDeSeleccion;

import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Ej04 {
    public static void main(String[] args) {
        // Reescribe el programa del ejercicio 1 usando el operador ternario ?:
        String resultado;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu edad: ");
        
        int edad = scanner.nextInt();
        
        resultado = (edad >= 18) ? "Es mayor de edad" : "No es mayor de edad";
        
        System.out.println(resultado);
        
        
        
        
    }
}
