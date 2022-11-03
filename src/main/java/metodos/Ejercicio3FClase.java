/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author ERICK
 */
public class Ejercicio3FClase {

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

    public static void main(String[] args) {
        String opcion = "", codigoProducto = "";
        do{
            opcion = pedirOpcion(); // Opción es "salir" o "calcular"
            
            if(!opcion.equalsIgnoreCase("salir")){
                
                // Pedir y filrar código del producto
                codigoProducto = pedirCodigoProducto(); // Código m1, p1, t1
                // Si código producto no es salir, realiza los cálculos
                if(!codigoProducto.equalsIgnoreCase("salir")){
                    // Solicitar y filtrar la materia prima
                    
                    // Solicitar y filtrar mano de obra
                    
                    // Calcular coste de producción
                    
                    // Calcular unidades hasta llegar al beneficio
                    
                    // Mostrar toda la información
                    
                } else{ // Si es salir
                    opcion = "salir";
                }
            }
            
        }while(!opcion.equalsIgnoreCase("calcular"));
        
    }
    
    public static String pedirOpcion(){
        String opcion;
        do{
            opcion = mostrarMenu();
        }while(!esOpcionMenuInicialValida(opcion));
        
        return opcion;
    }
    
    // Métodos para mostrar códigos de productos y filtrarlos hasta que sean correctos    
    public static String pedirCodigoProducto(){
        String codigo;
        do{
            codigo = MostrarMenuCodigos();
        }while(!esCodigoProductoValido(codigo));
        
        return codigo;
    }
    
    public static boolean esCodigoProductoValido(String codigo){
        return (codigo.equalsIgnoreCase("m1") || 
                codigo.equalsIgnoreCase("p1") ||
                codigo.equalsIgnoreCase("t1") ||
                codigo.equalsIgnoreCase("salir"));
    }
    
    public static String mostrarMenuCodigos(){
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
        return texto;
    }
    
    public static String mostrarMenu(){
        String texto = """
                       1.   Calcular
                       2.   Salir                       
                       """;
        String opcion = JOptionPane.showInputDialog(texto);
        
        return texto;
    }
    
    
   public static boolean esOpcionMenuInicialValida(String opcion){
       return opcion.equalsIgnoreCase("salir") ||
               opcion.equalsIgnoreCase("calcular");
   }

    
}
