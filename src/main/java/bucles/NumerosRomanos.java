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
public class NumerosRomanos {
    public static void main(String[] args) {
        /*
        Implementa un programa que muestre tres opciones.
        La primera será la opción que represente un número romano a partir de su número decimal (Entre 1 y 10).
        La segunda debe contar las vocales que tiene un nombre.
        La tercera será salir.
        
        El programa debe ejercutarse hasta que el usuario decida La tercera será salir. Se puede usar Scanner y/o JOptionPane.
        
        */
        int numero = 0, dato;
        
        Scanner teclado = new Scanner(System.in);
        String texto = """
                           Elige una opción:
                           1 Números romanos
                           2 Vocales
                           3 Salir                          
                           """;
        
        do {
            System.out.println(texto);
            numero = teclado.nextInt();
            
            if(numero == 1){
                System.out.println("Introduce un número entre el 1 y el 10: ");
                dato = teclado.nextInt();
                
                switch(dato){
                    case 1:
                        System.out.println("I");
                        numero = 0;
                        break;
                    case 2:
                        System.out.println("II");
                        numero = 0;
                        break;
                    case 3:
                        System.out.println("III");
                        numero = 0;
                        break;
                    case 4:
                        System.out.println("IV");
                        numero = 0;
                        break;
                    case 5:
                        System.out.println("V");
                        numero = 0;
                        break;
                    case 6:
                        System.out.println("VI");
                        numero = 0;
                        break;
                    case 7:
                        System.out.println("VII");
                        numero = 0;
                        break;
                    case 8:
                        System.out.println("VIII");
                        numero = 0;
                        break;
                    case 9:
                        System.out.println("IX");
                        numero = 0;
                        break;
                    case 10:
                        System.out.println("X");
                        numero = 0;
                        break;
                }
            }else if(numero == 2){
                String vocales = "aeiou";
                
                // Si se ha usado el Scanner para leer numeros, hay que limpiarlo para meter texto
                teclado.nextLine(); //Limpiar el buffer
                System.out.println("Escribe un nombre: ");
                String nombre = teclado.nextLine();
                
                int contador = 0;              
                for(int i = 0; i <= vocales.length(); i++){
                   System.out.println(vocales.length());
                   char resultado = nombre.charAt(i);
                   if(resultado == 'a'){
                       contador++;
                   }
                   
                }
                System.out.println(contador);
            }else{
                System.out.println("Fin del programa");
            }
        }while(numero != 3);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
