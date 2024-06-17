/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thirty_days_of_java;

import java.util.Scanner;

/**
 * @author juanavila
 * 
 */
public class SecondDay {
    
    /*
    Dia 2/30:
        Desarrolla una calculadora básica que pueda realizar 
        operaciones aritméticas simples como suma, resta, 
        multiplicación y división.
    */
    public void calculadoraBasica()
    {
        double firstNumber = 0.0 ,secondNumber = 0.0;
        String result = null, operator;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print(""
            + "*------------------------------------------------------------*\n"
            + "Dia #2: Calculafora simple. \n"    
            + "Desarrollo de una calculadora básica que pueda realixzar      \n"
            + "realizar operaciones aritméticas simples como suma, resta,    \n"
            + "multiplicación y división.                                    \n"
            + "*------------------------------------------------------------*");
                
        operator = sc.nextLine();
        boolean flag = true;
        
        while (flag)
        {
            flag = (operator != "=");
            
            System.out.println("que tipo operacion aritmetica: \n"
                    + "1. Suma (+) \n"
                    + "2. Resta (-)  \n"
                    + "3. Multipicacion (*) \n"
                    + "4. Division (/)");
            operator = sc.nextLine();
            operator.toLowerCase();
                        
            if (operator.equals("="))
            {
                System.out.print("El resultado es : " + result);
                                
                String temp = sc.nextLine();
                temp.toLowerCase();
                
                if(temp.equals("exit"))
                    break;
                
            }
            else
            {                
                System.out.println("Segundo numero");
                secondNumber = Double.parseDouble(sc.nextLine());
            
                switch (operator)
                {
                    case "+":                    
                        result = String.valueOf(firstNumber + secondNumber);
                        System.out.println("Resultado: " + result);
                        break;
                    
                    case "-":
                        result = String.valueOf(firstNumber - secondNumber);
                        System.out.println("Resultado: " + result);
                        break;
                    
                    case "*":
                        result = String.valueOf(firstNumber * secondNumber);
                        System.out.println("Resultado: " + result);                    
                        break;
                    
                    case "/":
                        result = String.valueOf(firstNumber / secondNumber);
                        System.out.println("Resultado: " + result);
                        break;
                }
                firstNumber = Double.parseDouble(result);
            }
            
        }
        System.out.print("*-------------------------------------*\n"
                       + "                 exit                  \n"
                       + "*-------------------------------------*");
    }
}
