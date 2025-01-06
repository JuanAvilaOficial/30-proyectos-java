/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_5;

import java.util.Scanner;

/**
 *
 * @author Juan Avila
 */
public class Proyecto_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0, longitudChar = 0;
        boolean flag = true;
        String palabra = "";
        char arrayChar[], tempArrayChar[];
        Scanner sc = new Scanner(System.in);
        System.out.println("""                           
                           *------------------------------------------------------------*
                            PROYECTO #5: Verificador de palíndromos
                            Escribe un programa que verifique si una palabra o
                            frase es un palíndromo.
                           *------------------------------------------------------------*
                           """);        
        
        while(flag)
        {
            System.out.print(mensaje("Dame una palababra que quiereas saber "
                    + "si eres palindromo: "));
            palabra = sc.nextLine();
                        
            arrayChar = palabra.toLowerCase().toCharArray();            
            tempArrayChar = new char[arrayChar.length];
            longitudChar = arrayChar.length - 1;
            
            while(longitudChar >= 0 && contador != arrayChar.length) {                
                tempArrayChar[contador] = arrayChar[longitudChar];                
                contador++;
                longitudChar--;
            }
            
            System.out.print(String.valueOf(arrayChar).equals(palabra)? 
                    "Si es un palindromo... " : "NO es palindromo... ");
            palabra = sc.nextLine();      
            flag = !palabra.toLowerCase().equals("exit");
            contador = 0;
            longitudChar = 0;            
        }
    }
    static String mensaje(String s){
        return "\n*------------------------------------------------------------*\n"
            + s;
    }
}
