import java.io.*;
 
class GFG{
     
static void Bubble_Sort(int arr[], int n) 
{
    for(int i = 1; i < n; ++i)     
    {
        for(int j = 0; j <= (n - i - 1); ++j)  
        {   
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            } 
        }
    }
}
 

public static void main(String[] args)
{
    int n = 5;
    int arr[] = { 2, 0, 1, 4, 3 };
     
    Bubble_Sort(arr, n);
     
    System.out.print("Vargu i sortuar duke perdorur Bubble Sorte eshte : ");
    for(int i = 0; i < n; ++i)
        System.out.print(arr[i]+" ");
}
}
