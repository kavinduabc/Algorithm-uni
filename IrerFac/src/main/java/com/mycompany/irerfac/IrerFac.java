

package com.mycompany.irerfac;

public class IrerFac 
{

    public static void main(String[] args) 
    {
        System.out.println(factorial(6));
    }
    public static long factorial(int a)
    {
        long fac=1;
        long i;
        for(i=a;i>1;i--)
        {
            fac=fac*i;
        }
        return fac;
    }
}
