package com.foxmula.assignment2;

import java.util.*;

public class occurance {
    private static ArrayList<Integer> arr=new ArrayList<Integer>();

    void push(int data)
    {
        arr.add(data);
    }

    int display_occurance(ArrayList<Integer> arr,int x)
    {
        return Collections.frequency(arr, x);
        }
    

    public static void main(String[] args) {
        occurance t = new occurance();
		 Scanner sc = new Scanner(System.in);
		 
		 int c, data,count=0;

		 while(true) {
            System.out.println("1.Enter Data");
            System.out.println("2.Display Occurance");
			 c = sc.nextInt();
			 switch(c) {
			 case 1: System.out.println("Enter data");
				 	 data = sc.nextInt();
			 		 t.push(data);
                      count++;
			 		 break;
			 case 2:
                    for(int i=0;i<count;i++)
			 		System.out.println("Frequency of"+t.display_occurance(arr,arr.get(i)));
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
