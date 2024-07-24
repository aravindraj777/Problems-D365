package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphTwo {

   private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

   public boolean addVertices(String vertex){
       if (adjList.get(vertex) == null){
           adjList.put(vertex,new ArrayList<>());
           return true;
       }
       return false;
   }

   public boolean addEdge(String source, String destination){
       if (adjList.get(source) != null && adjList.get(destination)!= null){
           adjList.get(source).add(destination);
           adjList.get(destination).add(source);
           return true;
       }
       return false;
   }

//   private void print(){
//       System.out.println(adjList);
//   }

    public void printGraph(){
        for (String vertex : adjList.keySet()) {
            System.out.print(vertex + ": ");
            for (String edge : adjList.get(vertex)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

       GraphTwo graph= new GraphTwo();
       graph.addVertices("A");
       graph.addVertices("B");
       graph.addVertices("C");
       graph.addVertices("D");
       graph.addVertices("E");

       graph.addEdge("A","B");
       graph.addEdge("B","C");
       graph.addEdge("C","D");
       graph.addEdge("A","D");
       graph.addEdge("C","A");

       graph.printGraph();
    }
}
