package com.foxmula.assignment2;

import java.util.*;

public class travelhashset {

    private HashSet<Integer> h = new HashSet<Integer>();

    void push(int data)
    {
        h.add(data);
    }
    void display()
    {
        Iterator<Integer> it = h.iterator();
        while(it.hasNext())
        {
           System.out.print(it.next()+" "); 
        }
    }
    public static void main(String[] args) {

        travelhashset t = new travelhashset();
		 Scanner sc = new Scanner(System.in);
		 
		 int c, data;

		 while(true) {
            System.out.println("1.Enter Data");
            System.out.println("2.Display HashSet");
			 c = sc.nextInt();
			 switch(c) {
			 case 1: System.out.println("Enter data");
				 	 data = sc.nextInt();
			 		 t.push(data);
			 		 break;
			 case 2: 
			 		t.display();
                     System.out.println("\n");
			 		break;
			 default: System.out.println("Exit");
			 }
			 if (c>2) {
				break;
			 }
		 }
        
         sc.close();
        
    }
    
}
