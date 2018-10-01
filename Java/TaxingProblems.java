/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxingproblems;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class TaxingProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nbands = sc.nextInt();        
        double[][] bands = new double[nbands][2];
        int nfriends;
        double maxTax=0;
        
        for(int i=0; i<nbands; i++){
            for(int j=0; j<2;j++){
                double temp=sc.nextDouble();
                bands[i][j] = temp;
            }
        }
        maxTax=sc.nextDouble();
        
        nfriends=sc.nextInt();
        double[][] friends = new double [nfriends][2];
        
        for(int i=0; i<nfriends; i++){
            for(int j=0; j<2;j++){
                double temp=sc.nextDouble();
                friends[i][j] = temp;
            }    
        }
        
        for(int i=0; i<nfriends; i++){
            double income = friends[i][0];
            double receive= friends[i][1];
            double tax= maxTax/100;
            double total=0;
            double totalReceive=income+receive;
            double last;
            
            for(int j=0;j<nbands;j++){
                if(totalReceive >= bands[j][0]){
                    total += (bands[j][0])/(1-(bands[j][1]/100));
                    //System.out.println((bands[j][0])*(1-(bands[j][1]/100)));
                    totalReceive = totalReceive - bands[j][0];   
                }
                else {
                    total += totalReceive/(1-(bands[j][1]/100));
                    //System.out.println(total-income);
                    totalReceive=0;
                }
            }
            
            total += totalReceive/(1-tax);
            //System.out.println(totalReceive);
            
            System.out.println(total-income);
            
            
        }
        
    }
    
}
