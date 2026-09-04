//package com.snpsu.DataStructure.Graphs.Traversal.BFS;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class GraphDFS {
//    int v;
//    GraphDFS(int v){
//        this.v=v;
//    }
//    private void dfsRec(int srcNode,HashMap<Integer,ArrayList<Integer>>adjList,boolean[]visited,ArrayList<Integer>ans){
//        dfsRec(0,adjList,visited,ans);
//    }
//}
//ArrayList<Integer>dfsTraversal(HashMap<Integer,ArrayList<Integer>>adjList){
//    boolean[]visited=new boolean[v];
//    ArrayList<Integer>ans=new ArrayList<>();
//
//    return ans;
//}
//class DriverCode{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number of Nodes and Edges:");
//        int n = sc.nextInt();//num of nodes
//        int e = sc.nextInt();//num of edges
//
//        //Adjacency ListL
//        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
//        //creating an emptyList for every node
//        for (int i = 0; i < n; i++) {
//            adjList.put(i, new ArrayList<>());
//        }
//        //add edges
//        for (int i = 1; i <= e; i++) {
//            System.out.println("Enter Edge" + i + ":");
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            adjList.get(u).add(v);
//        }
//        //print AdjList(Optional)
//        System.out.println("AdjList:");
//        for (int i : adjList.keySet()) {
//            System.out.println(i + "->" + adjList.get(i));
//        }
//    }