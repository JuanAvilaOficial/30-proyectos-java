/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thirty_days_of_java;

/**
 *
 * @author Juan Avila
 */
public class Proyectos_Controller {
    
    public void proyectos(String s)
    {        
        Proyecto_1 proyecto_1 = new Proyecto_1();
        Proyecto_2 proyecto_2 = new Proyecto_2();
        Proyecto_3 proyecto_3 = new Proyecto_3();
        Proyecto_4 proyecto_4 = new Proyecto_4();
        Proyecto_5 proyecto_5 = new Proyecto_5();
        Proyecto_6 proyecto_6 = new Proyecto_6();

        switch (s) {
            case "1":
                proyecto_1.helloWorld();                       
                break;                    
            case "2":
                proyecto_2.calculadoraBasica();
                break;
            case "3":
                proyecto_3.adivinaElNumero();
                break;
            case "4":
                proyecto_4.Convertidor_de_unidades();
                break;
            case "5":
                proyecto_5.Palindromo();
                break;
            case "6":
                proyecto_6.Gestion_Biblioteca();
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
    }
    public String lista_proyecto(){
        String pro[] = {"No found","Hola mundo.","Calculadora basica.",
            "Juego de adivina el numero.","Convertidor de unidades",
            "Verificador de palindromo.",
        };
        
        for (int i = 1; i < pro.length; i++) {
            System.out.println(i + ". " + pro[i] + "\n");
        }
        return "---------------------------------------------------------------";
    }
}
