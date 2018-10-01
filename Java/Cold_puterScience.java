/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cold_puterscience;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Cold_puterScience {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count=0;
        
        for(int i=0; i<n ;i++){
            if(sc.nextInt()<0)
                count++;        
        }
        
        System.out.println(count);
    }
        
    
    
}
