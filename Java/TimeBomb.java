/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timebomb;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class TimeBomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line[] = new String[6];
        line[1]= sc.nextLine();
        line[2]= sc.nextLine();
        line[3]= sc.nextLine();
        line[4]= sc.nextLine();
        line[5]= sc.nextLine();
        int digits = (line[1].length()+1)/4;
       
        char[][][] input = new char[6][100][10];
        
        for(int i=1; i<=5; i++){
            for(int j=0;j<line[1].length();j++)
            {
                input[i][j%4][j/4]=line[i].charAt(j);
                
            }
        }
        
        //for(int i=0; i<7;i++){
            for(int j=0;j<6;j++){
                System.out.println();
                for(int k=0;k<4;k++)
                {
                    System.out.print(input[k][j][1]);
                }
            }
        //}
    }
    
}
