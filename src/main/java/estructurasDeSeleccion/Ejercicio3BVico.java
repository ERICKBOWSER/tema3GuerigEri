/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasDeSeleccion;

import javax.swing.JOptionPane;

/**
 *
 * @author guerig
 */
public class Ejercicio3BVico {
    public static void main(String[] args) {
        
        // Costes mano de obra
        final double MANO_OBRA_M1_T1 = 0.15, MANO_OBRA_M2_T2_P1 = 0.22;
        
        // Margen de beneficio por unidad
        final double BENEFICIO_M1_M2_P1 = 0.5, BENEFICIO_T1_T2 = 0.65; // 50%, 65%
        
        // Beneficio final
        final double BENEFICIO_VENTAS = 2500;
        
        // Rango precio materia prima
        final double LIMITE_INFERIOR = 0.1, LIMITE_SUPERIOR = 1;
        
        // Variables
        double precioMateriaPrima = 0, costeProduccion = 0;
        
        // Entradas
        // Código del dulce
        // Precio materia prima para producir
        String codigoProducto = JOptionPane.showInputDialog("Introduce el código: ");
        codigoProducto = codigoProducto.toUpperCase();
        
        // Si el código es valido
        if(codigoProducto.equals("M1") ||
                codigoProducto.equals("M2") ||
                codigoProducto.equals("T1") ||
                codigoProducto.equals("T2") ||
                codigoProducto.equals("P1")){    
            
            // Código del algoritmo
            precioMateriaPrima = Double.parseDouble(
                JOptionPane.showInputDialog("Introduce el precio materia prima"));
            System.out.println("El precio es " + precioMateriaPrima);
            
            // Si el precio no esta entre 0,1 y 1 terminar
            if(precioMateriaPrima >= LIMITE_INFERIOR || precioMateriaPrima <= LIMITE_SUPERIOR){
                // Sigo el algoritmo
                
                // Si el código es m1 o t1 mano de obra 0.15
                // Resto 0.22
                if(codigoProducto.equals("M1") || codigoProducto.equals("P1")){
                    costeProduccion = precioMateriaPrima + MANO_OBRA_M1_T1;
                }
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Precio no válido");
            }
            
            
            
            
            
            
        } else{
            JOptionPane.showInputDialog(null, "Código incorrecto");
        }
        
        // La siguiente estructuras es quevaliente al if else anterior
        
        
        // Algoritmo
        
        // Salidas
        // Coste producción unitario
        // Precio venta unitario
        // Número de unidades 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
