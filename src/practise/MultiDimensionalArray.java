package practise;

import java.net.StandardSocketOptions;

public class MultiDimensionalArray {
    public static void main(String[]args){

      int a[][] = { {100,200},
              {300,400},
              {500,600}
      };

       System.out.println("the length of arrays, row: " + a.length);
       System.out.println("The columns of array: " + a[0].length);
       // read a value from array
        System.out.println(a[2][1]); // 600
        System.out.println("*************************");
        // read all the numbers in array
        for (int r = 0; r<a.length; r++)
        {
            for(int c=0; c<=a[r].length-1; c++)  // a.length(has values) thats why we use -1
            {
                System.out.print(a[r][c]+ "   ");
            }
            System.out.println();
        }
        System.out.println("*************************");
    // Approach 2
        // enhanced for loop
        for (int arr[]:a)   // capturing first row and store in arr array
        {
            for (int x: arr)  // now passing these values of first row to x variable
            {
                System.out.print(x + " ");   // printing these values and then move to second row
            }
            System.out.println();
        }



    }

}
