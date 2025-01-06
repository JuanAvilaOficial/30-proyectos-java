/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_7;

/**
 *
 * @author Juan Avila
 */
public class Ahorcado {
    
    public String dibujo(int error){
        String ahorcado = "";
        
        switch(error)
        {
            case 0:
                ahorcado = """
                           """;
                
                break;
            case 1:
                ahorcado = """
                           
                           
                           
                           
                           
                           __________
                           """;
                break;
            case 2:
                ahorcado = """
                           |
                           |
                           |
                           |
                           |
                           |_________
                           """;
                break;
            case 3:
                ahorcado = """
                            ______
                           |
                           |
                           |
                           |
                           |_________
                           """;
                break;
            case 4:
                ahorcado = """
                            ______
                           |      |
                           |      o
                           |
                           |
                           |_________
                           """;
                break;
            case 5:
                ahorcado = """
                            ______
                           |      |
                           |      o
                           |     /|
                           |
                           |_________
                           """;
                break;
            case 6:
                ahorcado = """
                            ______
                           |      |
                           |      o
                           |     /|\
                           |
                           |_________
                           """;
                break;
            case 7:
                ahorcado = """
                            ______
                           |      |
                           |      o
                           |     /|\
                           |     /
                           |_________
                           """;
                break;
            case 8:
                ahorcado = """
                            ______
                           |      |
                           |      o
                           |     /|\
                           |     / \
                           |_________
                           """;
                break;
            default:
                throw new AssertionError();
        }                
        return ahorcado;
    }
       
}
