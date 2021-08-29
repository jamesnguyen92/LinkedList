/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistqueuedriver;

import java.util.Random;

/**
 *
 * @author james
 */
public class LinkedListQueueDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedQueue queue = new LinkedQueue();
        Customer c = new Customer();
        Random rand = new Random();
        int count = 0;
        int total = 0;        
        for(int i = 0; i < 60; i++){    
            if (rand.nextInt(100)+ 1 <= 25){
                queue.enqueue(new Customer ()); //add customer
                count++; 
                System.out.println("New customer, more money :D " + count);
                //updates counter
               if(queue.getSize() > count){
                   count = queue.getSize();
               }
            }
            //create a customer object and point to top of queue
            Customer remove = queue.top(); 
            if(remove != null){
                remove.decServiceTime();
                if(remove.getServiceTime() ==0){
                queue.dequeue(); //remove the top element
                System.out.println("We're done with this customer, next! "+queue.getSize());
                total++; 
                }
            }
            System.out.println(" - - - -  - - - - - - - - --  -- - - - - ");
                  
        }
    System.out.println("The maximum queue length is: " + count );
    System.out.println("The total customer serviced is: " + total );  
    }
    
}
