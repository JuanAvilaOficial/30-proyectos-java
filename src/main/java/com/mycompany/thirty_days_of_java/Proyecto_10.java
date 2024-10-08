/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thirty_days_of_java;

import java.lang.reflect.Array;

/**
 *
 * @author Juan Avila
 */
public class Proyecto_10 {
    public void Ordenamiento(){
        
        String lista[] = {"45","5","12","1","90"};
        
        O_burbuja (lista);
    }
    private void O_burbuja(String  []lista){
        int correctos = 0; 
        boolean flag = false;
        System.out.println ("lista aranca: " + lista);
        while (!flag){
            for (int i = 0; i < lista.length; i++)
            {
                if (i == lista.length-1)
                {
                    int num_actual = Integer.parseInt (lista[i]) , 
                    num_siguiente = Integer.parseInt (lista[i+1]);
                
                    if(num_actual >= num_siguiente)
                    {
                        lista[i] = String.valueOf (num_siguiente);
                        lista[i+1] = String.valueOf (num_actual);
                    } 
                    else{
                        correctos++;
                    }
                    System.out.println ("lista ordenando: " + lista);
                }                
            }
            flag = (correctos == lista.length);
        }
        System.out.println ("lista ordenado: " + lista);
    }
}
