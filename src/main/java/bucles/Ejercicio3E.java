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
        
        // Almacenamos los nombres de los datos 
        double cProduccion = 0, mPrima = 0, pUnitario = 0, unidadesAProducir = 0;
        
        // Porcentajes
        final double PORCENTAJES_M1_M2_P1 = 0.5, PORCENTAJES_T1_T2 = 0.65;
        
        // Total final
        final double BENEFICIO_TOTAL = 2500;
        
        // Precios
        final double PRECIO_MINIMO = 0.1, PRECIO_MAXIMO = 1;
        
        // Variable para terminar el programa
        String salir = "";
        
        // Menu principal
        String texto = """
                       Elige una opción:
                       1. Realizar los calculos
                       2. Terminar
                       """;
        
        // String para almacenar los codigos del producto
        String reintentarCodigo = """
                                   -----------------------------------------------------
                                                Fábrica de dulces navideños
                                   -----------------------------------------------------
                                  
                                   Selecciona uno: 
                                    M1 Mantecados de Limón
                                    P1 Polvorones
                                    T1 Turrón de chocolate
                                    T2 Turrón clásico
                                    M2 Mazapanes
                                  
                                  Si quieres cerrar el programa
                                  escribre "salir".
                                  """;
        // Variable para almacenar el resultado del código inroducido
        String resultado = "";
        
        // Almacena el código enviado
        String codigoRespuesta = "";
                       
        do{
            // Almacenamos el código del producto
            resultado = JOptionPane.showInputDialog(texto);
            
            switch(resultado){
                case "1":
                    
                    do{
                        // En caso de que el código sea erroneo                       
                        codigoRespuesta = JOptionPane.showInputDialog(reintentarCodigo);
                        codigoRespuesta = codigoRespuesta.toUpperCase();

                    // 
                    }while(!(codigoRespuesta.equals("M1") ||
                            codigoRespuesta.equals("P1") ||
                            codigoRespuesta.equals("T1") ||
                            codigoRespuesta.equals("T2") ||
                            codigoRespuesta.equals("M2") ||
                            codigoRespuesta.equalsIgnoreCase("SALIR"))
                            );
                    
                    // Condicional para que no se ejecute el código en caso de que el codigoRespuesta sea salir
                    if(!codigoRespuesta.equals("SALIR")){
                        
                    // Calculamos el precio de la materia prima 
                    mPrima = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de la materia prima (0.1 - 1): "));

                    // Se ejecuta si el precio esta dentro de los limites
                    while(mPrima < PRECIO_MINIMO || mPrima > PRECIO_MAXIMO){

                        mPrima = Double.parseDouble(JOptionPane.showInputDialog("El precio introducido no es valido, vuelva a introducirlo (0.1 - 1):  "));

                    }

                    // Calculamos el coste por mano de obra
                    final double MIN_MANO_OBRA =0.5,MAX_MANO_OBRA = 0.9;

                    Double manoObra = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de la mano de obra (0.5 - 0.9): "));

                    while(manoObra < MIN_MANO_OBRA || manoObra > MAX_MANO_OBRA){
                        manoObra = Double.parseDouble(JOptionPane.showInputDialog("El precio introducido es erroneo, vuelva a introducirlo (0.5 - 0.9): "));
                    }

                    // Calculamos el coste de producción sumando la materia prima y la mano de obra
                    cProduccion = mPrima + manoObra;                    
                    
                    // Calcular el precio de venta unitario
                    if(codigoRespuesta.equals("M1")||
                        codigoRespuesta.equals("M2") ||
                        codigoRespuesta.equals("P1")){

                        pUnitario = cProduccion + (PORCENTAJES_M1_M2_P1 * cProduccion);

                    } else if(codigoRespuesta.equals("T1")||
                        codigoRespuesta.equals("T2")){

                        pUnitario = cProduccion + (PORCENTAJES_T1_T2 * cProduccion);    
                    }                   
                    
                    System.out.println(resultado);
                    
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
                    break;
                case "2":
                    do{
                        // Variable para almacenar el String para terminar el programa
                        salir = JOptionPane.showInputDialog("Si quieres finalizar el programa escribe 'Salir': ");
                        salir = salir.toLowerCase();

                    }while(!salir.equals("salir"));    

                    // Mensaje de finalización del programa
                    JOptionPane.showMessageDialog(null, "El programa ha finalizado");
                break;
            }            
        }while(!(salir.equalsIgnoreCase("salir")) || resultado.equalsIgnoreCase("salir") || codigoRespuesta.equalsIgnoreCase("SALIR"));
        
        System.out.println("¡FINITE INCANTATEM!");
            
    }
}
