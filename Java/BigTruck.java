/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigtruck;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class BigTruck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int numLocations = sc.nextInt();
            sc.nextLine();  
            int[] items = null;
            int[][] roadLength = null;
            int[] visited = null;
            ArrayList<ArrayList<Integer>> adjacent = null;
            for(int i = 1; i<numLocations + 1; i++){
                items[i]=sc.nextInt();
            }
            sc.nextLine();
            int numRoads = sc.nextInt();
            sc.nextLine();
            
            for(int j = 0; j < numRoads; j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int d = sc.nextInt();
                
                
                roadLength[a][b] = d;
            }
            
            for(int i = 0; i < numLocations ; i++){
                
            }
    
    }
    
    static int dfs(int a, int b, int d){
        
        
        
    }
    
}
