/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booleantree;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class BooleanTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
            
            int cases = sc.nextInt();
            sc.nextLine();
            int nodes = sc.nextInt();
            int V = sc.nextInt();
 
            
            
            
            Node node1 = new Node();
            node1.gate = sc.nextInt();
            node1.change = sc.nextInt();
            
            Node lnode = node1.left;
            Node rnode = node1.right;
            
            for(int i = 0; i < cases ; i++){
                populateTree(lnode, sc.nextInt(), sc.nextInt());
                populateTree(rnode, sc.nextInt(), sc.nextInt());
                
            }
            
    }
    
    public static void populateTree(Node node,int g,int c){
        
        node.gate = g;
        node.change = c;
        

    }
    
}



class Node{
    
    int minFlips;
    int gate;
    int change;
    

    
    Node left;
    Node right;
}

