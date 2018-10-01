/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiddenpassword;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class HiddenPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        String pass =sc.next();
        boolean valid = true;
        int keyCount=0;
        
        for(int i=0; i<pass.length();i++){
            char a= pass.charAt(i);
            if (a==key.charAt(keyCount))
            {keyCount++;}
            
            else{
            for(int j=keyCount; j<key.length();j++){
                    if(a==key.charAt(j))
                        valid=false;
                }
            }
       
            if(keyCount==key.length())
                break;
        }
        if(keyCount!=key.length())
            valid=false;
        
        if(valid)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        
    }
    
}
