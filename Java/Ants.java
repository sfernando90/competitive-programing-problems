/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ants;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Ants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner sc = new Scanner (System.in);
        int cases = sc.nextInt();
        int length;
        int n;
        int min;
        int max;
        int j;
        int possition;
        int closest;   
        int fastest = 0;
        
        for (int i = 0; i < cases ; i++)
        {
           length = sc.nextInt();
           n = sc.nextInt();
           
           min = 1000000;
           max = 0;
           j = 0;
           
           while(j<n){
               
               possition = sc.nextInt();
               if (possition < min)
                   min = possition;
               if (possition > max)
                   max = possition;
 
               if(possition < length - possition)
                   closest = possition;
               else
                   closest = length - possition;
               
               if (closest > fastest)
                   fastest = closest;
               
               j++;
           }
           
           if(min <= length - max)
              System.out.print(fastest + " " + (length - min) +"\n");
           
           else
              System.out.print( fastest + " " + max +"\n");

           
        }
    }
}

