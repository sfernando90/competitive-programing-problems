/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickestimates;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class QuickEstimates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int result = 0;
            int cases = sc.nextInt();
            sc.nextLine();
            
            int[] prices = null;
            
//            for(int i = 0; i < cases; i++){
//                prices[i] = sc.nextInt();
//                sc.nextLine();
//            }
            
            
            for(int i = 0; i < cases; i++){
                BigInteger price = new BigInteger( sc.next());
                if (price.equals(new BigInteger("0"))){
                    result = 1;
                }
                while(price.compareTo(new BigInteger("0")) > 0){

                   price = price.divide( new BigInteger("10"));
                   result++;
                }
              
                System.out.println(result);
                result = 0;
            }
    }
    
}
