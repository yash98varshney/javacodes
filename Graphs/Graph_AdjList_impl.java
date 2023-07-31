package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Graph_AdjList_impl {
    
    static public HashMap<Integer , List<Integer>> adj;

    static void addEdge(int u,int v,boolean direction){

        //direction = 0 -> undirected
        //direction = 1 -> directed graph

        // create an edge from u to v 
        if(!adj.containsKey(u)){
            adj.put(u, new ArrayList<Integer>(v));
        }
        else{
            List<Integer> get=adj.get(u);
            get.add(v);
            adj.put(u,new ArrayList<>(get));
        }
        
        if(direction==false){
            if(!adj.containsKey(v)){
                adj.put(u, new ArrayList<Integer>(u));
            }
            else{
                List<Integer> get=adj.get(v);
                get.add(u);
                adj.put(v,new ArrayList<>(get));
            }
        }
    }

    public static void printAdjList(){
        for(Integer i:adj.keySet()){
            System.out.print(i+ "->"+adj.get(i));
            System.out.println();
        }
    }

    
}
