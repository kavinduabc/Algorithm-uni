

package com.mycompany.recursivegcd;

public class RecursiveGCD 
{

    public static void main(String[] args) 
    {
        int num1=120;
        int num2=35;
        System.out.println(gcd(num1,num2));
        
        
    }
    public static int gcd(int num1,int num2)
    {
            while(num2!=0)
    {
        int temp=num1%num2;
        num1=num2;
        num2=temp;
    }
            return num1;
    }
}
