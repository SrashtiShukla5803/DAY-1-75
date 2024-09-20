/**This is the program to print the Largest element in the array:)
 * 
 */

 import java.util.*;
 class LargestElement{
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
 
 int max=arr[0]; // to store maximum element in this arr[]
 
 for(i=0;i<n;i++) 
 {
     if(arr[i]>max){
         max=arr[i];
     }
 }
 System.out.println("The Largest element in the arr[] is: "+max);
 
     }
 }