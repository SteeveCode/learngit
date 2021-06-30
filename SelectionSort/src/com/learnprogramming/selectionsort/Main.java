// program to sort an int array using selection sort
// the selection sort algorithm grows in a quadratic way hence it is very inefficient i.e Big O(n2).
// each loop corresponds to n. If you have only one loop, then it corresponds to linear time
// complexity. If you have two loops, it is n * n and that it corresponds to quadratic time complexity.
// selection sort is an unstable sort. it does not maintain the position of duplicate elements.

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

    // static method that does the actual swapping of numbers in an array is defined
    public static void swap ( int[] array, int i, int j ){
        if (i == j)
        {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}