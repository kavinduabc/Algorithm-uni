#include<stdio.h>
struct stack
{
   int arr[5];
   int top;

}st;
//insert an element to stack
void push(int a)
{
    st.top++;
    st.arr[st.top]=a;
}
//delete data in stack
int pop()
{
    int b=st.arr[st.top];
    st.top--;
    return b;

}
int isempty()
{
    if(st.top==-1)
        return 1;
    else
        return 0;
}
int isfull()
{
    if(st.top==4)
        return 1;
    else
        return 0;

}
int peek()
{
    printf("%d is peek",st.arr[st.top]);
}
int main()
{

    st.top--;
    push(5);
    push(4);
    push(6);
    peek();
    pop(5);
    peek();
    return 0;
}
