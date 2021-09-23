// Program to sort an int array using selection sort.
/* The selection sort algorithm grows in a quadratic way hence it is very inefficient i.e Big O(n2).
 Each loop corresponds to n. If you have only one loop, then it corresponds to linear time-
 complexity. If you have two loops, it is n * n and that it corresponds to quadratic time complexity.
 Selection sort is an unstable sort. it does not maintain the position of duplicate elements.
 Selection sort is an in-place algorithm i.e we don't have to create any temporary arrays because as long as-
 the extra memory we are using doesn't on the number of items we are sorting
 */


package com.learnprogramming.selectionsort;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // outer for loop to keep track of the sorted and unsorted partition of the array index.
        // as the elements are sorted, the highest index of the array reduces to create an imaginary
        // partition of sorted and unsorted indexes.

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            // where it is assumed that the largest element in the unsorted partition is at index 0
            int largestIndex = 0;

            // inner for loop that calls the swap method and pays attention to the sorted partition
            // using the lastUnsortedIndex variable to track the unsorted part of the array

            for (int i = 1; i <= lastUnsortedIndex; i++)
            {
                if (intArray[i] > intArray[largestIndex])
                {
                    largestIndex = i;
                }
                swap(intArray, largestIndex, lastUnsortedIndex);
            }
        }
        for(int i = 0; i < intArray.length; i++){System.out.println(intArray[i]);}
    }

    // static method that does the actual swapping of numbers in th array is defined. the method takes in
    // an array and two neighbouring index numbers starting from index zero.
    public static void swap ( int[] array, int i, int j ){
     // note: this method only does one thing i.e swap positions of array elements. It does not need to test which element is greater or lesser. A test 
     // condition can be placed before calling the swap method.
        if (i == j)
        {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
