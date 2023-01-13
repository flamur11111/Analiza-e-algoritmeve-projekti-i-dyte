class GFG{
 
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
      int temp = arr[i];
      arr[i] = arr[min_index];
      arr[min_index] = temp;
    }
  }
 
  
  public static void main(String[] args)
  {
    int n = 5;
    int arr[] ={1, 5, 8, 65, 543};
    Selection_Sort(arr, n);
    System.out.print("Vargu i sortuar duke perdorur selection sort eshte : ");
    for(int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
      long startTime = System.nanoTime();
    long finishTime = System.nanoTime();
	 long excecutionTime = finishTime - startTime;
    System.out.println("Koha e ekzekutimit ne nanosekona: " + excecutionTime + " ns");
}

          
   }
