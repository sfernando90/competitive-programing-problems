/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodasurpler;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class SodaSurpler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();
        int empty;
        int full;
        int total=0;
        
        empty = e+f;
        
        while(empty>=c){
            
            total += empty/c;
            full = empty/c;
            empty = full + empty%c;
            
        }
        
        System.out.println(total);
        


// TODO code application logic here
    }
    
}
