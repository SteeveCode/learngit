// Program to sort an int array using insertion sort.
/* The insertion sort algorithm grows in a quadratic way as the number of items we are sorting grows. Hence,
 it is very inefficient i.e Big O(n2).
 Each loop corresponds to n. If you have only one loop, then it corresponds to linear time complexity. If
 you have two loops, it is n * n and that it corresponds to quadratic time complexity.
 Insertion sort is a stable sort. it maintain the position of duplicate elements because it picks from left
 to right.
 Selection sort is an in-place algorithm i.e we don't have to create any temporary arrays because as long as-
 the extra memory we are using doesn't depend on the number of items we are sorting
 */

package com.learnprogramming.insertionsort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // outer for loop used to traverse the whole length of the array
        for(int firstUnsortedIndex = 1; firstUnsortedIndex< intArray.length; firstUnsortedIndex++){

            // variable newElement used to temporarily hold the value of element in first unsorted partition
            int newElement = intArray[firstUnsortedIndex];

            // variable i is necessary to determine the insertion position after the shifting operation in the
            // inner for loop. i is not in the inner for loop for because it has a wider scope.
            int i;

            // inner for loop ensure the two conditions necessary for the shifting operation is met. The shift
            // operation goes from the unsorted partition on the right to the sorted partition on the left.
            for(i = firstUnsortedIndex; i > 0 && intArray[i-1]> newElement; i-- ){
                intArray[i] = intArray[i-1];
            }
            // determines insertion position coming from right to left. Note: the final value of i has been
            // reduced because of the i-- decrement operation in the inner for loop above.
            intArray[i] = newElement;
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
