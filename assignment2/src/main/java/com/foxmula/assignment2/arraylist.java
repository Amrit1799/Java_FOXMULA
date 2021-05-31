package com.foxmula.assignment2;

import java.util.*;

class arraylist{

    private void check_element(ArrayList<Integer> arr, int val,int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
            {
                if (arr.get(i)==val)
                    count++;
                   
            }
        if (count>0)
            System.out.println("Found");
        else
            System.out.println("Not found");       

    }

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            arraylist a = new arraylist();


            System.out.println("Enter number of elemets");
            ArrayList<Integer> arr= new ArrayList<Integer>();
            int n = sc.nextInt();
            System.out.println("Enter elements");
            for(int i=0;i<n;i++)
            {
                arr.add(sc.nextInt());
            }
            System.out.println("Enter number to check");
            int val = sc.nextInt();
            a.check_element(arr,val,n);

            sc.close();
    }
   
        
    }