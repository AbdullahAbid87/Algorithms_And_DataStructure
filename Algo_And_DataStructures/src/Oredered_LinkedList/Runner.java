/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oredered_LinkedList;

/**
 *
 * @author Abdullah
 */
public class Runner {
  public static void main(String[] args){
    LinkedList list=new LinkedList();
        list.Insert(2);
        list.Insert(1);
        list.Insert(5); 
        
        list.Display(); 
        System.out.println("\n"+list.Count());
                }
}
