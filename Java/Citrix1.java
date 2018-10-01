/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citrix1;

import java.util.Stack;

/**
 *
 * @author fernando
 */
public class Citrix1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
         Stack s = new Stack();
         Stack s2 = new Stack();
        int i=0;
        String[] values = new String[2];
        values[0]="{}()[]";
        values[1]="{)";
        String val;
        String[] results= new String[values.length]; 
        boolean fail = false;
        String check;
        while(i<values.length){
         val=values[i];    
        if(val.length()%2==1){
            fail=true;
            System.out.println("odd");
        }
        else{  
        for(int j=0; j < val.length();j++){
           if(val.charAt(j)=='['||val.charAt(j)=='('||val.charAt(j)=='{'){
                s.push(val.charAt(j));
            }
           else if(val.charAt(j)==']'||val.charAt(j)==')'||val.charAt(j)=='}'){
               check = s.pop().toString();
            if(val.charAt(j)==')'){
               if(check.equals("("))
               {
               }
               else{
                 fail=true;
               } 
            }
               else if(val.charAt(j)=='}'){
                   if(check.equals("{"))
               {
               }
               else{
                 fail=true;
               } 
            }
            else if(val.charAt(j)==']'){
               if(check.equals("["))
               {
               }
               else{
                 fail=true;
                   
               } 
            }
           }
        }

        
//        while(!s.empty()){
//            Object a = s.pop();
//            Object b = s2.pop();
//            a.toString();
//            b.toString();
//            System.out.println(a);
//            System.out.println(b);
//            if(a.equals(')')){
//               if(b.equals('('))
//               {
//               }
//               else{
//                 fail=true;
//               } 
//            }
//               else if(a.equals('}')){
//                   if(b.equals('{'))
//               {
//               }
//               else{
//                 fail=true;
//               } 
//            }
//            else if(a.equals(']')){
//               if(b.equals('['))
//               {
//               }
//               else{
//                 fail=true;
//                   
//               } 
//            }
//            else
//            {
//                fail=true;
//            }
//            System.out.println(i);
//           results[i]="YES";
//        }
        }
        if(fail){
            results[i]="NO";
        }
        else
            results[i]="YES";
        i++;
        }
        
        //System.out.println(results[0]);
        //System.out.println(results[1]);
        //System.out.println(i);

    }
    
    
}
