/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_7;

import java.util.ArrayList;
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
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("robo");
        int errores = 0, intentos = 0;
        String comando = "", palabra = "";
        boolean flag = false;        
        Ahorcado ahorcado = new Ahorcado();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("""
                           PROYECTO #7: Ahoracado
                           Desarrolla un juego del ahorcado en la consola.
                           """);
        
         for(int i = 0; i < palabras.get(0).length(); i++)
                palabra = palabra + "X";
        while(!flag)
        {                        
            try
            {
                ahorcado.dibujo(errores);
                System.out.println(palabra);
                boolean error = false;
               
                System.out.println("una letra: ");
                comando = sc.nextLine();
                
                flag = comando.toLowerCase().equals("exit");
                
                char lr = comando.charAt(0);
                for(int i = 0; i < palabras.get(0).length(); i++)
                {
                    System.out.println("char: " + palabras.get(0).charAt(i));
                    System.out.println("lr: " + lr);
                    System.out.println(palabra.charAt(i) == 'X' && palabras.get(0).charAt(i) == lr);
                    if(palabra.charAt(i) == 'X' && palabras.get(0).charAt(i) == lr)
                        palabra.replace('X', lr);
                    if(palabras.get(0).charAt(i) == lr)
                        error = true;
                }
                if(!error)
                    errores++;                
                
                System.out.println(palabra);
                                
            } catch(Exception e){}                        
        }
        
    }
    
}
