package com.foxmula;
import java.util.Scanner;

class Stack_imp{

    private int currsize;
    
    private class Node{
        int data;
        Node next;
        }
   
        Node top;
        Stack_imp()
        {
            this.top=null;
            this.currsize=0;
        }
        
        public int getSize()
        {
            return currsize;
        }
        
        public void push(int x)
        {
            Node temp=new Node();
            temp.data=x;
            temp.next=top;
            top=temp;
            currsize++;
        }
        public int pop()
        {
            if(top==null)
            {
                System.out.println("Stack Underflow");
                return 0;
            }
            int del=top.data;
            top=top.next;
            currsize--;
            return del;
        }
    
        public boolean isEmpty()
        {
            return top==null;
        }
        

        void display(Stack s1,Stack s2)
        {
        if(s1.getSize()==s2.getSize())
            System.out.println("Number of elements"+s1.getSize());
        }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        Stack s1=new Stack(5);
        Stack s2=new Stack(5);

        int ch,data;

        while(true)                                 //menu driver
        {
        System.out.println("\n1. Push stack 1");
        System.out.println("2. Push stack 2");
        System.out.println("3. Pop stack 1");
        System.out.println("4. Pop stack 2");
        System.out.println("Enter choice : ");
        ch=sc.nextInt();
                

        switch(ch)
        {
        case 1:
            System.out.println("Enter data");
            data=sc.nextInt();
            s1.push(data);
            s1.display(s1,s2);
            break;
        case 2:
            System.out.println("Enter data");
            data=sc.nextInt();
            s2.push(data);
            s1.display(s1,s2);
            break;
        case 3:
            System.out.println(s1.pop());
            s1.display(s1,s2);
            break;
        case 4:
            System.out.println(s2.pop());
            s1.display(s1,s2);
            break;
        default:
            System.out.println("Exit");
        }
        if(ch>4)
            break;        
        }
    }
}


