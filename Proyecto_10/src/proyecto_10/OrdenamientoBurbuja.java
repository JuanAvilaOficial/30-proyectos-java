/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_10;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Juan Avila
 */
public class OrdenamientoBurbuja {
    private int[] listaDesordenada;
    
    public OrdenamientoBurbuja(int[] lista)
    {
        listaDesordenada = lista;
    }
    
    public void Ordenar()
    {
        int correctos = 0; 
        boolean flag = false;
                
        while (!flag)
        {
            for (int i = 0; i < listaDesordenada.length - 1; i++)
            {
                if (i < listaDesordenada.length - 1)
                {
                    int num_actual = listaDesordenada[i], 
                    num_siguiente = listaDesordenada[i+1];
                
                    if(num_actual > num_siguiente)
                    {
                        listaDesordenada[i] = num_siguiente;
                        listaDesordenada[i + 1] = num_actual;
                    } 
                    else{
                        correctos++;
                    }                    
                }                
            }
            flag = (correctos == listaDesordenada.length - 1);
            correctos = 0;
        }
        System.out.println ("- De burbuja: " + 
                Arrays.toString (listaDesordenada));
                
    }
}
