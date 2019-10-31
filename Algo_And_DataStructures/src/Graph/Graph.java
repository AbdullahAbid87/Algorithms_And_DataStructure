package Graph;


import java.util.*;

public class Graph
{
    List<Vertex> V;

    public Graph()
    {
        V = new LinkedList<Vertex>();
    }
    
    public void addVertex(String s)
    {
        Vertex a = new Vertex(s);
        V.add(a);        
    }
    
    public void addEdge(String s, String t)
    {
        Vertex u  = null;
        Vertex w  = null;
        for (int i=0; i<V.size();i++)
             if (V.get(i).name.equals(s))
                { u = V.get(i);
                  break;
                }
        
        for (int i=0; i<V.size();i++)
             if (V.get(i).name.equals(t))
                { w = V.get(i);
                  break;
                }

        if (u!=null && w!=null)
          {
              if (! u.list.contains(w))
                       u.list.add(w);
              if (! w.list.contains(u))
                       w.list.add(u);
           }
    }
    
    public void display()
    {
     for (Vertex a: V)
        {
            System.out.print("\n\t" + a.name + "===>");
            for (Vertex b: a.list)
                System.out.print(b.name + "->");
            System.out.print("#");
        }     
    }
    
    public void bfs(String start)
    {
         Vertex u  = null;
          for (int i=0; i<V.size();i++)
             if (V.get(i).name.equals(start))
                { 
                  u = V.get(i);
                  break;
                }
         if (u==null) return;
         
         Queue<Vertex> Q = new LinkedList<Vertex>();
         List<Vertex> visited = new LinkedList<Vertex>();
         Q.add(u);
         System.out.print("\n bfs = ");
         
         while (!Q.isEmpty())
         {
             u = Q.remove();
             System.out.print(u.name+" > ");
             visited.add(u);

             for (int i=0;i<u.list.size();i++)
                {
                    Vertex v=u.list.get(i);
                    if (!visited.contains(v) && !Q.contains(v))
                          Q.add(v);
                }
         }        
    }
    
    public void dfs(String start)
    {
         Vertex u  = null;
          for (int i=0; i<V.size();i++)
             if (V.get(i).name.equals(start))
                { 
                  u = V.get(i);
                  break;
                }
         if (u==null) return;
         
         //Stack<Vertex> S = new Stack<Vertex>();
         //Queue<Vertex> S = new LinkedList<Vertex>();
         List<Vertex> visited = new LinkedList<Vertex>();
         //S.add(u);
         int no_vertices = V.size();
         System.out.print("\n dfs = ");
         do
         {
             System.out.print(u.name+" > ");
             visited.add(u);
             
             for (int i=0;i<u.list.size();i++)
                {
                    Vertex v = u.list.get(i);
                    if (!visited.contains(v))
                       {
                           u = v;
                           break;
                        }
                 }    
         } while (visited.size()!= no_vertices);       
    }
    
    public boolean isComplete()
    {
        int n = V.size();
        //System.out.print("\nn="+n);
        int totalEdges = n*(n-1);/// 2;
        int storedEdges=0;
        for (Vertex x: V)
            storedEdges += x.list.size();
            
        //System.out.print("\n Total  Edges: " +totalEdges);
        //System.out.print("\n Stored Edges: " +storedEdges);
        return (storedEdges == totalEdges);
    }
}
