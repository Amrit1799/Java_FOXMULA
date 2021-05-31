package com.foxmula.assignment2;

import java.util.*;

public class sumk {

    public void check(ArrayList<Integer> arr,int sum)
    {
        for(int i=0;i<arr.size();i++)
        {
            int temp=sum - arr.get(i);

            if (arr.contains(temp))
                System.out.println("Pair:-("+temp+","+arr.get(i)+")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sumk s = new sumk();

            System.out.println("Enter number of elemets");
            ArrayList<Integer> arr= new ArrayList<Integer>();
            int n = sc.nextInt();
            System.out.println("Enter elements");
            for(int i=0;i<n;i++)
            {
                arr.add(sc.nextInt());
            }
            System.out.println("Enter number to check");
            int sum = sc.nextInt();
            s.check(arr, sum);

            sc.close();


    }
    
}
