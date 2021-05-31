package com.foxmula.assignment2;

import java.util.*;


public class set {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of elemets");
            Set<Integer> arr= new HashSet<Integer>();
            int n = sc.nextInt();
            System.out.println("Enter elements");
            for(int i=0;i<n;i++)
            {
                arr.add(sc.nextInt());
            }
            System.out.println("Enter number to check");
            int val = sc.nextInt();
            System.out.println(arr.contains(val));

            sc.close();
            
    }
    
}
