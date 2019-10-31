/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList.Single_Circular;

/**
 *
 * @author Abdullah
 */
public class Runner {
    public static void main(String[] args){
    LinkedList List=new LinkedList();
    List.AddatEnd(1);
    List.AddatEnd(5);
    List.AddatEnd(3);
    List.Display();
    List.Delete(3);
    System.out.println();
      List.Display();
    }
}
