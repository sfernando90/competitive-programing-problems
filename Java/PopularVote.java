/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popular.vote;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class PopularVote {

    
    static int[] numVotes ;
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         int cases = sc.nextInt();
         
         for(int i = 0; i < cases; i++){
             int votes = sc.nextInt();
             numVotes = new int[votes];
             for(int j = 0; j < votes; j++){
                numVotes[j] = sc.nextInt();  
//                System.out.println(numVotes[j]);
              }
//             System.out.println("");
             
             determineWinner();
             
         }

        
    }

    public static void determineWinner(){
        
        int winner = 0;
        int maxVotes = 0;
        int totalVotes = 0;
        boolean tie = false;        
                
        for(int i=0; i < numVotes.length; i++){
            
            totalVotes += numVotes[i];
            if(numVotes[i] > maxVotes){
                maxVotes = numVotes[i];
                winner = i+1;
                tie = false;
            }
            else if(numVotes[i] == maxVotes){
                tie = true;
            }
            
//            System.out.println(winner);
//            System.out.println(maxVotes);
//            System.out.println(totalVotes);
            
        }
        
        if(tie)
            System.out.println("no winner");
        
        else if (maxVotes > (totalVotes/2))
            System.out.println("majority winner " + winner);
            
        else
            System.out.println("minority winner " + winner);
            
    }
    
}
