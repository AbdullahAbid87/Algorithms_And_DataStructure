package Graph;

import java.util.*;

public class Vertex
{
    public String name;
    public List<Vertex> list;
    
    public Vertex(String S)
    {
        name = S;
        list = new LinkedList<Vertex>();
    }

}
