/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayStack;

/**
 *
 * @author ADMIN
 */
public class ArrayStackImplement {
    public static void main(String[] args) {
        decToBin(11);
    }
    
    public static void decToBin(int k){
        ArrayStack s = new ArrayStack(5);
        System.out.println(k + " in binary system is: ");
        while(k>0){
            s.push(new Node(k%2));
            k=k/2;
            
        }
        while(!s.isEmpty()){
            Node y = s.pop();
            y.printInfo();
        }
        System.out.println("");
    }
    
}
