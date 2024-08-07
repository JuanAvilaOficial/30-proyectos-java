/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thirty_days_of_java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juanavila
 */
public class Proyecto_3 {
        /*
    Proyecto 3/30:
        Adivina un numero del 1 al 10
    */
    public void adivinaElNumero(){  
        
        System.out.println(mensaje("Proyecto #3: Adivina el numero" ));
        
        boolean flag = false;
        Random random = new Random();                
        int num = random.nextInt(1, 10);
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
                
        System.out.println(mensaje("Adivina el numero del 1 al 10 "));
                
        while(!flag)
        {        
            try {
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
                System.out.print(mensaje("DATO NO VALIDO!!!!!!! DEBE SER SOLO "
                        + "NUMEROS ENTEROS Y POSITIVO NO MAYORES A AL NUMERO 10\n"));
                sc.nextLine();
            } 
            
        }                       
        System.out.println(mensaje("exit\n"
                + "*------------------------------------------------------------*\n"));
    }
    
    String mensaje(String s)
    {
        return "\n*------------------------------------------------------------*\n"
            + s;
    }
}
