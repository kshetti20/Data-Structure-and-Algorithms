package com.algo;

import java.io.*;
import java.util.*;

public class DFS {
	
	static int V; // No of vertices
    static LinkedList<Integer> adj[];
	static int valueToSearch = 3;
    
    
	DFS(int v){
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
		
	  }
	
	void addEdge(int v, int w) {
		
		 adj[v].add(w); 
	}
	
	public static void main(String[] args) {
		DFS g = new DFS(4);
		
		
		 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	        
	        
	        callDFS(2);
	}

	private static void callDFS(int startNode) {

		if(startNode == valueToSearch)
			return;
		
		boolean visited[] = new boolean[V];
		
		DFSUtil(startNode, visited);
		
		
		/*
		 * Following code completes the Depth first traversell 
		 * if there are any discontinuity between nodes
		 */
//		for (int i = 0; i < V; ++i) {
//			if (visited[i] == false)
//                DFSUtil(i, visited);
//		}
		
	}

	private static void DFSUtil(int node, boolean[] visited) {
		
		System.out.println(node + "");
		
		if(node == valueToSearch)
			return;
		
		visited[node] = true;
		
		Iterator<Integer> i = adj[node].listIterator();
		
		while(i.hasNext()) {
			
			int n = i.next();
			if(!visited[n])
				DFSUtil(n, visited);
			
		}
	}
	
	
	
}
