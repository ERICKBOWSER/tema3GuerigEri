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
        int dedos;
        
        do{
        
            // JUGAR
            opcion = comprobarSiJuega();
            if(!opcion.equalsIgnoreCase("salir")){
                
                // ELEGIR "PARES" / "NONES"
                paresNones = comprobarEleccion();
                
                if(paresNones.equals("salir")){
                    break;
                }
                
                // ELEGIR Nº DE DEDOS
                dedos = numeroDedos();

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
    
    //  Filtra los datos que son permitidos en el ménu principal
    public static boolean filtrarSiJuega(String opcion){
        return (opcion.equalsIgnoreCase("jugar")|| opcion.equalsIgnoreCase("salir"));
    }
    
    /*  Este método se repite hasta que se introduzca un dato dentro de los valores permitidos en el método 
        filtrarSiJuega */
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
                
        opcion = JOptionPane.showInputDialog(paresNones);

        System.out.println(opcion);

        return opcion;
        
    }
    
    //  Filtra los datos que son permitidos en el ménu de selección
    public static boolean filtrarParesNones(String paresNones){
        return(paresNones.equalsIgnoreCase("pares") ||
                paresNones.equalsIgnoreCase("nones") ||
                paresNones.equalsIgnoreCase("salir"));
    }
    
    /*  El método se repite hasta que se introduzca un dato dentro de los valores permitidos en
        método filtrarParesNones*/
    public static String comprobarEleccion(){
        String eleccionParesNones = "";
        
        do{
            eleccionParesNones = paresNones();
        }while(!filtrarParesNones(eleccionParesNones));
        
        return eleccionParesNones;
    }
    
    // ELEGIR EL NÚMERO DE DEDOS
    public static int numeroDedos(){
        int dedos = 0;
        
        do{
            try{
                dedos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de dedos"));          
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "El número de dedos introducido es incorrecto");
            }

            System.out.println(dedos);
            
        }while(dedos <= 0 || dedos > 10);     
        
        return dedos;
    }








































































    
}
