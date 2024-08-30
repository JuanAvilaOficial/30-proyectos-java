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
    public void Gestion_Biblioteca()
    {                
        nombreLibro.add("juan");             
        autor.add("manuel");
        descripcionLibro.add("sdfsdfsd");
        
        titulo();
        String comando;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        mensaje("BIENVENIDO A LA BIBLIOTECA\n");
        
        while (flag) {
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
                       flag = !comando.toLowerCase().equals("exit");
                       if(flag)
                       {
                            nombreLibro.add(comando.toString());
                       
                            System.out.print("Nombre del autor: ");
                            comando = sc.nextLine().toLowerCase();
                            autor.add(comando.toString());
                       
                            System.out.print("Una breve descripcion del tema: ");
                            comando = sc.nextLine().toLowerCase();
                            descripcionLibro.add(comando.toString());
                                                                    
                            mensaje("El nuevo libro se agrego..."); 
                        }
                        flag = true;
                       break;
                    case "2":
                        mensaje("Eliminar libro");

                        System.out.print("Nombre del libro a eliminar: ");
                        comando = sc.nextLine().toLowerCase();
                        flag = !comando.toLowerCase().equals("exit");
                        
                        if (flag)
                        {
                            if(!esNumero(comando))
                                eliminar(comando);
                            else
                                eliminarById(Integer.parseInt(comando));                            
                        }
                        flag = true;
                       break;
                    case "3":
                        mensaje("Buscar libro");

                        System.out.print("Nombre del libro a buscar: ");
                        comando = sc.nextLine().toLowerCase();
                        flag = !comando.toLowerCase().equals("exit");
                        
                        if (flag)
                        {
                            if(!esNumero(comando))
                                buscar(comando);
                            else
                                buscarById(Integer.parseInt(comando));                            
                        }
                        flag = true;
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
    //Metodo para eliminacion de libro por id
    void eliminarById(int id)
    {
        if(id <= nombreLibro.size())
        {
            autor.remove(id);
            nombreLibro.remove(id);
            descripcionLibro.remove(id);        
            mensaje("El libro se elimino...");
        }
        else
            mensaje("El libro no existe...");
    }
    //Metodo para eliminacion de libro por nombre o autor
    void eliminar(String string)
    {
        int id = 0;
        boolean eliminar = false;
        
        for (int i = 0; i < nombreLibro.size(); i++) {
            if (nombreLibro.get(i).equals(string))
            {
                id = i;
                eliminar = true;
                break;
            }
        }
        
        if(!eliminar)
        {
            
            for (int i = 0; i < autor.size(); i++) {
                if (this.autor.get(i).equals(string))
                {
                    id = i;
                    eliminar = true;
                    break;
                }
            }
        }
        
        if(eliminar)
        {
            autor.remove(id);
            nombreLibro.remove(id);
            descripcionLibro.remove(id);
            mensaje("El libro se elimino...");
        }
        else
            mensaje("El libro no existe...");   
    }
    
    //Metodo de busqueda de libro por id
    void buscarById(int id)
    {
        System.out.println(nombreLibro.size());
        if(id <= nombreLibro.size())
        {
            mensaje("Id: "+ (id+1)
                      + "\n nombre del libro: " + nombreLibro.get(id)
                      + "\n Autor: " + autor.get(id)
                      + "\n Descripcion del libro: " + descripcionLibro.get(id));        
        }
        else
            mensaje("El libro no existe...");
    }
    //Metodo de busqueda de libro por nombre o autor
    void buscar(String string)
    {
        int id = 0;
        boolean encontrado = false;
        
        for (int i = 0; i < nombreLibro.size(); i++) {
            if (nombreLibro.get(i).equals(string))
            {
                id = i;
                encontrado = true;
            }
        }
        
        if(!encontrado)
        {            
            for (int i = 0; i < autor.size(); i++) {
                if (this.autor.get(i).equals(string))
                {
                    id = i;
                    encontrado = true;
                    break;
                }
            }
        }
        
        if(encontrado)
        {
            mensaje("Id: "+ (id+1)
                      + "\n nombre del libro: " + nombreLibro.get(id)
                      + "\n Autor: " + autor.get(id)
                      + "\n Descripcion del libro: " + descripcionLibro.get(id));
        }
            else
                mensaje("El libro no existe...");
    }
    boolean esNumero(String s){
        boolean esNumero;
        try {
            Integer.parseInt(s);
            esNumero = true;
        } catch (NumberFormatException exception) {
            esNumero = false;
        }
        return esNumero;
    }
}
