

package com.mycompany.recurfac;

public class RecurFac 
{

    public static void main(String[] args) 
    {
        System.out.println(factorial(7));
    }
    public static long factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}
