
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guerig
 */
public class Tema3 {

    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce la letra a buscar: ");
        String letraBuscar = teclado.nextLine();
        
        /* 
        Si la letra esta contenida en el nombre 
        mostrar el numero de caracteres que tienes el nombre y la posicioon
        donde esta la letra
        En otro caso, mostrar si el número de letras del nombre es par o impar        
        */
        
        // contains busca el dato que se le especifique
//        boolean letraContenida = nombre.contains(letraBuscar);
//        
//        if(letraContenida){
//            // Parte del true

            
//        }
        
        // v1
        if(nombre.contains(letraBuscar)){
            // Tamaño de la cadena de texto
            System.out.println("El número de caracteres es " + nombre.length());
            
            // Posición donde está la letra
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posición es: " + posicion);
        } else{
            if(nombre.length() % 2 == 0){// Si el número de letras del String es par
                System.out.println("El número de caracteres es par");
            } else{
                System.out.println("El número de caracteres es impar");
            }
        }

        System.out.println("Adios");
        
        // v2
        if(nombre.contains(letraBuscar)){
            // Tamaño de la cadena de texto
            System.out.println("El número de caracteres es " + nombre.length());
            
            // Posición donde está la letra
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posición es: " + posicion);
        } else if(nombre.length() % 2 == 0){// Si el número de letras del String es par
                System.out.println("El número de caracteres es par");
            } else{
                System.out.println("El número de caracteres es impar");
        }
        
        // v3
        if(nombre.contains(letraBuscar)){
            // Tamaño de la cadena de texto
            System.out.println("El número de caracteres es " + nombre.length());
            
            // Posición donde está la letra
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posición es: " + posicion);
        } else{
            String textoResultado = (nombre.length() % 2 == 0)?
                    "El número de caracteres es par":
                    "El número de caracteres es impar";
        }

        System.out.println("Adios");
    }
}



















