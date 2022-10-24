
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guerig
 */
public class calculadoraSwitch {
    public static void main(String[] args) {
        
        double resultado = 0;
        
        double operando1 = Double.parseDouble(JOptionPane.
                showInputDialog("Introduce operando 1"));
        
        double operando2 = Double.parseDouble(JOptionPane.
                showInputDialog("Introduce operando 2"));
        
        String menu = """
                      ------------------------------
                               CALCULADORA
                      ------------------------------
                      1.- SUMAR
                      2.- RESTAR
                      3.- MULTIPLICAR
                      4.- DIVIDIR                      
                      """;
        String opcion = JOptionPane.showInputDialog(menu);
        /*
        Lógica de la aplicación
        Si es opción 1 --> sumar
        */
        if(opcion.equals("1")){
            resultado = operando1 + operando2;
            // // Si se usa el printf las concatenaciones tienen que ser con comas ","
            System.out.printf("El resultado es %.2f", resultado);
        }
        
        /*
        Lógica de la aplicación
        Si es opción 2 --> restar
        */
        if(opcion.equals("2")){
            resultado = operando1 - operando2;
            // // Si se usa el printf las concatenaciones tienen que ser con comas ","
            System.out.printf("El resultado es %.2f", resultado);
        }
        
        /*
        Lógica de la aplicación
        Si es opción 1 --> multiplicar
        */
        if(opcion.equals("3")){
            resultado = operando1 * operando2;
            // // Si se usa el printf las concatenaciones tienen que ser con comas ","
            System.out.printf("El resultado es %.2f", resultado);
        }
        
        /*
        Lógica de la aplicación
        Si es opción 1 --> dividir
        */
        if(opcion.equals("4")){
            resultado = operando1 / operando2;
            // // Si se usa el printf las concatenaciones tienen que ser con comas ","
            System.out.printf("El resultado es %.2f", resultado);
        }
        
        // v3
        /*
        Lógica de la aplicación
        Si es opción 1 --> sumar
         */
        switch (opcion) {
            case "1":
                resultado = operando1 + operando2;
                // // Si se usa el printf las concatenaciones tienen que ser con comas ","
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "2":
                resultado = operando1 - operando2;
                // // Si se usa el printf las concatenaciones tienen que ser con comas ","
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "3":
                resultado = operando1 * operando2;
                // // Si se usa el printf las concatenaciones tienen que ser con comas ","
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "4":
                resultado = operando1 / operando2;
                // // Si se usa el printf las concatenaciones tienen que ser con comas ","
                System.out.printf("El resultado es %.2f", resultado);
                break;
            default:
                break;
        }
        
    }
}


















