package StackAndQueue;

import java.util.Stack;

public class P1 {

    public Stack<Integer> s1 = new Stack();//data
    public Stack<Integer> s2 = new Stack();//min

    public Integer pop(){
        if(s1.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        Integer s1Top = s1.pop();
        if(s1Top == getMin()){
            s2.pop();
        }
        return s1Top;
    }

    public void push(Integer newNum){
        if(s2.isEmpty()){
            s1.push(newNum);
            s2.push(newNum);
        }else if(newNum <= getMin()){
            s2.push(newNum);
        }
        s1.push(newNum);
    }

    public int getMin(){
        if(s2.isEmpty()){
            throw new RuntimeException("stack is empty");
        }else{
            return s2.peek();
        }
    }

}
