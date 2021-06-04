package com.foxmula.assignment3;

import java.util.*;



public class InvalidNumber{

    static boolean isPrime(Integer n){
        
        int count = 0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0){
                count++;
                break;
            }
        }

        if (count==0)  return true;
        else   return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        Integer n = sc.nextInt();

        try{
            if(isPrime(n) && (n%2!=0))
            {
                throw new OddPrimeException("Number is Odd and Prime so Invalid");
            }
            else
                System.out.println("Number is Valid");

        }
        catch (OddPrimeException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }

}