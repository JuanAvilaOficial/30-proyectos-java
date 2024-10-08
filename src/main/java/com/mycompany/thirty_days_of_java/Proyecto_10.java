/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thirty_days_of_java;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Juan Avila
 */
public class Proyecto_10 {
    public void Ordenamiento(){
        System.out.println ("hola");
        String[] lista = {"45","5","12","1","90"};
        
        //O_burbuja (lista);
        O_Seleccion(lista);
    }
    private void O_burbuja(String[] lista){
        int correctos = 0; 
        boolean flag = false;
        System.out.println ("lista aranca: " + Arrays.toString (lista));
        while (!flag){
            for (int i = 0; i < lista.length-1; i++)
            {
                if (i < lista.length-1)
                {
                    int num_actual = Integer.parseInt (lista[i]) , 
                    num_siguiente = Integer.parseInt (lista[i+1]);
                
                    if(num_actual > num_siguiente)
                    {
                        lista[i] = String.valueOf (num_siguiente);
                        lista[i+1] = String.valueOf (num_actual);
                    } 
                    else{
                        correctos++;
                    }
                    System.out.println ("lista ordenando: " + Arrays.toString(lista));
                }                
            }
            flag = (correctos == lista.length - 1);
            correctos = 0;
        }        
        System.out.println ("lista ordenado: " + Arrays.toString (lista));
    }
    
    private void O_Seleccion(String[] lista){
        System.out.println ("lista aranca: " + Arrays.toString (lista));
        for (int i = 0; i < lista.length - 1; i++)
        {
            for (int j = (i+1); j < lista.length; j++)
            {
                int num_actual = Integer.parseInt (lista[i]) , 
                    num_siguiente = Integer.parseInt (lista[j]);
                
                if ( num_actual > num_siguiente)
                {
                    lista[i] = String.valueOf (num_siguiente);
                    lista[j] = String.valueOf (num_actual);    
                    System.out.println ("lista ordenando: " + Arrays.toString(lista));
                }
            }
        }
        System.out.println ("lista ordenado: " + Arrays.toString (lista));
    }
    private void O_Quicksort(String[] lista, int izquierda, int derecha){
        
    }
}
