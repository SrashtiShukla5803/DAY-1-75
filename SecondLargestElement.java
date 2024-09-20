import java.util.Scanner;

/**
 * To find the second largest element in the array.
 */

public class SecondLargestElement {
    public static void main(String[]args){
        int n,i;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the array: ");
         n=sc.nextInt();
         int[] arr=new int[n];
         System.out.println("Enter the array elements: ");
         for(i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }

         int max=arr[0];
         int secmax=-1;
         for(i=0;i<n;i++){
           if(arr[i]> max){
            secmax=max;
            max=arr[i];
           }
           else if (arr[i] > secmax && arr[i] != max)
		{
			secmax = arr[i];
		}
        }
System.out.println("The Second Largest element in arr[] is: "+ secmax);
    }
}
