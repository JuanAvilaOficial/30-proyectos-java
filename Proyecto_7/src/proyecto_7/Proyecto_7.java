/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan Avila
 */
public class Proyecto_7 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> palabraAdivinar = new ArrayList<>();
        ArrayList<String> palabras = new ArrayList<>();
        
        palabraAdivinar.add("robo");
        palabraAdivinar.add("torre");
        palabraAdivinar.add("horror");
        palabraAdivinar.add("correcto");
        palabraAdivinar.add("helado");
        
        int errores = 0, intentos = 10, index = 0;
        String comando = "", palabra = "";
        Ahorcado ahorcado = new Ahorcado();
        
        boolean flag = false;        
        Scanner sc = new Scanner(System.in);
        index = new Random().nextInt(0, palabraAdivinar.size());
        
        System.out.println("""
                           PROYECTO #7: Ahoracado
                           Desarrolla un juego del ahorcado en la consola.
                           """);
        
        for(int i = 0; i < palabraAdivinar.get(index).length(); i++)
        {    
            palabras.add("X"); 
            palabra = palabra + "X";
        }

        while(!flag)
        {                        
            try
            {
                flag = (intentos <= 0 || 
                        palabraAdivinar.get(index).equals(palabra) || 
                        comando.equals("exit"));

                if(intentos != 0 && !palabraAdivinar.get(index).equals(palabra))
                {
                    System.out.println("Escribe una letra: ");
                    comando = sc.nextLine().toUpperCase();
                    System.out.println(ahorcado.dibujo(errores,palabra));
                    intentos--;
                    
                    boolean error = false;
                    for(int i = 0; i < palabraAdivinar.get(index).length(); i++)
                    {
                        String letra = String.valueOf(palabraAdivinar.get(index).charAt(i));                    
                        if(letra.toUpperCase().equals(comando) && palabras.get(i).equals("X"))
                        {
                            error = true;
                            palabras.set(i, letra.toUpperCase()); 
                        }
                    }                
                    if(!error)
                        errores++;
                    palabra = "";
                    for(int i = 0; i < palabras.size(); i++)
                        palabra = palabra + palabras.get(i).toString();
                    
                    System.out.println("palabra: " + palabra);
                }

            } catch(Exception e){}                        
        }
        if (palabraAdivinar.get(index).equals(palabra))
            System.out.println("""
                               Felicidades Ganaste!!!
                               """);
        else
            System.out.println("""
                               Perdiste >:3 !!!
                               """);
        
        System.out.println("Fin del programa...");
     
    }
    
}
