/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan Avila
 */
public class Proyecto_10 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        int[] lista = new int[]{45,5,12,1,90};
        Scanner scanner = new Scanner(System.in);
        int longitud = 0;
        
        System.out.println("""                   
                PROYECTO #10: Algoritmos de ordenación
                Implementa algoritmos de ordenación comunes como la 
                ordenación por burbuja, la ordenación por selección 
                y la ordenación rápida.
                           
                                        """);
        
        System.out.println("""                                
                           Deseas crea una nueva lista númerica?
                           [Y] yes o [N] no
                           """);        
        String temp = scanner.nextLine();
        boolean flag  = (temp.toUpperCase().equals("Y") || 
                temp.toUpperCase().equals("YES")
                && temp.toUpperCase().equals("Y") || 
                !temp.toUpperCase().equals("NO"));
        
        if(flag)
        {
            Random random = new  Random();
                
            System.out.println("""                                
                           Qué tan larga la lista?
                        """);    
            longitud = scanner.nextInt();
            lista = new int[longitud];
              
            for(int i = 0; i < longitud; i++)
            {
              lista[i] = random.nextInt(200) + 1;
            }
            System.out.println("Lista desordenada: " + Arrays.toString(lista) 
                    + "\n");
        }
                        
        OrdenamientoBurbuja burbuja = new OrdenamientoBurbuja(lista.clone());
        OrdenamientoSeleccion seleccion = new OrdenamientoSeleccion(lista.clone());
        OrdenamientoRapido sort = new OrdenamientoRapido();        
        
        sort.Ordenar(lista.clone(), 0, lista.length - 1);
        
        System.out.println("Algoritmos de ordenamiento: \n" );
        burbuja.Ordenar();
        seleccion.Ordenar();
        System.out.println("- De Sort: " + Arrays.toString(sort.listaOrdenada));
    }    
}