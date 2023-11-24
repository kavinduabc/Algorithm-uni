
package com.mycompany.fibonacci_iteration;

public class Fibonacci_iteration 
{

    public static void main(String[] args) 
    {
        System.out.println(fibonacci(5));
    }
    public static long fibonacci(int n)
    {
        if(n==1||n==2)
        {
            return 1;
        }
        int currentFibo=1;
        int previousFibo=1;
        for(int i=2;i<n;i++)
        {
            int temp=previousFibo;
            currentFibo=previousFibo+currentFibo;
            currentFibo=temp;
        }
        return currentFibo;
    }
}
