/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.Random;
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
        int dedos, numeroAleatorio, resultadoParesNones;
        
        
        
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
                
                // GENERAR NÚMERO ALEATORIO
                numeroAleatorio = numeroAleatorio();
                
                // RESULTADO PARES/NONES
                resultadoParesNones = resultadoParesNones(numeroAleatorio, dedos);
                
                if(resultadoParesNones == 2 && paresNones.equalsIgnoreCase("pares")){
                    JOptionPane.showMessageDialog(null, "¡El ganador es el jugador!");
                }else if(resultadoParesNones == 1 && paresNones.equalsIgnoreCase("nones")){
                    JOptionPane.showMessageDialog(null, "¡El ganador es el jugador!");
                }else{
                    JOptionPane.showMessageDialog(null, "¡El ganador es la máquina!");

                }
                
                
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
        opcion = opcion.toLowerCase();

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
                JOptionPane.showMessageDialog(null, "El tipo de dato introducido es incorrecto, vuelve a escribirlo.");
            }

            System.out.println("Usuario: " + dedos);
            
        }while(dedos < 1 || dedos > 10);     
        
        return dedos;
    }
    
    // GENERAR NÚMERO ALEATORIO
    
    public static int numeroAleatorio(){
        int numeroAleatorio = 0;
        
        Random generador = new Random();
        
        numeroAleatorio = generador.nextInt(1, 11);
        
        System.out.println("Máquina: " + numeroAleatorio);
        
        return numeroAleatorio;
    }
    
    // COMPARAR DATOS
    public static int resultadoParesNones(int numeroAleatorio, int numeroDedos){
            int resultado = 0;
            int resultadoParesNones = 0;
            
            resultado = numeroAleatorio + numeroDedos;
            
            System.out.println(resultado);
            
            if(resultado % 2 == 0){
                resultadoParesNones = 2;
                
                System.out.println(resultadoParesNones);
                
                return resultadoParesNones;
                
            }else{
                resultadoParesNones = 1;
                
                System.out.println(resultadoParesNones);
                
                return resultadoParesNones;
            }
    
            
    }





































    
}
