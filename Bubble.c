#include<stdio.h>
void bubbleSort(int arr[],int size)
{
    int temp;
    int i,j;
    for(i=0;i<=(size-1);i++)
    {
        for(j=0;j<=(size-i-1);j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
int main()
{

int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
bubbleSort(arr, 10);
int x;
for (x = 0; x < 10; x++)
    {
  printf("%d ", arr[x]);
}


}
