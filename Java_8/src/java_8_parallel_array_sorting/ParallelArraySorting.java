package java_8_parallel_array_sorting;

import java.util.Arrays;

public class ParallelArraySorting {
    public static void main(String[] args) {

        int arr[] = {5,8,1,0,6,9};

        for(int i : arr) {
            System.out.print(i+" ");
        }

        // sorting array element parallel
        Arrays.parallelSort(arr);
        System.out.println("\nAfter parallel sorting array !!");
        for(int i  : arr) {
            System.out.print(i+" ");
        }
    }
}
