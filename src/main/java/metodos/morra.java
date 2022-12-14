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

        Se suele jugar partidos a quién llega antes a los 5 o 21 puntos.        
        */
        String preguntarJugar, puntosGanador;
        boolean filtrarJugar;
        int dedosMaquina = 0, sumarDedos, dedos, resultadoSumaUsuario, resultadoSumaMaquina, resultadoRonda, contadorUsuario = 0, contadorMaquina = 0, puntuacionTotal = 0;
        
        do{
            // JUGAR
            preguntarJugar = preguntarJugar();
            do{
                
                if(!preguntarJugar.equalsIgnoreCase("salir")){
                    // DEDOS USUARIO
                    dedos = comprobarNumDedos();

                    // DEDOS MÁQUINA
                    dedosMaquina = dedosMaquina();

                    // SUMAR DEDOS USUARIO Y MÁQUINA
                    sumarDedos = sumarDedos(dedos, dedosMaquina);

                    // RESULTADO DE LA SUMA USUARIO
                    resultadoSumaUsuario = comprobarDedosUsuario(dedos);

                    // RESULTADO DE LA SUMA MAQUINA
                    resultadoSumaMaquina = comprobarDedosMaquina(dedosMaquina);

                    // RESULTADO RONDA
                    resultadoRonda = resultadoRonda(resultadoSumaUsuario, resultadoSumaMaquina, sumarDedos);

                    if(resultadoRonda == 1){
                        JOptionPane.showMessageDialog(null, "El ganador es el usuario");

                        contadorUsuario++;
                    }else if(resultadoRonda == 2){
                        JOptionPane.showMessageDialog(null, "El ganador es la máquina");

                        contadorMaquina++;
                    }else{
                        JOptionPane.showMessageDialog(null, "¡No hay ganador!");
                    }
                    
                    // GANADOR
                    puntosGanador = puntosGanador(contadorUsuario, contadorMaquina);

                    // PUNTUACIÓN TOTAL 
                    puntuacionTotal = contadorUsuario + contadorMaquina;
                    
                    if(puntuacionTotal == 5){
                    
                        String puntos = """
                                                    PUNTUACIONES
                                        Puntuación jugador: %d
                                        Puntuación máquina: %d

                                        Puntos: %d       

                                        %s
                                        """.formatted(contadorUsuario, contadorMaquina, puntuacionTotal, puntosGanador);
                        JOptionPane.showMessageDialog(null, puntos);
                    }
          
            }else{
                preguntarJugar = "salir";
            }
            }while(puntuacionTotal < 5);
            
        }while(!preguntarJugar.equalsIgnoreCase("salir"));
            
            
    }
    
    // PREGUNTAR SI JUEGA
    public static String  jugar(){
        String respuesta = "";
        
        String texto = """
                       ----------------------------------------------
                                                Morra
                       ----------------------------------------------          
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
            try{
                dedos = numeroDedos();
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "El tipo de dato introducido es incorrecto, vuelve a escribirlo");
            }    
             
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

    // SUMAR DEDOS DEL USUARIO Y LA MÁQUINA
    public static int sumarDedos(int dedos, int dedosMaquina){
        int sumaTotal = 0;
        
        sumaTotal = dedos + dedosMaquina;
        
        return sumaTotal;
    }
    
    // SUMA DEDOS USUARIO 
    public static int resultadoDedosUsuario(){
        int dedos = 0;
        
        
        String totalDedos = "Escribe la suma de todos los dedos";
        
        dedos = Integer.parseInt(JOptionPane.showInputDialog(totalDedos));
                
        return dedos;
    }
    
    // COMPROBAR SI EL NÚMERO DE DEDOS DEL USUARIO CUMPLE LOS REQUISITOS
    public static int comprobarDedosUsuario(int dedos){
        int resultado = 0;
        do{
            resultado = resultadoDedosUsuario();
            
        }while(resultado < dedos + 1);  
        
        System.out.println("Resultado dedos del usuario: " + resultado);
        return resultado;
    }
    
    // RESULTADO  DE LOS DEDOS DE LA MÁQUINA
    public static int resultadoDedosMaquina(){
        int maquinaDedos;
        Random generador = new Random();
        
        maquinaDedos = generador.nextInt(1, 10); 
        
        return maquinaDedos;
    }
    
    public static int comprobarDedosMaquina(int dedosMaquina){
        int resultado = 0;
        do{
            resultado = resultadoDedosMaquina();
            
        }while(resultado < dedosMaquina + 1);  
        
        System.out.println("Resultado dedos del usuario: " + resultado);
        return resultado;
    }
    
    
    //
    public static int resultadoRonda(int resultadoSumaUsuario, int resultadoSumaMaquina, int sumarDedos){
        int resultado = 0;
        if(resultadoSumaUsuario == sumarDedos){
            resultado = 1;
        }else if (resultadoSumaMaquina == sumarDedos){
            resultado = 2;
        }
        
        return resultado;        
    }
    
    
    // PUNTOS GANADOR
    public static String puntosGanador(int contadorUsuario, int contadorMaquina){
        String resultado = "";
        
        if(contadorUsuario > contadorMaquina){
            resultado = "¡El ganador es el jugador!";
        }else{
            resultado = "¡El ganador es la máquina!";
        }
        
        System.out.println(resultado);        
        return resultado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
