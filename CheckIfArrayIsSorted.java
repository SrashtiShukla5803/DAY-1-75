import java.util.*;

/**
 * To check if the array is sorted or not
 */

public class CheckIfArrayIsSorted {
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

for (i=1;i<n;i++){
    if(arr[i]>arr[i-1]){

    }
    else{
        System.out.println("Array is not sorted");
        break;
    }
}

System.out.println("Array is sorted");

        }


}
