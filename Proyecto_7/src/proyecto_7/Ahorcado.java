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
    
    public String dibujo(int error, String palabra){
        String ahorcado = "";
        
        switch(error)
        {
            case 0:
                ahorcado = """
                **************************************
                *         Adivina la palabra         *
                                 #                   
                *                                    
                *           
                *           
                *           
                *           
                *                        
                **************************************
                """;                
                break;
            case 1:
                ahorcado = """
                **************************************
                *         Adivina la palabra         *
                                 #                   
                *                                    
                *           
                *           
                *           
                *           
                *            __________             
                **************************************
                """;
                break;
            case 2:
                ahorcado = """
                **************************************
                *         Adivina la palabra         *
                                 #                   
                *                                         |
                *           |
                *           |
                *           |
                *           |
                *           |__________            *  
                **************************************
                """;
                break;
            case 3:
                ahorcado = """
                **************************************
                *         Adivina la palabra         *
                                 #                   
                *            ______
                *           |
                *           |
                *           |
                *           |
                *           |__________            *  
                **************************************
                """;
                break;
            case 4:
                ahorcado = """
                **************************************
                *         Adivina la palabra         *
                                 #                   
                *            ______
                *           |      |
                *           |      o
                *           |     
                *           |
                *           |__________            *  
                **************************************
                """;
                break;
            case 5:
                ahorcado = """
                **************************************
                *         Adivina la palabra         *
                                 #                   
                *            ______
                *           |      |
                *           |      o
                *           |     /|
                *           |
                *           |__________            *  
                **************************************
                """;
                break;
            case 6:
                ahorcado = """
                **************************************
                *         Adivina la palabra         *
                                 #                   
                *            ______
                *           |      |
                *           |      o
                *           |     /|\
                *           |
                *           |__________            *  
                **************************************
                """;
                break;
            case 7:
                ahorcado = """
                **************************************
                *         Adivina la palabra         *
                                 #                   
                *            ______
                *           |      |
                *           |      o
                *           |     /|\
                *           |     /
                *           |__________            *  
                **************************************
                """;
                break;
            case 8:
                ahorcado = """
                **************************************
                *         Adivina la palabra         *
                                 #                   
                *            ______
                *           |      |
                *           |      o
                *           |     /|\
                *           |     / \
                *           |__________              *  
                **************************************
                """;
                break;
            default:
                throw new AssertionError();
        }                
        ahorcado = ahorcado.replaceAll("#", palabra);
        return ahorcado;
    }
       
}
