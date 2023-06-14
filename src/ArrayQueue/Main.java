/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayQueue;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        MyQueue as = new MyQueue(6);
        as.enqueue(new Node(2));
        as.enqueue(new Node(3));
        as.enqueue(new Node(4));
        as.enqueue(new Node(5));
        as.enqueue(new Node(4));
        as.enqueue(new Node(5));       
       
        
        System.out.println("OG Queue is");
        as.print();
    }  
       
}
