/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author guerig
 */
public class paresNones {
    /*
    1.  Jugar
    2.  Elegir "Pares" / "Nones"
    3.  Elegir nº de dedoos
    4.  ¿Ganador?    
    */
    public static void main(String[] args) {
        String opcion, paresNones;
        
        do{
        
            // JUGAR
            opcion = comprobarSiJuega();
            if(!opcion.equalsIgnoreCase("salir")){
                
                // ELEGIR "PARES" / "NONES"
                paresNones = comprobarSiJuega();
                
                if(paresNones.equals("salir")){
                    break;
                }
                
                // ELEGIR Nº DE DEDOS
                

            } else{
                opcion = "salir";
            }
        
        }while(opcion.equalsIgnoreCase("jugar"));
        
    }
    
    // JUGAR
    public static String deseaJugar(){
        String opcion;
        String opcionJugar = """
                             ---------------------------------
                                        Pares o Nones
                             ---------------------------------                           
                                1. Jugar
                                2. Salir
                             """;
        // Preguntamos al usuario si quiere jugar
        opcion = JOptionPane.showInputDialog(opcionJugar);
        System.out.println(opcion);
        
        // Devolvemos el dato enviado por el usuario
        return opcion;
    }
    
    public static boolean filtrarSiJuega(String opcion){
        return (opcion.equalsIgnoreCase("jugar")|| opcion.equalsIgnoreCase("salir"));
    }
    
    public static String comprobarSiJuega(){
        String elegirOpcion= "";
        
        do{
            elegirOpcion = deseaJugar();
        }while(!filtrarSiJuega(elegirOpcion));
        
        return elegirOpcion;
    }
    
    // ELEGIR PARES O NONES
    public static String paresNones(){
        String opcion;
        String paresNones = """
                            Elige una opcion:
                                Pares
                                Nones                            
                            """;
                
        return opcion = JOptionPane.showInputDialog(paresNones);
        
    }
    
    public static boolean filtrarParesNones(String paresNones){
        return(paresNones.equalsIgnoreCase("pares") ||
                paresNones.equalsIgnoreCase("nones") ||
                paresNones.equalsIgnoreCase("salir"));
    }
    
    public static String comprobarEleccion(){
        String eleccionParesNones = "";
        
        do{
            eleccionParesNones = paresNones();
        }while(!filtrarParesNones(eleccionParesNones));
        
        return eleccionParesNones;
    }
    
    public static int numeroDedos(){
        int dedos = 0;
        
        do{
            dedos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de dedos"));          
            
        }while(dedos <= 10);     
        
        return dedos;
    }
    
}
