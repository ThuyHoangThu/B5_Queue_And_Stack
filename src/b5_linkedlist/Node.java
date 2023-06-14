/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b5_linkedlist;

/**
 *
 * @author ADMIN
 */
public class Node {
    int info;
    Node prev;
    Node next;

    public Node(int info, Node next, Node prev) {
        this.info = info;
        this.prev = prev;
        this.next = next;
    }
}
