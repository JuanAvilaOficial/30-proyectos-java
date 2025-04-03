/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Avila
 */
public class Proyecto_8 {
    static ArrayList<String> nombreContacto = new ArrayList<>(), 
            numeroContacto = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nombreContacto.add("David");             
        numeroContacto.add("3218946231");
        mensaje("""
                PROYECTO #8: Agenda de contactos
                Crea una agenda de contactos donde los usuarios puedan
                agregar, eliminar y buscar contactos.                
                """);
        
        String comando;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        mensaje("BIENVENIDO A LA TÚ LISTA DE CONTACTO\n");
        
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
                       mensaje("Agregar contacto");
                       
                       System.out.print("Nombre del nuevo contacto: ");
                       comando = sc.nextLine().toLowerCase();
                       flag = !comando.toLowerCase().equals("exit");
                       
                       if(flag)
                       {
                            nombreContacto.add(comando.toString());
                       
                            System.out.print("Nombre del nuevo contacto: ");
                            comando = sc.nextLine().toLowerCase();
                            numeroContacto.add(comando.toString());
                                                                    
                            mensaje("El nuevo contacto se agrego..."); 
                        }
                        flag = true;
                       break;
                    case "2":
                        mensaje("Eliminar contacto");

                        System.out.print("Nombre del contacto a eliminar: ");
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
                        mensaje("Buscar contacto");

                        System.out.print("Nombre del contacto a buscar: ");
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
    static void mensaje(String s)
    {
        System.out.println(s 
            + "\n*------------------------------------------------------------*\n"
        );
    }   
    //Metodo para eliminacion de libro por id
    static void eliminarById(int id)
    {
        if(id <= nombreContacto.size())
        {
            numeroContacto.remove(id);
            nombreContacto.remove(id);
            mensaje("El libro se elimino...");
        }
        else
            mensaje("El libro no existe...");
    }
    //Metodo para eliminacion de libro por nombre o numeroContacto
    static void eliminar(String string)
    {
        int id = 0;
        boolean eliminar = false;
        
        for (int i = 0; i < nombreContacto.size(); i++) {
            if (nombreContacto.get(i).equals(string))
            {
                id = i;
                eliminar = true;
                break;
            }
        }
        
        if(!eliminar)
        {
            
            for (int i = 0; i < numeroContacto.size(); i++) {
                if (numeroContacto.get(i).equals(string))
                {
                    id = i;
                    eliminar = true;
                    break;
                }
            }
        }
        
        if(eliminar)
        {
            numeroContacto.remove(id);
            nombreContacto.remove(id);
            mensaje("El libro se elimino...");
        }
        else
            mensaje("El libro no existe...");   
    }
    
    //Metodo de busqueda de libro por id
    static void buscarById(int id)
    {
        System.out.println(nombreContacto.size());
        if(id <= nombreContacto.size())
        {
            mensaje("Id: "+ (id+1)
                      + "\n nombre del libro: " + nombreContacto.get(id)
                      + "\n Autor: " + numeroContacto.get(id));        
        }
        else
            mensaje("El libro no existe...");
    }
    //Metodo de busqueda de libro por nombre o numeroContacto
    static void buscar(String string)
    {
        int id = 0;
        boolean encontrado = false;
        
        for (int i = 0; i < nombreContacto.size(); i++) {
            if (nombreContacto.get(i).equals(string))
            {
                id = i;
                encontrado = true;
            }
        }
        
        if(!encontrado)
        {            
            for (int i = 0; i < numeroContacto.size(); i++) {
                if (numeroContacto.get(i).equals(string))
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
                      + "\n nombre del libro: " + nombreContacto.get(id)
                      + "\n Autor: " + numeroContacto.get(id));                      
        }
            else
                mensaje("El libro no existe...");
    }
    static boolean esNumero(String s){
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
