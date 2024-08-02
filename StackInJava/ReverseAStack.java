package StackInJava;
import java.util.*;
public class ReverseAStack {
    
    //there are two types of stack: implicit and Explicit
    //implicit: Recursion stack
    //explicit stack: Class stack
    /*To solve this problem first remove all elements and then push new element at bottom of the stack */
    public static void pushAtBottom(int data,Stack<Integer>s){
        if (s.isEmpty()) {
            s.push(data);
            return;
            
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void reverse(Stack<Integer>s){
        if (s.isEmpty()) {
            return;
            
        } else {
            
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while (s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }


    }
}
