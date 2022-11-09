/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ERICK
 */
public class morra {
    
    public static void main(String[] args){
        /*
        Los dos jugadores esconden un puño detrás de la espalda. Después cada jugador a la vez dice 
        el número de dedos que cree que habrán extendidos entre las dos manos y simultáneamente muestran 
        las manos.

        La puntuación mínima obtenible es 2, ya que no existe el cero (el puño cerrado vale 1).

        La palabra morra significa 10 dedos, quiere decir las dos manos abiertas, una de cada jugador.

        El jugador que haya acertado gana. Si ninguno lo ha acertado, se vuelve a empezar.

        Se suele jugar partidos a quién llega antes a los 5 o 21 puntos, manteniendo siempre una ventajas 
        de 2 victorias sobre el otro jugador: si se da el caso de un empate de 4 a 4, se juega por el punto
        de ventaja, debiendo conseguir otro punto sucesivamente para ganar el partido.        
        */
        String preguntarJugar;
        boolean filtrarJugar;
        int dedosMaquina = 0, sumarDedos, dedos;
        
        do{
            // JUGAR
            preguntarJugar = preguntarJugar();

            if(!preguntarJugar.equalsIgnoreCase("salir")){
                // PEDIR DEDOS
                dedos = comprobarNumDedos();
                
                // DEDOS MÁQUINA
                dedosMaquina = dedosMaquina();

                // SUMAR DEDOS
                sumarDedos = sumarDedos(dedos, dedosMaquina);
        
            }else{
                preguntarJugar = "salir";
            }
            
            
        }while(!preguntarJugar.equalsIgnoreCase("salir"));
            
            
    }
    
    // PREGUNTAR SI JUEGA
    public static String  jugar(){
        String respuesta = "";
        
        String texto = """
                       -------------------------------
                                   Morra
                       -------------------------------                         
                           1. Jugar
                           2. Salir
                       """;
        
        respuesta = JOptionPane.showInputDialog(texto);
        respuesta = respuesta.toLowerCase(); // Convertir texto en minúsculas
        
        System.out.println(respuesta);
        
        return respuesta;
    }
   
    // FILTRAR RESPUESTA DE SI JUEGA
    public static boolean filtrarJugar( String respuestaJugar){
        return (respuestaJugar.equalsIgnoreCase("jugar")||
                respuestaJugar.equalsIgnoreCase("salir"));
    }
    
    // COMPROBAR RESPUESTA DE SI JUEGA
    /* Este método va a ejecutar los métodos jugar() y filtrarJugar() */    
    public static String preguntarJugar(){
        String eleccionJugar = "";
        do{
            eleccionJugar = jugar();
        }while(!filtrarJugar(eleccionJugar)); // Se ejecuta mientras la respuesta sea diferente a los valores permitidos en el metodo filtrarJugar()
        
        return eleccionJugar;
    }
    
    // PREGUNTAR NÚMERO DE DEDOS
    public static int numeroDedos(){
        int dedos = 0;
        
        String texto = """
                       Escribe el número de dedos, este tiene que 
                       estar comprendido entre 1 y 5.
                       """;
        
        dedos = Integer.parseInt(JOptionPane.showInputDialog(texto));
        
        System.out.println(dedos);
        
        return dedos;
    }
    
    // FILTRAR DATOS PERMITIDOS
    public static boolean filtrarDedos(int respuestaDedos){
        return(respuestaDedos == 1 || 
                respuestaDedos == 2 ||
                respuestaDedos == 3 ||
                respuestaDedos == 4 ||
                respuestaDedos == 5);
    }
    
    // COMPROBAR SI EL NÚMERO DE DEDOS ES CORRECTO
    public static int comprobarNumDedos(){
        int dedos = 0;
        do{
            dedos = numeroDedos();
        }while(!filtrarDedos(dedos));

        System.out.println("Dedos: " + dedos);
        
        return dedos;
    }
    
    // DEDOS MÁQUINA
    public static int dedosMaquina(){
        int maquinaDedos;
        Random generador = new Random();
        
        maquinaDedos = generador.nextInt(1, 5);
        
        System.out.println("Maquina: " + maquinaDedos);
        
        return maquinaDedos;
    }
    
    // SUMA JUGADOR
    public static int resultadoSumaDedos(){
        int dedos = 0;
        
        do{
            try{
                dedos = Integer.parseInt(JOptionPane.showInputDialog("Cuanto crees que será la suma de todos los dedos"));          
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "El tipo de dato introducido es incorrecto, vuelve a escribirlo.");
            }

            System.out.println("Suma usuario: " + dedos);
            
        }while(dedos <= 1 || dedos > 10);     
        
        return dedos;
    }
    
    // DEDOS MÁQUINA
    public static int sumaDedosMaquina(){
        int maquinaDedos;
        Random generador = new Random();
        
        maquinaDedos = generador.nextInt(2, 10);
        
        System.out.println("Maquina suma: " + maquinaDedos);
        
        return maquinaDedos;
    }
    
    public static int sumarDedos(int dedos, int dedosMaquina){
        int sumaTotal = 0;
        
        sumaTotal = dedos + dedosMaquina;
        
        return sumaTotal;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
