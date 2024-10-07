package graph;

import java.util.HashMap;

public class WeightedDirected {

    private HashMap<String, HashMap<String,Integer>> adjList = new HashMap<>();

    private boolean addVertices(String vertex){
        if (!adjList.containsKey(vertex)){
            adjList.put(vertex,new HashMap<>());
            return true;
        }
        return false;
    }

    private boolean addEdge(String source, String destination,int weight){
        if (adjList.containsKey(source) && adjList.containsKey(destination)){
            adjList.get(source).put(destination,weight);
            return true;
        }
        return false;
    }

//    public void printGraph(){
//        System.out.println(adjList);
//    }

    public void printGraph() {
        for (String vertex : adjList.keySet()) {
            System.out.print(vertex + " -> ");
            HashMap<String, Integer> edges = adjList.get(vertex);
            for (String edge : edges.keySet()) {
                System.out.print(edge + "(" + edges.get(edge) + ") ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        WeightedDirected weightedGraph = new WeightedDirected();
        weightedGraph.addVertices("A");
        weightedGraph.addVertices("B");
        weightedGraph.addVertices("C");
        weightedGraph.addVertices("D");
        weightedGraph.addVertices("E");

        weightedGraph.addEdge("A","B",3);
        weightedGraph.addEdge("A","C",5);
        weightedGraph.addEdge("B","D",7);
        weightedGraph.addEdge("D","E",4);
        weightedGraph.addEdge("C","E",7);

        weightedGraph.printGraph();



    }
}
