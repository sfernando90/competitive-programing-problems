/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iboard;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Iboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in); 
        String s;
        
        while(kb.hasNext()){
            
            s = kb.nextLine();
            int countZeroes = 0;
            int countOnes = 0;

            for(int i = 0 ; i < s.length() ; i++ )
            {
             countZeroes += n0(s.charAt(i));
             countOnes += n1(s.charAt(i));
            }
            
            if(countOnes%2 ==0 && countZeroes%2 ==0 )
                System.out.println("free");
            else
                System.out.println("trapped");
            
                     
        }
 
    }
    
    public static int n1 (char a)
    {
        int cnt = 0 ;
        for(int i = 0 ; i < 8 ; i++)
        {
            if( (a & (0x01<<i)) != 0 )
                cnt++;
        }
        return cnt;
    }
    public static int n0 (char a)
    {
        int cnt = 0 ;
        for(int i = 0 ; i < 8 ; i++)
        {
            if( (~a & (0x01<<i)) != 0 )
                cnt++;
        }
        return cnt;
    }
        }
    

