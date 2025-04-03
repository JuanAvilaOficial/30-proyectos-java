/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_10;

import java.text.ParseException;
import java.util.Arrays;

/**
 *
 * @author Juan Avila
 */
public class OrdenamientoRapido 
{
    public int[] listaOrdenada;
        
    public OrdenamientoRapido() { }
    
    public void Ordenar(int[] lista, int izq, int der)
    {     
       if(izq < der)
       {
           int pivote = Divide(lista, izq, der);
           Ordenar(lista, izq, pivote - 1);
           Ordenar(lista, pivote + 1, der);
       }
       listaOrdenada = lista;
       
       //System.out.println(Arrays.toString(listaOrdenada));
    }
    
    int Divide(int[] lista, int izq, int der)
    {
        int pivote = lista[der];
        int index = izq - 1;
        
        for(int i = izq; i < der; i++)
        {
            if(lista[i] < pivote)
            {
                index ++;
                int temp = lista[index];                        
                lista[index] = lista[i];
                lista[i] = temp;
            }
        }
        int temp = lista[index + 1];
        lista[index + 1] = lista[der];
        lista[der] = temp;
        
        return index + 1;
    }
    
}
