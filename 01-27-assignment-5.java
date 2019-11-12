/*
<your name>
CSA-1920
csa-1920-01-27-assignment-5

For this assignment, you will write a program which creates an array of decimal numbers from a user's input, then returns some simple statistics about the array.

The program should first ask the user how long they wish the array to be (must be a positive integer). If the user enters a non-positive integer then the program should display "Not a valid length!", then stop. Otherwise, the program should create an array of this length, then prompt the user to enter double values one at a time, filling the array from the start with the user's inputs until the array is full.

Once the array is filled the program should print the numbers in the array, followed by the average (arithmetic mean) of the values, the range of the values, and a statement on whether the array is sorted in increasing order, decreasing order or neither.

The average of the values is found by dividing the sum of the numbers by the amount of numbers in the array (note: this may cause roundoff errors, which you do not need to worry about for this assignment).
The range of the numbers is found by subtracting the smallest number in the array from the largest number in the array.
The array is sorted in increasing order if every number is greater than or equal to the previous number. The array is sorted in decreasing order if every element is less than or equal to the previous number. If neither of these is true then the list is unsorted. If every element on the list is the same, then it is counted as being in increasing order.
*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //what will these be initialized to?
    int len;
    double sum;
    boolean increasing;
    boolean decreasing;

    //Note these - they are special and used often
    double max = -Double.MAX_VALUE;
    double min = Double.MAX_VALUE;

    // Declare scanner and get length input

    // If the number entered is negative the program ends

    // Otherwise continue

      // Create double array and create variable for sum

      /* Set value of max and min variables used in range calculation to
       *  minimum and maximum possible values respectively as there are
       *  sure to be numbers entered to the array bigger than the minimum
       *  possible and smaller than the maximum possible
       */

      // Set booleans to mark if the array is sorted


      // Iterate through all valid indices for array

        // Take input of double and set current value of array to this

        // Add the current value to sum

        // Update value of max/min if current number is new maximum/minimum

        /* Checks if the current value is smaller than the previous (in which
         * case the list cannot be decreasing) or if it is greater than the
         * previous (in which case the list cannot be increasing). This only
         * runs if the current element is not the first in the array.
         */

      System.out.print("Your array is {");

      // Print each value in array except last followed by a comma and space

      // Print last value followed by closed curly brace
      System.out.println("}");

      // Calculate and display both average and range

      /* Choose which statement on sorting to display. Note that increasing
       * boolean is checked first. So if the array is both increasing and
       * decreasing (i.e. all elements are same) then the increasing message
       * is displayed only.
       */

  }
}