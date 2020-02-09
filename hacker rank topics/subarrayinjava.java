package hackerranktopics;
//how to get a subarray of some particualar index of a particular array
import java.util.Arrays;
public class subarrayinjava {
   public static void main(String[] args) {
      int[] array = new int[] {1, 2, 3, 4, 5};
      int[] subArray = Arrays.copyOfRange(array, 0, 2);
      System.out.println("Array: ");
      for(int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
      }
      System.out.println("\nSub array: ");
      for(int i = 0; i < subArray.length; i++) {
         System.out.print(subArray[i] + " ");
      }
   }
}
