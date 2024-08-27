/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thirty_days_of_java;

import java.util.Scanner;
import com.mycompany.thirty_days_of_java.*;

/**
 *
 * @author juanavila
 */
public class Thirty_days_of_java {

    public static void main(String[] args) 
    {
       
       Scanner sc = new Scanner(System.in);
       Proyectos_Controller proyectos_Controller = new Proyectos_Controller();
              
       String numProyect;
       
       System.out.println("30 proyectos en Java 5/30\n");
       System.out.println(proyectos_Controller.lista_proyecto());
       System.out.print("Coloca el proyecto que desea ver y presione enter: ");       
       numProyect = sc.nextLine().toLowerCase();
       
       while (!numProyect.equals("exit"))
       {
           proyectos_Controller.proyectos(numProyect);
           System.out.println("30 proyectos en Java 5/30");
           proyectos_Controller.lista_proyecto();
           System.out.print("Coloca el proyecto que desea ver y presione enter: ");
           numProyect = sc.nextLine().toLowerCase();
       }
        System.out.print("Exit... GOODBYE!!!!!");      
    }
}
