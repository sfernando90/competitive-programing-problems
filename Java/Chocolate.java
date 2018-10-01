/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolate;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Chocolate {

    /**
     * @param args the command line arguments
     */
    static int count = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int input = sc.nextInt();
        int chocolateSize = 1;
        int result = 0;
        
        while (input > chocolateSize)
          chocolateSize = chocolateSize*2;  
        
        result = divideChocolate(input, chocolateSize, result);
       
        System.out.println(chocolateSize + " " + count + "\n");
        
    }
    
    public static int divideChocolate(int input, int chocolateSize, int result)
    {
      if (result == input )   
        return result;
     

      
      if (result + chocolateSize > input)
      {
        if(result + chocolateSize/2 <= input) { 
          result = chocolateSize/2 + result;
        }
        count++;
        result = divideChocolate(input, chocolateSize/2, result);
      }
      
      return result;
    }
    
}
