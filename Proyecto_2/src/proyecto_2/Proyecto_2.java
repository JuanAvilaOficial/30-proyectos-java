/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_2;

import java.util.Scanner;

/**
 *
 * @author Juan Avila
 */
public class Proyecto_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flag = true;
        double firstNumber = 0.0 ,secondNumber = 0.0;
        String result = null, operator;
        Scanner sc = new Scanner(System.in);
        operator = sc.nextLine();    
        
        System.out.print(
                "\n*------------------------------------------------------------*\n"
                + "PROYECTO #2: Calculadora básica\n"
                + "Un programa que verifique si una palabra \n"
                + "o frase es un palíndromo."
                + "\n*----------------------------------------------------------*\n");
        
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
        System.out.print(
         "\n*-------------------------------------*\n"
        +"                   exit                  \n"
        +"\n*-------------------------------------*\n"
        );
    }
    
}
