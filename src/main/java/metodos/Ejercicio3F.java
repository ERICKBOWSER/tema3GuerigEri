/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author guerig
 */
public class Ejercicio3F {
    /*
    1   Método mostrarMenuInicial
    2   Método leerCodigos
    3   Método filtrarCodigos
    4   Método leerMateriaPrima
    5   Método filtrarMateriaPrima
    6   Método leerManoObra
    7   Método filtrarManoObra
    8   Calcular costeProduccion
    9   Calcular precioUnitario
    10  Calcular unidadesBeneficio
    */
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String resultado;
        do{
            // for some reason no se puede colocar un sout
            resultado = JOptionPane.showInputDialog(mostrarMenuInicial());
            
            if(resultado == "1"){
                JOptionPane.showInputDialog(leerCodigos());
            }
            
        }while(!(resultado.equalsIgnoreCase("1") ||
                resultado.equalsIgnoreCase("2") ||
                resultado.equalsIgnoreCase("salir")));
    }
    
    public static String mostrarMenuInicial(){
       
        String texto = """
                       Elige una opción:
                        1. Realizar los calculos
                        2. Terminar""";
        return texto;
    }
    
    public static String leerCodigos(){
        String codigos = """
                       ---------------------------------------
                             Fábrica de dulces navideños
                       ---------------------------------------
                       Selecciona uno:
                        M1 Mantecados de Limón
                        P1 Polvorones
                        T1 Turrón de chocolate
                        T2 Turrón clásico
                        M2 Mazapanes  
                       """;
        
        return codigos;
    }
    /*
    public static String filtrarCodigos(String codigos){
        return (codigos.equalsIgnoreCase("m1") ||
                codigos.equalsIgnoreCase("p1") ||
                codigos.equalsIgnoreCase("t1") ||
                codigos.equalsIgnoreCase("t2") ||
                codigos.equalsIgnoreCase("m2") ||
                codigos.equalsIgnoreCase("salir"));
    }*/
    
}
