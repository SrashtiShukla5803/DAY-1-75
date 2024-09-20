import java.util.Scanner;

/**
 * Remove Duplicates in-place from Sorted Array
 */

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int n,i;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the array: ");
         n=sc.nextInt();
         int[] arr=new int[n];
         System.out.println("Enter the array elements: ");
         for(i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         System.out.println("Array after removing all duplicate elements: ");
         int j=0;
for(i=1;i<n;i++){
    if(arr[i]!=arr[j]){
       j++;
       arr[j]=arr[i];
    }
}
for(i=0;i<j+1;i++){
    System.out.print(arr[i]+" ");
}
    }
}
