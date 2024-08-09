package com.mycompany.thirty_days_of_java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author juanavila 
 */
public class Proyecto_1 {

    /*
        Proyecto 1/30:
            Este es un sencillo programa de 'Hola Mundo' 
            hecho con el lenguaje de programación Java.
     */
    public void helloWorld()
    {
        titulo();
        System.out.println("Hello World!");
        
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
                + "el programa.\n"
                + "\n*------------------------------------------------------------*\n";
        System.out.print(s);
    }
    
}
