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
        boolean flag = false;
        String palabra = "";
        Scanner sc = new Scanner(System.in);
        titulo();
        
        int x = 0;
        while(!flag)
        {
            char palindromo[] = palabra.toCharArray();
            char p[] = new char[palindromo.length];
            System.out.println("length "+ palindromo.length);
            int i = palindromo.length-1;
            while(i >= 0 && x != palindromo.length) {                
                p[x] = palindromo[i];                
                x++;
                i--;
            }
            
            System.out.println(p.toString().equals(palabra)? 
                    "Si es un palindromo":"NO es palindromo");
            flag = true;
            //String s[] = palndromo[].reverse();
        }
    }
    void titulo()
    {
        String s = 
                  "\n*------------------------------------------------------------*\n"
                + "PROYECTO #5: Verificador de palíndromos\n"
                + "Escribe un programa que verifique si una palabra o \n"
                + "frase es un palíndromo.\n"
                + "\n*------------------------------------------------------------*\n";
        System.out.print(s);
    }
    String mensaje(String s){
        return "\n*------------------------------------------------------------*\n"
            + s;
    }
}
