package piedrapapeltijera;

import java.util.Random;
import java.util.Scanner;


public class PiedraPapelTijera {

    
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        Random  RD = new Random();
        
        String resp1="";
        String resp2="";
        int numerorandom;
        String Jugador1="";
        String Jugador2="R2D2";
        
        numerorandom = RD.nextInt(3)+1;
        
        
        System.out.println("Piedra, Papel o TIJERA\n");
        
        System.out.print("Ingrese el nombre del jugador 1 : ");
        Jugador1 = leer.next();
        System.out.print("Inicio del Juego");
        System.out.print("La P es Piedra");
        System.out.print("La L es Papel");
        System.out.print("La T es Tijera");
        
        System.out.println("\nINTRODUCE OPCION P/L/T\n" + Jugador1 + ":");
        resp1 = leer.next();
        
        
        switch (numerorandom){
            case 1: resp2 = "P";
                break;
            case 2: resp2 = "T";
                break;
             case 3: resp2 = "L";
                break;
               }
        
        System.out.println("\nLa Opcion de R2D2 fue : " + Jugador2 + ":" + resp2);
        
       
        if(resp1.equals("P") && resp2.equals("P")){
            System.out.println("\nEMPATE\n");
        }
       if(resp1.equals("P") && resp2.equals("T")){
            System.out.println("\nGANADOR"+ Jugador1 + "\n");
        }
         if(resp1.equals("P") && resp2.equals("L")){
           System.out.println("\nGANADOR"+ Jugador2 + "\n");
         }
      }
    
}
