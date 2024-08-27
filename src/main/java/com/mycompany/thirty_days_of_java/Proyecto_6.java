/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thirty_days_of_java;

import java.util.ArrayList;
import java.util.Scanner;
import javax.annotation.processing.Messager;

/**
 *
 * @author Juan Avila
 */
public class Proyecto_6 {
    
    ArrayList<String> nombreLibro = new ArrayList<>(), 
            autor = new ArrayList<>(), 
            descripcionLibro  = new ArrayList<>();
    int id = 0;
    public void Gestion_Biblioteca()
    {        
        
        
        titulo();
        String comando;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        mensaje("BIENVENIDO A LA BIBLIOTECA\n");
        
        if (flag) {
            mensaje("QUE ES LO QUE DESEAS HACER?:\n"
                    + "1. Agregar\n"
                    + "2. Eliminar\n"
                    + "3. Buscar");
            comando = sc.nextLine();
            flag = !comando.toLowerCase().equals("exit");
           
           if(flag)
           {
               switch (comando) {
                   case "1":
                       mensaje("Agregar libro");
                       
                       System.out.print("Nombre del nuevo libro: ");
                       comando = sc.nextLine().toLowerCase();
                       nombreLibro.add(comando.toString());
                       
                       System.out.print("Nombre del autor: ");
                       comando = sc.nextLine().toLowerCase();
                       autor.add(comando.toString());
                       
                       System.out.print("Una breve descripcion del tema: ");
                       comando = sc.nextLine().toLowerCase();
                       autor.add(comando.toString());
                       
                       mensaje("");                       
                       mensaje("El nuevo libro se agrego \n"); 
                       break;
                    case "2":
                       break;
                    case "3":
                       
                       break;
                   default:
                       throw new AssertionError();
               }
           }            
        }
    }
     void titulo()
    {
        String s = 
                  "\n*------------------------------------------------------------*\n"
                + "PROYECTO #6: Programa de gestión de bibliotecas\n"
                + "Crea un sistema de gestión de bibliotecas con \n"
                + "funcionalidades para agregar, eliminar y buscar libros"
                + "\n*------------------------------------------------------------*\n";
        System.out.print(s);
    }
    void mensaje(String s)
    {
        System.out.println(s 
            + "\n*------------------------------------------------------------*\n"
        );
    }    
}
