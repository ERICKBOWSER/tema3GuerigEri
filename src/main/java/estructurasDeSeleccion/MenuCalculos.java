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
public class MenuCalculos {
 
 
    public static void main(String[] args) {
 
        /*
        Implementa y completa el siguiente programa. Ten en cuenta que cuando se entre en cada 
        una de las opciones (1,2 o 3) el programa realice su función. Esto es, si se selecciona 
        la opción 1, el programa debe entrar en la parte de calcular el área de un cuadrado y 
        debe solicitar los dos lados y mostrar el resultado. Así con el resto de opciones.
        */
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        double areaCuadrado, bTriangulo, hTriangulo, rCirculo;
 
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");
 
        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();
 
        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            
            // Metodo para la entrada de datos
            Scanner teclado = new Scanner(System.in);
            System.out.println("Escribe uno de los lados: ");
            
            // Almacenamos datos
            areaCuadrado = teclado.nextDouble();
            
            // Calculamos el area elevando el lado al cuadrado y mostramos los datos
            System.out.println("El resultado es: " + Math.pow(areaCuadrado, 2));
        } 
	  else { 
		if (opcion == 2) {
            	System.out.println("Ha seleccionado calcular el área de un triángulo...");
                
                Scanner base = new Scanner(System.in);
                System.out.println("Escribe la base: ");
                
                bTriangulo = base.nextDouble();
                
                Scanner altura = new Scanner(System.in);
                System.out.println("Escribe la altura: ");
                
                hTriangulo = altura.nextDouble();
                
                System.out.println("El resultado es: "+ (bTriangulo * hTriangulo)/2);
             
        	} 
		else { 
			if (opcion == 3) {
            		System.out.println("Ha seleccionado calcular el área de un círculo...");
                        
                        Scanner radio = new Scanner(System.in);
                        System.out.println("Escribe el radio: ");

                        rCirculo = radio.nextDouble();

                        System.out.println("El resultado es: "+ Math.PI * Math.pow(rCirculo, 2));
                        
        		} 
			else {
            		System.out.println("Ha seleccionado terminar");
       		}     
   		}
	  }
    }
}