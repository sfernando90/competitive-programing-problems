/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackfriday;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class BlackFriday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = {0,0,0,0,0,0,0};
        int[] input = new int[100];
        boolean t = false;
     
        for (int i = 1; i < n+1; i++) {
            int a=sc.nextInt();
            input[a]=i;
            count[a]+=1;
        }
        
        for (int i = 6; i > 0; i--) {
            if(count[i]==1){
                System.out.println(input[i]);
                t=true;
                break;
            }
            
        }
        if(t==false){
            System.out.println("none");
        }
            
        
        
    }
    
}
