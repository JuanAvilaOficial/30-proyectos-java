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
       Proyecto_1 firstDay = new Proyecto_1();
       Proyecto_2 secondDay = new Proyecto_2();
       Proyecto_3 thirdDay = new Proyecto_3();
       
       String numProyect;
       
       System.out.println("Reto de 30 proyectos en Java 2/30");
       System.out.println("Coloca el proyecto que desea ver y presione "
               + "Enter: ");
       
       numProyect = sc.nextLine();
       numProyect = numProyect.toUpperCase();
       
              
       while (!numProyect.equals("exit"))
       {
           switch (numProyect) {
                   case "1":
                       firstDay.helloWorld();                       
                    break;                    
                   case "2":
                       secondDay.calculadoraBasica();
                    break;
                   case "3":
                       thirdDay.adivinaElNumero();
                    break;
                    case "4":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "5":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "6":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "7":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "8":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "9":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "10":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "11":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "12":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "13":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "14":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "15":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "16":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "17":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "18":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "19":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "20":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "21":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "22":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "23":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "24":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "25":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "26":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "27":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "28":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "29":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;
                    case "30":
                       System.out.println("Aun se encuentra en desarrollo");
                    break;                    
                   default:
                       System.out.println("Dato no valido, da un numero del 1 "
                               + "al 30 o escribe exit para salir");
           }
           System.out.print("Coloca el proyecto que desea ver y presione ");
           numProyect = sc.nextLine();
       }
       //
             
    }
}
