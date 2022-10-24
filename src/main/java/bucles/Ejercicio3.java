/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author ERICK
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60 - 120, etc. 
        No se introducen valores por teclado.
        */
        
        int contador = 0, serie = 15;
        while(contador <= 25){
            
            System.out.println(contador + ".- " + serie);    
            
            serie = serie * 2;
            
            contador++;
        }   
        
        
        
        
        
        
        
    }
}
