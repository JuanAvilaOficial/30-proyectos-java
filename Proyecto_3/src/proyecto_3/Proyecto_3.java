/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan Avila
 */
public class Proyecto_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(
            "\n*------------------------------------------------------------*\n"
          + "PROYECTO #3: Juego de adivinanza de números\n"
          + "Construye un juego en el que el programa genera un número \n"
          + "aleatorio y el usuario tiene que adivinarlo."
          + "\n*------------------------------------------------------------*\n");
        boolean flag = false;
        Random random = new Random();                
        int num = random.nextInt(1, 10);
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        
        while(!flag)
        {        
            try 
            {
                System.out.print(mensaje("Que numero das?..."));
                respuesta = sc.nextInt(); 
                if(respuesta != num)
                {
                    String s = respuesta > num? "bajo":"alto"; 
                    System.out.println(mensaje("Lastima, tienes que pensar en un "
                            + "numero mas " + s));
                }
                else
                {
                    flag = true;
                    System.out.println(mensaje("GANASTE!!!!"));
                    sc.nextLine();
                }
            } catch (Exception e) {
                System.out.print(
                        mensaje("""
                                DATO NO VALIDO!!!!!!! DEBE SER SOLO NUMEROS ENTEROS Y POSITIVO NO MAYORES A AL NUMERO 10
                                """));
                sc.nextLine();
            } 
            
        }                       
        
        System.out.print(
         "\n*-------------------------------------*\n"
        +"                   exit                  \n"
        +"\n*-------------------------------------*\n"
        );
        
    }
    static String mensaje(String s)
    {
        return "\n*------------------------------------------------------------*\n"
            + s;
    }
}
