package com.example.employee.java;

public class CombinationProblem1 {
    //Print all possible combinations of r elements in a given array of size n
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};
        int size =arr.length;
        int r = 3;
        printCombination(arr,size,r);
    }

    private static void printCombination(int[] arr, int size, int r) {
        int[] data =new int[r];

        combinaUtil(arr, data, 0, size-1, 0, r);
    }

    private static void combinaUtil(int[] arr, int[] data, int start, int end, int index, int r) {
            if (index == r)
            {
                for (int j=0; j<r; j++)
                    System.out.print(data[j]+" ");
                System.out.println("");
                return;
            }

            // replace index with all possible elements. The condition
            // "end-i+1 >= r-index" makes sure that including one element
            // at index will make a combination with remaining elements
            // at remaining positions
            for (int i=start; i<=end && end-i+1 >= r-index; i++)
            {
                data[index] = arr[i];
                combinaUtil(arr, data, i+1, end, index+1, r);
            }
        }

}
