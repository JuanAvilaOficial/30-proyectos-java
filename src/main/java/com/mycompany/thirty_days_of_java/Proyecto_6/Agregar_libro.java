/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thirty_days_of_java.Proyecto_6;

import java.util.ArrayList;

/**
 *
 * @author Juan Avila
 */
public class Agregar_libro {
    
    String nombreLibro, autor, descripcionLibro;
    int id;
    ArrayList<String> libros = new ArrayList<>();
    
    public void Agregar_libro(String autor, String nombreLibro, String descripcionLibro)
    {        
        this.autor = autor;
        this.nombreLibro = nombreLibro;
        this.descripcionLibro = descripcionLibro;   
        
        
    }
    
}
