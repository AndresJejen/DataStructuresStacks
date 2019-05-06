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
public class LinkedStack<T> implements Stack<T> {
   
    protected ChainNode<T> topNode;

    protected int length;
    
    public int getLength() {
        return length;
    }
    
    public LinkedStack () {
        this.length = 0;
    }
    
    @Override
    public boolean isEmpty(){
        return topNode == null;
    }
    
    @Override
    public T pop(){
        try{
            if (isEmpty()) throw new Exception("Error");
            T topElement = this.topNode.getElement();
            topNode = topNode.getNext();
            this.length -= 1;
            return topElement;
        }
        catch(Exception error){
            System.out.println(error.getMessage());
            return null;
        }
    }
    
    @Override
    public T peek(){
        try{
            if (isEmpty()) throw new Exception("Error");
            return topNode.getElement();
            
        }
        catch(Exception error){
            System.out.println(error.getMessage());
            return null;
        }
    }
    
    @Override
    public void push (T theobject){
        this.topNode = new ChainNode<T>(theobject,this.topNode);
        this.length += 1;
    }
    
}
