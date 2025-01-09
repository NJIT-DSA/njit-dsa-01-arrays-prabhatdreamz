package oy.tol.tra;

// TEACHERS: TODO: REMOVE this file before giving the material to students!
// TEACHERS: TODO: Also move the GenericTests.java to root dir of this project.
// Students are supposed to move the sorting / reversing to this new class and then
// implement the algorithms as generic to be used also in later exercises.

public class Algorithms {

   private Algorithms() {
      // Nada
   }

   // Slow insertion sort is ok here, since it was taught in Programming 2.
   public static <T extends Comparable<T>> void sort(T[] array) {
      if (null == array) {
         return;
      }
      int i = array.length - 1;
      while (i > 0) {
         for (int index = i - 1; index >= 0; index--) {
            if (array[i].compareTo(array[index]) < 0) {
               swap(array, i, index);
            }
         }
         i--;
      }
   }

   public static <T> void reverse(T[] array) {
      if (null == array) {
         return;
      }
      int i = 0;
      while (i < array.length / 2) {
         swap(array, i, array.length - i - 1);
         i++;
      }
   }

   public static <T> void swap(T[] array, int first, int second) {
      T temp = array[first];
      array[first] = array[second];
      array[second] = temp;
   }

}
