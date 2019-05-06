/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author gjejen
 */
public class Stacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedStack<Integer> s = new LinkedStack<>();
        
        s.push(new Integer (1) );
        s.push(new Integer (2) );
        s.push(new Integer (3) );
        s.push(new Integer (4) );
        
        while (!s.isEmpty()){
            System.out.println("Top element is " + s.peek());
            System.out.println("Removed element is " + s.pop());
            System.out.println("length is " + s.getLength());
        }
    }
    
}
