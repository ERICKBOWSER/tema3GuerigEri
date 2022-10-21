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
public class Ejercicio3B {
    public static void main(String[] args) {
        /*
        Ya se van acercando las Navidades y en muchos stands de algunos supermercados se empiezan a ver 
        los surtidos de dulces navideños que tanto gustan a unos y que otros no pueden soportar. 
        
        La fábrica de dulces "La Esteponera Turronera" produce algunos de estos manjares con los siguientes 
        códigos: M1 (Mantecados de Limón), P1 (Polvorones), T1 (Turrón de chocolate), T2 (Turrón clásico) y 
        M2 (Mazapanes).
        
        Cada especialidad tiene un coste de producción que se calcula según la materia prima gastada y la mano 
        de obra empleada en producir una unidad (coste producción = materia prima + mano de obra). El coste de 
        la mano de obra para producir unidades con código M1 y T1 supone 0.15€; para los que tienen código M2, 
        T2 y P1, supone 0.22€.
        
        Además, cada producto tiene un precio de venta que se calcula en función del coste de producción.
        Hay que tener en cuenta lo siguiente:
        
            Artículos M1, M2 y P1. Precio de venta unitario = coste de producción + 50 % del coste de producción
            Resto de artículos. Precio de venta unitario = coste de producción + 65 % del coste de producción
        
        La fábrica necesita un programa que realice algunos cálculos para ver si es rentable vender un tipo de 
        producto. El programa debe solicitar el código de un dulce (si el código no es válido, el programa 
        termina informando de que no existe el código introducido) y el precio de la materia prima que se gasta 
        en fabricar una unidad de ese tipo (siempre entre 0.1€ y 1€, en otro caso el programa terminará indicando 
        que el precio de la materia prima no es correcto). Se debe mostrar el coste de producción unitario y 
        precio de venta unitario. Además debe calcular y mostrar el número de unidades a producir para que haya 
        un beneficio de al menos 2500€.
        
        Todas las entradas y salidas de datos deben hacerse usando JOptionPane. Limita la salida a dos decimales 
        en los casos necesarios.                
        */
          
        // Almacenamos los nombres de los datos 
        double cProduccion = 0, mPrima = 0, pUnitario = 0, unidadesAProducir = 0;
        
        // Coste de mano de obra
        final double M1_T1 = 0.15, M2_T2_P1 = 0.22;
        
        // Porcentajes
        final double PORCENTAJES_M1_M2_P1 = 0.5, PORCENTAJES_T1_T2 = 0.65;
        
        // Total final
        final double BENEFICIO_TOTAL = 2500;
        
        // Precios
        final double PRECIO_MINIMO = 0.1, PRECIO_MAXIMO = 1;
        
        String texto = """
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
        // Almacenamos el dato introducido por el usuario
        String tipoProducto = JOptionPane.showInputDialog(texto);
        tipoProducto = tipoProducto.toUpperCase();
        
        // Si el dato introducido coincide con alguna de las condicionales se ejecuta la instrucción
        if(tipoProducto.equals("M1")||
                tipoProducto.equals("M2") ||
                tipoProducto.equals("T1") ||
                tipoProducto.equals("T2") ||
                tipoProducto.equals("P1")){
            
            mPrima = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio: "));
            
            // Se ejecuta si el precio esta dentro de los limites
            if(mPrima >= PRECIO_MINIMO && mPrima <= PRECIO_MAXIMO){
                if(tipoProducto.equals("M1") || tipoProducto.equals("T1")){
                    
                    // Calculamos el coste de producción sumando la materia prima y la mano de obra
                    cProduccion = mPrima + M1_T1;
                    
                } else if(tipoProducto.equals("M2") || tipoProducto.equals("T2") || tipoProducto.equals("P1")){
                    cProduccion = mPrima + M2_T2_P1;
                    
                }
            } else{
                // Se ejecuta si el precio introducido supera los limites establecidos
                JOptionPane.showMessageDialog(null, "El precio introducido no es valido");
            }
            
            // Calcular el precio de venta unitario
            if(tipoProducto.equals("M1")||
                tipoProducto.equals("M2") ||
                tipoProducto.equals("P1")){
                
                pUnitario = cProduccion + (PORCENTAJES_M1_M2_P1 * cProduccion);
                  
            } else if(tipoProducto.equals("T1")||
                tipoProducto.equals("T2")){
                
                pUnitario = cProduccion + (PORCENTAJES_T1_T2 * cProduccion);    
            }
        }else{
            JOptionPane.showMessageDialog(null, "El precio de la materia prima no es correcto");       

        }
        
        // Calcular el número de unidades a producir del producto seleccionado para llegar a tener beneficios
        unidadesAProducir = BENEFICIO_TOTAL / (pUnitario - cProduccion);
        
        String resultadoFinal = """
                                -------------------------------------------------------
                                                    Resultado final
                                -------------------------------------------------------
                                
                                El coste de la producción es: %.2f €
                                El precio de venta unitario es: %.2f €
                                El número de unidades a producir es: %d
                                """.formatted(cProduccion, pUnitario, (int)Math.ceil(unidadesAProducir));
        
        JOptionPane.showMessageDialog(null, resultadoFinal);

    }
}
