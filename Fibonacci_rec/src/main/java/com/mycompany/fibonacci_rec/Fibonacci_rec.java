

package com.mycompany.fibonacci_rec;

public class Fibonacci_rec 
{

    public static void main(String[] args) 
    {
       
        
        System.out.println(fibonacci(5));
        
    }
    public static long fibonacci(int n)
    {
        if(n<=2)
        {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
