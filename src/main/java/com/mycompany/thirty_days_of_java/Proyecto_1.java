package com.mycompany.thirty_days_of_java;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author juanavila 
 */
public class Proyecto_1 {

    public void helloWorld()
    {
        titulo();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello World!");
        sc.nextLine();
        System.out.print("*-------------------------------------*\n"
                       + "                 exit                  \n"
                       + "*-------------------------------------*");
    }
    void titulo()
    {
        String s = 
                  "\n*------------------------------------------------------------*\n"
                + "PROYECTO #1: Hola Mundo \n"
                + "Este es un sencillo programa de 'Hola Mundo' hecho con \n"
                + "el lenguaje de programación Java. El repositorio contiene \n"
                + "el código fuente, las instrucciones para compilar y ejecutar \n"
                + "el programa."
                + "\n*------------------------------------------------------------*\n";
        System.out.print(s);
    }
    
}
