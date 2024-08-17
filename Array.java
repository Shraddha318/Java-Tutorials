import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
/* Array indices start from 0, and accessing elements is done using these indices.
* "null" is a special literal in Java representing the absence of a value and is
 commonly used for uninitialized reference variables.
* 2D arrays in Java can be visualized as arrays of arrays, where each individual
index holds a reference to an array.
* You can iterate through array elements using a traditional for loop, an enhanced
 for-each loop, or utilize the `Arrays.toString()` method for simple printing.
*
 */