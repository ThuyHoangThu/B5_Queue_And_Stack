/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circular_LinkedList;

/**
 *
 * @author ADMIN
 */
public class MyList {
    Node head;

    // Method to add a node at the end of the circular linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node currentNode = head;
            while (currentNode.next != head) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.next = head;
        }
    }
    
    public void display() {
        if (head == null) {
            return;
        }

        Node currentNode = head;
        do {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        } while (currentNode != head);
        System.out.println();
    }
}
