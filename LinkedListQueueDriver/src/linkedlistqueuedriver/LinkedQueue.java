/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistqueuedriver;

/**
 *
 * @author james
 */
public class LinkedQueue {
    //variable creation
    Customer first, last; 
    int size = 0;
    
    LinkedQueue(){ //constructor
        first = null;
        last = null;
    }
    //add customer into queue
    public void enqueue(Customer c){
        if(first == null){
            first = c;
            last = c;
        }else{ //set the added element equal to last
            last.setNext(c); 
            last = c;
        }
        size ++;
    }
    //remove customer from queue
    public Customer dequeue(){
        if(first == null){
            return null;
        }else if (first == last){
            Customer temp = first;
            first = null;
            size--;
            return temp;
        }else{
            Customer temp = first;
            first = first.getNext();
            size --;
            return temp;
        }
    }
    //Check the top element of stack
    public Customer top(){
        if(first == null){ //check for anything inside
            return null;
        }else { //return first, if something is inside
            return first;
        }
    }
    
    public void decServiceTime(){
        first.decServiceTime();
        if(first.getServiceTime() == 0);{
            System.out.println("Next!");
            dequeue();
        }
        
    }
    //return the size of queue
    public int getSize() {
        return size;
    }
    
    
}
