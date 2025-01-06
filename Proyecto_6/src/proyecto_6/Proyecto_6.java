/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Avila
 */
public class Proyecto_6 {
    static ArrayList<String> nombreLibro = new ArrayList<>(), 
            autor = new ArrayList<>(), 
            descripcionLibro  = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nombreLibro.add("Don Quijote de la mancha");             
        autor.add("Miguel de Cervantes Saavedra");
        descripcionLibro.add("Es la primera obra genuinamente desmitificadora de la tradición caballeresca y cortés por su tratamiento burlesco. Representa la primera novela moderna y la primera novela polifónica; como tal, ejerció un enorme influjo en toda la narrativa europea. Por considerarse «el mejor trabajo literario jamás escrito», encabezó la lista de las mejores obras literarias de la historia, que se estableció con las votaciones de cien grandes escritores de 54 nacionalidades a petición del Club Noruego del Libro y Bokklubben World Library en 2002; así, fue la única excepción en el estricto orden alfabético que se había dispuesto.");
                
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
    static void mensaje(String s)
    {
        System.out.println(s 
            + "\n*------------------------------------------------------------*\n"
        );
    }   
    //Metodo para eliminacion de libro por id
    static void eliminarById(int id)
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
    static void eliminar(String string)
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
                if (autor.get(i).equals(string))
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
    static void buscarById(int id)
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
    static void buscar(String string)
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
                if (autor.get(i).equals(string))
                {
                    id = i;
                    encontrado = true;
                    break;
                }
            }
        }
        
        if(encontrado)
        {
            mensaje(                   
                    "Id: "+ (id+1)
                      + "\n nombre del libro: " + nombreLibro.get(id)
                      + "\n Autor: " + autor.get(id)
                      + "\n Descripcion del libro: " + descripcionLibro.get(id));        }
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
