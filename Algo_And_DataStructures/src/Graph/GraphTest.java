package Graph;



public class GraphTest
{
 public static void main(String[] args)
 {
     String v[]={"A","B","C","D","E","F"};
     Graph graph = new Graph();
     
     for (int i=0;i<v.length;i++)
         graph.addVertex(v[i]);
         
     //add edges
     
     graph.addEdge("A","B");
     graph.addEdge("A","C");
     graph.addEdge("A","D");
     graph.addEdge("A","E");
     graph.addEdge("A","F");
     
     graph.addEdge("B","C");
     graph.addEdge("B","D");
     graph.addEdge("B","E");
     graph.addEdge("B","F");
     
     graph.addEdge("C","D");
     graph.addEdge("C","E");
     graph.addEdge("C","F");
     
     graph.addEdge("D","E");
     graph.addEdge("D","F");
     graph.addEdge("E","F");
     graph.addEdge("E","F");
     
     graph.display();
     System.out.println("\nI s graph Complete? " + graph.isComplete());
     graph.dfs("A");
     graph.bfs("A");
     
     graph.dfs("B");
     graph.bfs("B");

     
 }
}













