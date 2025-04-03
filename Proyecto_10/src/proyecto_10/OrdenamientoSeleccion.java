/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_10;

import java.util.Arrays;

/**
 *
 * @author Juan Avila
 */
public class OrdenamientoSeleccion {
    
    private int[] listaDesordenada;
    public OrdenamientoSeleccion(int[] lista)
    {
        listaDesordenada = lista;
    }
    
    public void Ordenar()
    {        
        for (int i = 0; i < listaDesordenada.length - 1; i++)
        {
            for (int j = (i+1); j < listaDesordenada.length; j++)
            {
                int num_actual = listaDesordenada[i] , 
                    num_siguiente = listaDesordenada[j];
                
                if ( num_actual > num_siguiente)
                {
                    listaDesordenada[i] = num_siguiente;
                    listaDesordenada[j] = num_actual;                        
                }
            }
        }
        System.out.println ("- De seleccion: " + Arrays.toString (listaDesordenada));
    }
    
}
