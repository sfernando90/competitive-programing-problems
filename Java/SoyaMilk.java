/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soyamilk;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class SoyaMilk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l =sc.nextDouble();
        double w =sc.nextDouble();
        double h =sc.nextDouble();
        double angle =sc.nextDouble();
        double area = (l*w*h);
        double total;
        double opposite;
        double triangle;
        
        opposite=(h*(Math.tan((90-angle)*Math.PI/180)));
       
        if(opposite>l){
        
        opposite=(l*(Math.tan(angle*Math.PI/180)));
        
        triangle = ((opposite*l)/2)*w;
        total =area-triangle;
        System.out.printf("%.3f mL", total);
        }
        
        else{
            total = ((opposite*h)/2)*w;
            System.out.printf("%.3f mL", total);
        }
    }
    
}
