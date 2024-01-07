public class Solution
  {
    static void insert(int arr[],int i)
  {
       int key=arr[i];
       int j=i-1;
       while(j>=0 && arr[j]>key)
       {
           arr[j+1]=arr[j];
           j=j-1;
       }
         arr[j+1]=key;
  }
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
         for(int i=1;i<size;i++)
     {
         insert(arr,i);
     }
    }
}
