/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrewtheant;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class AndrewTheAnt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longest=0;
        boolean tie = false;
        
        while(sc.hasNext()){        
            int length = sc.nextInt();
            int ants = sc.nextInt();
            longest = -1;
            tie = false;
            for(int i = 0; i<ants; i++){
                int possition = sc.nextInt();
                String direction = sc.next();
                int time;
                
                if(direction.equals("R"))
                    time = length - possition;
                else
                    time = possition;
                
                if(time > longest){
                    longest = time;
                    tie = false;
                }
                                    
                else if(time == longest){
                    tie = true;
                }
            }
                
            if(!tie)
                System.out.printf("The last ant will fall down in %1d seconds - started at \n", longest);
            
            if(tie)
                System.out.printf("The last ant will fall down in %1d seconds - started at tie \n", longest);
        }

    }
    
}
