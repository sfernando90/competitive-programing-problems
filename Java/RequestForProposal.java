/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requestforproposal;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
class RequestForProposal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         double p = sc.nextDouble();
         int count = 1;
         
         
         while (n!=0 && p!=0){
             String a;
             String[] company = new String[n];
             double[] bid = new double[n];
             double[] requirementsMet = new double[n];
             String bestC="";
             double bestR=0;
             double currentBid=999999999;
             
             
             for (int i = 0; i < n; i++) {
                 a= sc.nextLine();
             }
             a= sc.nextLine();
             for (int i = 0; i < p; i++) {
                 company[i]=sc.nextLine();
//                 System.out.println(sc.nextLine());
                 bid[i] = sc.nextDouble();
                 requirementsMet[i] = sc.nextDouble();
                 a= sc.nextLine();  
                 for (int j = 0; j <requirementsMet[i] ; j++) {
                     a= sc.nextLine();
                 }
                
//                 System.out.println(requirementsMet[i]);
//                 System.out.println(company[i]);
//                 System.out.println(bid[i]);
             }
             
             for (int i = 0; i < p; i++) {
                 double score;
                 score = requirementsMet[i]/n;
                 
                 if(score > bestR){
                     bestR=score;
                     bestC=company[i];
                     currentBid=bid[i];
                 }
                 else if(score == bestR){
                     if(bid[i]<currentBid){
                         currentBid=bid[i];
                         bestC=company[i];
                     }
                 }
             }
         
             System.out.println("RFP #"+count);
             count++;
             System.out.println(bestC + "\n");
             
            n = sc.nextInt();
            p = sc.nextDouble();
                
         }
     
    }
    
}
