package com.foxmula.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class SortFrequency {

    public void occurrenceCount(int[] arr, int n ,HashMap<Integer, Integer> map) {
    
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
    
    }

    public void printSortedOrder(HashMap<Integer, Integer> hmap)
    {
        ArrayList<Entry<Integer, Integer>> arr_lst = new ArrayList<>(hmap.entrySet());
        Collections.sort(arr_lst, new Comparator<HashMap.Entry<Integer, Integer>>(){

            public int compare(HashMap.Entry<Integer, Integer> o1, HashMap.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("Sorted Array");

        arr_lst.forEach(n->System.out.print(n.getKey() + " "));
        
    }

    public static void main(String[] args) {
        SortFrequency sf = new SortFrequency();

        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();

        System.out.println("Enter no of elements");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sf.occurrenceCount(arr,n,hm);
        sf.printSortedOrder(hm);
        
    }

    
}
