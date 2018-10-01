/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scaling.recipes;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class ScalingRecipes {

    /**
     * @param args the command line arguments
     */
    
    public static String[] ingr;
    public static double mainIng;
    public static double[] percentages;
    public static double scalingFactor;
    
    public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         int cases = sc.nextInt();
         
         
         for(int i=0;i<cases;i++){
             int ingredients = sc.nextInt();
             double givenPortions = sc.nextInt();
             double desiredPortions = sc.nextInt();
             scalingFactor = desiredPortions/givenPortions;
             
             ingr = new String[ingredients];
             percentages = new double[ingredients];
             
             for(int j=0; j<ingredients; j++){
                 ingr[j] = sc.next();
                 double mi = sc.nextDouble();
                 percentages[j] = sc.nextDouble();
                 
                 if(percentages[j]==100)
                     mainIng = mi;
                 
             }
             scaled(i+1);
             
         }
    }
    
    
    public static void scaled(int cases){
        
        System.out.println("Recipe # "+cases);
        
        for(int i=0; i<ingr.length; i++){
            System.out.printf(ingr[i] + " %.1f\n",(percentages[i]*scalingFactor*mainIng)/100.0);            
        }
        
        System.out.println("----------------------------------------");
    }
}
