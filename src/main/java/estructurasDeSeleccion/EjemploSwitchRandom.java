/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasDeSeleccion;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guerig
 */
public class EjemploSwitchRandom {
    public static void main(String[] args) {
        /*
        Si el usuario introduce A, B o C se debe guardar un aleatorio entre 1y 10
        */
        // Un aleatorio entre 1 y 10
        
        
        // Si introduce D guardaa aleatorio entre 11 y 25
        
        
        // Si introduce E, aleatorio entre 26 y 33
        
        
        // En otro caso, aleatorio entre 34 y 100
        
        // Creo un objeto de tipo Random llamado generador 
        // Se crea con el contructor de la clase Random()
        // Con el new se reserva la memoria
        Random generador = new Random();
        
        
        Scanner teclado = new Scanner(System.in);
        int numAleatorio;
        
        // Genera un número aleatorio dentro del rango de los enteros
        numAleatorio = generador.nextInt();
        
        // Genera un número aleatorio entre 0 y 9
        
        System.out.println("El número es: " + numAleatorio);
        
        System.out.println("Introduce una letra (A, B, C, D, E)");
        //String letraString = teclado.nextLine();
        
        
        
        
        // Genera un número aleatorio dentro del rango de los enteros
        numAleatorio = generador.nextInt(19)+1;
        
        // Genera en un rango dado 12 - 18
        
        numAleatorio = generador.nextInt(numAleatorio) + 12;
       
        System.out.println("Introduce una letra (A, B, C, D, E)");
        String letraString = teclado.nextLine();
        System.out.println("La letra es: "+ letraString);
        
        switch (letraString) {
            case "A", "B, C":
                    // Entre 1 y 10
                    numAleatorio = generador.nextInt(10) + 1;
                    break;
            case "D":
                
                // Entre 1 y 10
                    numAleatorio = generador.nextInt(25 - 11 + 1) + 11;
                    break;
                    
            case "E":
                // Entre 1 y 10
                    numAleatorio = generador.nextInt(25 - 11 + 1) + 11;
                    break;
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
