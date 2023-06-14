/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayStack;

/**
 *
 * @author ADMIN
 */
public class MAin {
    public static void main(String[] args) {
        ArrayStack as = new ArrayStack(6);
        as.push(new Node(2));
        as.push(new Node(3));
        as.push(new Node(4));
        as.push(new Node(5));
        as.push(new Node(4));
        as.push(new Node(5));               
        
        System.out.println("OG stack is");
        as.print();
        System.out.println("New stack after pushing");
        as.push(new Node(12));
        as.print();
        
        System.out.println("Top element of the stack is ");
        Node x = as.topEl();
        x.printInfo();
        
        Node y = as.pop();
        System.out.println("Removed element is");
        y.printInfo();       
        
    }
}
