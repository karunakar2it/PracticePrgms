import java.util.Arrays;

public class ThirdLarg4{  
public static int getThirdLargest(int[] a, int total){  
Arrays.sort(a);  
return a[total-3];  
}  
public static void main(String args[]){  

int b[]={ 6, 8, 1, 9, 2, 1, 10, 12};  
 
System.out.println("Third Largest: "+getThirdLargest(b,8));  
}}  