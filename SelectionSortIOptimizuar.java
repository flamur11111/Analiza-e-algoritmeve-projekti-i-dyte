import java.util.Arrays;

class GFG {

static void Selection_Sort(int arr[], int n)
{
    for(int i = 0; i < n - 1; ++i)
    {
        int min_index = i;
        for(int j = i + 1; j < n; ++j)
        {
            if(arr[j] < arr[min_index])
            min_index = j;
        }
        int temp = arr[min_index];
        arr[min_index] = arr[i];
        arr[i] = temp;
    }
}

public static void main(String[] args)
{
    int n = 5;
    int arr[] = {109, 203, 215, 325, 387};
    // Duke perdorur metoden e integruar sort 
    Arrays.sort(arr);

    System.out.print("Vargu i sortuar duke perdorur metoden e integruar sort eshte: ");
    for(int i = 0; i < n; ++i)
    System.out.print(arr[i] + " ");

    System.out.println();
     // Using Selection Sort
    Selection_Sort(arr, n);

    System.out.print("Vargu i sortuar duke perdorur metodeng Selection Sort is : ");
    for(int i = 0; i < n; ++i)
    System.out.print(arr[i] + " ");
    
    long startTime = System.nanoTime();
    long finishTime = System.nanoTime();
	 long excecutionTime = finishTime - startTime;
    System.out.println("Koha e ekzekutimit ne nanosekona: " + excecutionTime + " ns");
}
}
