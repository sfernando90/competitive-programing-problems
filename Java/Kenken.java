/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kenken;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Kenken {

    static int n;
    static int numSquares;
    static int target;
    static int[][] location = new int[10][2];
    static int count = 0;
    static int[] prev= new int [10];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         
         n = sc.nextInt();
         numSquares = sc.nextInt();
         target = sc.nextInt();
         String c = sc.next();
         
        
         for(int i = 0; i < numSquares; i++){
             int x = sc.nextInt();
             int y = sc.nextInt();
             location[i][0] = x;
             location[i][1] = y;
         }

        switch (c) {
            case "+":
                for(int i = 1; i <= n  ;i++){
                    
                    sum (i, 1);
                }   break;
            case "*":
                for(int i = 1; i <= n  ;i++){
                    
                    mul (i, 1);
                }   break;
            case "-":
                for(int i = 1; i <= n  ;i++){

                minus (i);
                }   break;
            case "/":
                for(int i = 1; i <= n  ;i++){

                    div (i);
            }   break;
        }
        
         
            System.out.println(count);

         
    }
    
    public static int sum(int s, int h){
     
        prev[h] = s;
        
        if(h == numSquares){
            if(s == target){
                count++;
            }
                
        return 0;
        }
        
        else{
            for (int i = 1; i <= (n - s);i++){
                System.out.printf("i = %d on line 85 \n",i);
                if(valid(i,h+1)){
                    int t = sum(s+i , h+1);
                    System.out.printf("on line 88 sum = %d \n", t);
                }
            }
        }
        return 0;
    }    
         
    public static int mul(int s, int h){
        if(h == numSquares){
            if(s == target)
                count++;
        return 0;
        }
        
        else{
            for (int i = 1; i <= target ;i++){
                if(valid(s,h))
                    mul(s*i , h+1);
            }
        }
        return 0;
    }    
    
    public static void minus(int s){
        
        for(int i=1; i <= n; i++ ){
            if(s-i == target)
                count++;
            else if(i-s == target)
                count++;
            
        }
        
    }
    
        public static void div(int s){
        
        for(int i=1; i <= n; i++ ){
            if(s/i == target)
                count++;
            if(i/s == target)
                count++;
            
        }
        
    }
        
    public static boolean valid(int s, int h){
        System.out.printf("", location);
        for(int i = 0; i < h-2; i++){
            if(prev[i] == s){
                for(int j = 0; j < h-2;j++){
                if(location[j][0] == location[h][0] || location[j][1] == location[h][1])
                    return false;
                }
            }
                
        }
            
            return true;
            
    }    
    
}
