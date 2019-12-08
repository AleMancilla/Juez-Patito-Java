/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juez.patito;

/**
 *
 * @author DELL-PC
 */
public class JuezPatito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        char [] vector = new char[5];
        vector [0]='a';
        for (int i = 0; i < 5; i++) {
            System.out.println("pos = "+ vector[i]);
            if(vector[i] == ' ' )
            {
                System.out.println("pppp");
            }
        }
    }
    
}
