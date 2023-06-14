/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayQueue;

/**
 *
 * @author ADMIN
 */
public class MyQueue {
    int max;
    int first, last;
    public Node[] a;
    // top = phan tu tren cung cua stack
    // max la kich thuoc toi da cua stack (co the chua bao nhieu element)
    
    public MyQueue(int max){
        this.max = max;
        a = new Node[max];
        first = last = -1;
        
    }
    
    //isEmpty method
    
    public boolean isEmpty(){
        return first == -1;
    }
    //isFull method
    
    public boolean isFull(){
        return ((first == 0 && last == max -1));
    }
    //Push method
    private boolean grow(){
        int i, j;
        int max1 = max + max/2;
        Node[] a1 = new Node[max];
        if (a1 == null) return false;
        if (first <= last){
            for (i = first; i <= last; i++) {
                a1[i - first] = a1[i];
            }
        }else{
            for (i = first; i <= last; i++) {
                a1[i - first] = a1[i];
            }
            for (j = 0; j <= last; j++) {
                a1[j + max - first] = a1[j];
            }
        }
        
        a = a1;
        max = max1;
        int size;
        if (first <= last) {
            size = last - first + 1;
        } else{
            size = max - first + last + 1;
        }
        first =0;
        last = size - 1;
        return true;
        
    }
    
    public void enqueue (Node x){
        if (isFull() && !grow()) {
            return;
        }
        
        if (last == max -1 || last == -1) {
            a[0] = x;
            last = 0;
            if (first == -1){
                first = 0;
            }
            else{
                a[++last] = x;
            }
        }
    }
    
    public Node dequeue() throws Exception {
        if (isEmpty()) throw new Exception("The queue is empty");
        Node x = a[first];
        if (first == last){
            first = last = -1;
        } else if (first == max - 1){
            first = 0;
        } else{
            first++;
        }
        return x;
    }
     public void print(){
         for (int i = 0; i < a.length; i++) {
             a[i].printInfo();
             
         }
     }
    
}
