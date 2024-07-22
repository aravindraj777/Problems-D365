package graph;

public class GraphOne {

    private int v;
    private int e;
    private int[][] adjMatrix;

    public GraphOne(int nodes){
        this.v = nodes;
        this.e = 0;
        this.adjMatrix =  new int[nodes][nodes];
    }

    public void addEdge(int u,int v){
        adjMatrix[u][v] = 1;
        adjMatrix[u][v] = 1;
        e++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(v +"Vertices" + ","+ e +"Edges"+ "\n");
        for (int ver = 0 ;ver < v ; ver++){
            sb.append(ver+" : ");
            for (int w : adjMatrix[ver]){
                sb.append(w+ " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        GraphOne graph = new GraphOne(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        graph.toString();
        System.out.println(graph);
    }
}
