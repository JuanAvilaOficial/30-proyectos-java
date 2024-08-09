/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thirty_days_of_java;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Juan Avila
 */
public class Proyecto_5 {
    public void Palindromo(){
        int contador = 0, longitudChar = 0;
        boolean flag = true;
        String palabra = "";
        char arrayChar[], tempArrayChar[];
        Scanner sc = new Scanner(System.in);
        titulo();
        
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
    void titulo()
    {
        String s = 
                  "\n*------------------------------------------------------------*\n"
                + "PROYECTO #5: Verificador de palíndromos\n"
                + "Escribe un programa que verifique si una palabra o \n"
                + "frase es un palíndromo."
                + "\n*------------------------------------------------------------*\n";
        System.out.print(s);
    }
    String mensaje(String s){
        return "\n*------------------------------------------------------------*\n"
            + s;
    }
}
