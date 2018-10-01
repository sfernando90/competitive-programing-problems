/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Radio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        
        Arrays.sort(x);
        int a=x[0];
        int b=x[1];
        int count=0;
        int rangeMax=x[0]+k;
        int rangeMin=x[0];
  
        for(int i=0; i<n ;i++){
            b=x[i];
            if(rangeMax>=b)
            {}
            else
            {
                rangeMax=b+k;
                count++;
            }
            
        }
//        while(rangeMax<x[n-1]){
//            
//            rangeMax = a+k;
//            count++;
//        }
//        
        System.out.println(count);
    }
    
}
