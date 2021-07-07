package com.algo;

import java.util.LinkedList;
import java.io.*;
import java.util.*;


public class BFS {
	
	
	static int V; // No of vertices
    static LinkedList<Integer> adj[];
	
    
	BFS(int v){
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
	  }
	
	void addEdge(int v, int w) {	
		 adj[v].add(w); 
	}
	
	
	void BFSTraversal(int node) {
		
		boolean visited[] = new boolean[V];
		 
        LinkedList<Integer> queue = new LinkedList<Integer>();
		
        visited[node] = true;
        queue.add(node);
        
        while(queue.size() != 0) {
        	
        	node = queue.poll();
        	
        	Iterator<Integer> i = adj[node].listIterator();
        	 while(i.hasNext()) {
        		 int n = i.next();
        		 if (!visited[n])
                 {
                     visited[n] = true;
                     queue.add(n);
                 }
        	 }	
        }		
	}
	
	
	public static void main(String[] args) {
		
		
		  BFS g = new BFS(4);
		  
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
		
	        g.BFSTraversal(0);
		
	}


}
