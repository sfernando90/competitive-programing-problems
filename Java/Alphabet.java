/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabet;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Alphabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toLowerCase();
        String output = "";
        
        for( int i = 0; i <input.length();i++){
            char c = input.charAt(i);
            
            if(c == 'a')
                output = output + "@" ;
            else if(c == 'b')
                output = output + "8" ;                     
            else if(c == 'c')
                output = output + "(";
            else if(c == 'd')
                output = output + "|)";            
            else if(c == 'e')
                output = output + "3";
            else if(c == 'f')
                output = output + "#";            
            else if(c == 'g')
                output = output + "6";
            else if(c == 'h')
                output = output + "[-]" ;            
            else if(c == 'i')
                output = output + "|" ;
            else if(c == 'j')
                output = output + "_|";            
            else if(c == 'k')
                output = output + "|<";
            else if(c == 'l')
                output = output + "1" ;            
            else if(c == 'm')
                output = output + "[]\\/[]";
            else if(c == 'n')
                output = output + "[]\\[]" ;            
            else if(c == 'o')
                output = output + "0";
            else if(c == 'p')
                output = output + "|D" ;            
            else if(c == 'q')
                output = output + "(,)" ;
            else if(c == 'r')
                output = output + "|Z" ;               
            else if(c == 's')
                output = output + "$" ;
            else if(c == 't')
                output = output + "']['" ;            
            else if(c == 'u')
                output = output + "|_|" ;
            else if(c == 'v')
                output = output + "\\/" ;
            else if(c == 'w')
                output = output + "\\/\\/" ;
            else if(c == 'x')
                output = output + "}{" ;            
            else if(c == 'y')
                output = output + "`/" ;
            else if(c == 'z')
                output = output + "2";
            
            else
                output = output + c;
        }

       System.out.println(output);
    }
    
}
