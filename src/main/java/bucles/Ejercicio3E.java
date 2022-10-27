/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author guerig
 */
public class Ejercicio3E {
    public static void main(String[] args) {
        /*
        El programa debe tener dos opciones, la primera es realizar los cálculos para ver la viabilidad de los productos y 
        la segunda debe ser “terminar”. Para terminar el programa el usuario debe escribir la palabra Salir (ignorando mayúsculas 
        y minúsculas). En caso de escribir otra cosa, el programa volverá al menú principal.
        El programa debe filtrar los códigos de los productos. En caso de introducir un código inexistente, el programa preguntará 
        de nuevo por el código a introducir. Si el usuario escribe Salir (ignorando mayúsculas y minúsculas) el programa termina.
        También se debe filtrar el precio de la materia prima. En caso de que el usuario introduzca un número fuera del rango, el 
        programa debe solicitarlo de nuevo.
        En este ejercicio también se debe solicitar el coste de la mano de obra para ese producto (siempre entre 0.5€ y 0.9€). 
        En caso de error al introducir este dato, el programa solicitará de nuevo esta información.
        El resto de restricciones son las mismas que en el ejercicio 3B, pero intenta aplicar las posibles correcciones del 
        ejercicio que hicimos en clase, para que tu código no sea tan repetitivo y sea más legible.
        */
        
        String texto = """
                       Elige una opción:
                       1. Realizar los calculos
                       2. Terminar
                       """;
        
        String codigo = """
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
                       
        do{
            String opcion = JOptionPane.showInputDialog(texto);
            int resultado = Integer.parseInt(opcion);
            if(resultado == 1){
                do{
                    String codigoRespuesta = JOptionPane.showInputDialog(codigo);
                    codigoRespuesta = codigoRespuesta.toUpperCase();
                    
                    if(codigoRespuesta == "M1" ||
                            codigoRespuesta == "P1" ||
                            codigoRespuesta == "T1" ||
                            codigoRespuesta == "T2" ||
                            codigoRespuesta == "M2"){
                        
                    }
                }while();
            }
        }while(opcion != "salir");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
