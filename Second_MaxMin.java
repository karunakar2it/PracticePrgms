import java.util.*;
public class Second_MaxMin {
   public static void main(String []args){
      int a;
      int arr[] = {1,2,3,4,5,6,7,8,9,10};
      System.out.println("Array = "+Arrays.toString(arr));
      int count = arr.length;
      for (int i = 0; i < count; i++) {
         for (int j = i + 1; j < count; j++) {
            if (arr[i] > arr[j]) {
               a = arr[i];
               arr[i] = arr[j];
               arr[j] = a;
            }
         }
      }
     
      System.out.println("Second Smallest: "+arr[1]);
      System.out.println("Second Largest: "+arr[count-2]);
   }}