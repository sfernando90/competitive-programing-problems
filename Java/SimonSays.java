/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simonsays;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class SimonSays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            
            int cases = sc.nextInt();
            sc.nextLine();
            
           for(int i = 0; i < cases; i++){
               String line = sc.nextLine();
               if(line.startsWith("Simon says "))
                   System.out.println(line.substring(11));
           }
        
    }
    
}
