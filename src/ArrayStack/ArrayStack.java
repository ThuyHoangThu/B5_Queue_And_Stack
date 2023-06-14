/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayStack;

/**
 *
 * @author ADMIN
 */
public class ArrayStack {
    public Node[] a;
    int top, max;
    // top = phan tu tren cung cua stack
    // max la kich thuoc toi da cua stack (co the chua bao nhieu element)
    
    public ArrayStack(int max){
        this.max = max;
        a = new Node[max];
        top = -1;
        
    }
    
    //isEmpty method
    
    public boolean isEmpty(){
        return top == -1;
    }
    //isFull method
    
    public boolean isFull(){
        return top == max - 1;
    }
    //Push method
     public void push(Node x) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element " + x);
            return;
        }

        top++;
        a[top] = x;
        
    }
    //Pop method
     public Node pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop any element");
            return null;
        }

        Node poppedElement = a[top];
        top--;
        return poppedElement;
    }
    // topEl method
     public Node topEl(){
         if(isEmpty()){
             System.out.println("Empty stack");
             return null;
         }
         
         else{
             return a[top];
         }
     }
     
     public void print(){
         for (int i = 0; i < a.length; i++) {
             a[i].printInfo();
             
         }
     }
    
}
