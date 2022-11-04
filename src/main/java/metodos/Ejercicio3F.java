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
    public static String codigos;
    public static void main(String[] args) {
        String opcion = "", resultadoFinal;
        boolean codigoFiltrado;
        double mPrima, manoObra, cProduccion, pUnitario, unidadesAProducir;
        
        // Total final
        final double BENEFICIO_TOTAL = 2500;
        
        do{
            // for some reason no se puede colocar un sout
            opcion = mostrarMenuInicial();
            
            if(!opcion.equalsIgnoreCase("salir")){
                
                // PEDIR CÓDIGOS
                /*
                Esto ejecuta los métodos:
                
                    leerCodigos() para mostrar el mensaje
                    filtrarCodigos() para realizar la comprobación
                */
                codigos = pedirCodigos();
                System.out.println("dato de la variable codigos: " + codigos);
                
                // Si el código que se pasa es salir termina el programa
                if(codigos.equalsIgnoreCase("salir")){
                    break;
                }
                
                codigoFiltrado = filtrarCodigos(codigos);
                System.out.println(codigoFiltrado);
                
                // LEER MATERIA PRIMA
                mPrima = leerMateriaPrima();
                System.out.println(mPrima);
                
                // LEER MANO DE OBRA                
                manoObra = leerManoObra();
                System.out.println(manoObra);
                
                // COSTE DE PRODUCCIÓN
                cProduccion = mPrima + manoObra;
                
                // CALCULAR EL PRECIO UNITARIO
                pUnitario = calcularPrecioUnitario(cProduccion, codigos);
                
                // CALCULAR UNIDADES BENEFICIO
                unidadesAProducir = BENEFICIO_TOTAL / (pUnitario - cProduccion);
                
                // MOSTRAR RESULTADO
                JOptionPane.showConfirmDialog(null, mostrarResultado(cProduccion, pUnitario, unidadesAProducir));
                
            } else{
                opcion = "salir"; // cambiamos el valor de la variable
            }
            
        }while(opcion.equalsIgnoreCase("calcular"));
    }
    
    // MÉNU DE INICIO
    public static String mostrarMenuInicial(){
        String opcion; // Preguntar porque hace falta volver a definir la variable dentro del método || Puede que sea porque están en diferentes métodos
        String texto = """
                       Elige una opción:
                        1. Calcular
                        2. Salir""";
        
        opcion = JOptionPane.showInputDialog(texto);
        System.out.println(opcion);
        return opcion;
    }
    
    // LECTURA DE CÓDIGOS
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
        String opcion = JOptionPane.showInputDialog(codigos);
        return opcion;
    }

    // FILTRADO DE CÓDIGOS
    public static boolean filtrarCodigos(String codigos){
        
        // Suposición: al hacer una comparación, el valor que se devuelve tiene que ser boolean
        return (codigos.equalsIgnoreCase("m1") ||
                codigos.equalsIgnoreCase("p1") ||
                codigos.equalsIgnoreCase("t1") ||
                codigos.equalsIgnoreCase("t2") ||
                codigos.equalsIgnoreCase("m2") ||
                codigos.equalsIgnoreCase("salir"));
    }
    
    // ALMACENAR CÓDIGOS
    public static String pedirCodigos(){
        
        String codigos;
        
        do{
            codigos = leerCodigos(); // Muestra el mensaje de los códigos disponibles
            
            System.out.println(codigos);
        }while(!filtrarCodigos(codigos)); // mientras el código que pasa el usuario no devuelva true se sigue ejecutando
        
        return codigos;
    }
    
    // LEER MATERÍA PRIMA
    public static double leerMateriaPrima(){
        
        // Precios
        final double PRECIO_MINIMO = 0.1, PRECIO_MAXIMO = 1;
        
        // Almacena el valor de la materia prima
        double mPrima = 8;
        
        do{
            try{
                mPrima = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de la materia prima (0.1 - 1): "));
            } catch(NumberFormatException nfe){
                
                /*
                IMPORTANTE: el showMessageDialog no se puede usar si se esta intentando almacenar su valor en una variable
                
                IMPORTANTE: el showConfirmDialog devuelve un 0 o 1
                
                */
                JOptionPane.showMessageDialog(null, "El precio introducido no es valido, vuelva a introducirlo (0.1 - 1): ");

            }    

        }while(mPrima < PRECIO_MINIMO || mPrima > PRECIO_MAXIMO);
        
        return mPrima;        
    }
    
    public static double leerManoObra(){
        // Calculamos el coste por mano de obra
        final double MIN_MANO_OBRA =0.5,MAX_MANO_OBRA = 0.9;
        
        // Almacena el valor de la mano de obra
        double manoObra = 8;
        do{
            try{
                manoObra = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de la mano de obra (0.5 - 0.9)"));
            } catch(NumberFormatException nfe){

                JOptionPane.showMessageDialog(null, "El precio introducido es erroneo, vuelva a introducirlo (0.5 - 0.9)");

            }    

        }while(manoObra < MIN_MANO_OBRA || manoObra > MAX_MANO_OBRA);
        
        return manoObra;
    }
    
    // CALCULAR EL PRECIO UNITARIO    
    public static double calcularPrecioUnitario(double cProduccion, String codigos){
        
         // Porcentajes
        final double PORCENTAJES_M1_M2_P1 = 0.5, PORCENTAJES_T1_T2 = 0.65;
        
        // Almacenar el precio unitario
        double pUnitario = 0;
        
        if (codigos.equalsIgnoreCase("M1") ||
            codigos.equalsIgnoreCase("M2") ||
            codigos.equalsIgnoreCase("P1")){
            
            pUnitario = cProduccion + (PORCENTAJES_M1_M2_P1 * cProduccion);
            
        } else if(codigos.equalsIgnoreCase("T1")||
                    codigos.equalsIgnoreCase("T2")){

            pUnitario = cProduccion + (PORCENTAJES_T1_T2 * cProduccion);    
        } 
        
        return pUnitario;
    }
    
    //MOSTRAR RESULTADO FINAL
    public static String mostrarResultado(double cProduccion, double pUnitario, double unidadesAProducir){
        String resultadoFinal = """
                                -------------------------------------------------------
                                                    Resultado final
                                -------------------------------------------------------

                                El coste de la producción es: %.2f €
                                El precio de venta unitario es: %.2f €
                                El número de unidades a producir es: %d
                                """.formatted(cProduccion, pUnitario, (int)Math.ceil(unidadesAProducir));

        return resultadoFinal;
    }
}
