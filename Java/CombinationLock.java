/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinationlock;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class CombinationLock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int turns=120;
        
        while(a+b+c+d != 0){
            turns+= (40+(a-b))%40;
            turns+= (40+(c-b))%40;
            turns+= (40+(c-d))%40;
            
            System.out.println(turns*9);
            
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        turns=120;
        
        }
        
        
    }
    
}
