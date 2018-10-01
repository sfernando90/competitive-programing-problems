/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix.keypad;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class MatrixKeypad {

    /**
     * @param args the command line arguments
     */
    
    //public static boolean[][] keypad;
    public static int[] r = {0};
    public static int[] c = {0};
    
    public static void main(String[] args) {
          
         Scanner sc = new Scanner(System.in);
         int cases = sc.nextInt();
         
         for(int i=0; i<cases; i++){
             int rows = sc.nextInt();
             int colums = sc.nextInt();
//             keypad = new boolean[rows][colums];
             r =  new int[rows];
             c =  new int[colums];

             
             for(int j=0; j<rows ;j++){
                 String input = sc.next();
//                 System.out.println("\n"+input+"\n");
                 for(int k=0; k<colums; k++){
//                     System.out.println(input.charAt(k));
                     if(input.charAt(k)=='1'){
//                        keypad[j][k] = true;
                        r[j] += 1;
                        c[k] += 1;
                     }
                 }
             }
            printResult();
         }   
    }
    
    public static void printResult(){
      if(allOnes(r)&&allOnes(c))  {

           System.out.println("impossible");           
            
      }
      else{
        for(int i=0; i<r.length; i++){
            for(int j=0; j< (c.length); j++){
//                System.out.print(keypad[i][j]);
                if(r[i]==1 && c[j]==1)
                    System.out.print("P");
                else if(r[i]>0 && c[j]>0)
                    System.out.print("I");
                else if(r[i]==0 || c[j]==0)
                    System.out.print("N");                
            }
            System.out.println("");          
        }
    }

      
      System.out.println("----------");
    }
    
    public static boolean allOnes(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0)
                return false;
        }
        return true;
    }
}
