/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cannonball;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Cannonball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        double v0;
        double x1;
        double h1;
        double h2;
        double angle;
        double g=9.81;
        double t;
        double height;
        
        
        for(int i=0; i<cases;i++){
            
            v0=sc.nextDouble();
            angle=sc.nextDouble();
            x1=sc.nextDouble();
            h1=sc.nextDouble();
            h2=sc.nextDouble();
            
            angle= (angle/180)*Math.PI;
                    
            
            t= x1/(v0*Math.cos(angle));
            
            height = (v0*t*Math.sin(angle))-(.5*g*t*t);
            
            if(height >= h1+1 && height <= h2-1)
                System.out.println("Safe");
            else
                System.out.println("Not safe");
            
            
        }
        
        
    }
    
}
