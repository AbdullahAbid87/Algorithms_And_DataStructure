package dynamic_heap;

public class dynamic_heap {

    private Node root;
    int count;
    int index;

    public dynamic_heap() {
        root = null;
    }

    public void Insert(int v) {
        Node CurrentNode = new Node();
        CurrentNode.data = v;
       
        if (root == null) {
            root = CurrentNode;
            root.parent = CurrentNode;

        }else if(root.parent.leftchild==null)
        {
            root.parent.leftchild=CurrentNode;
        }else if(root.parent.rightchild==null){
                root.parent.rightchild=CurrentNode;
        }else
            root.parent=root.leftchild;
            

    }
    public void Display(){
        System.out.println(root.parent.data);
        System.out.println(root.parent.leftchild.data);
          System.out.println(root.parent.rightchild.data);
    }
    private void HeapUp(int i) {

    }
    public static void main(String[] args) {
        dynamic_heap DH=new dynamic_heap();
        DH.Insert(1);
        DH.Insert(2);
       DH.Insert(3);
       
        DH.Display();
    }
}
