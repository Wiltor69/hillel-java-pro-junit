package ua.hillel.junithw.arraylibrary;

import java.util.Arrays;

public class SimpleArraysLibrary {
    public int[] createArray(int [] arr) {
        arr = new int[7];
        int n = arr.length;
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == 4) {
                arr1 = Arrays.copyOfRange(arr, 3, n);

            }

        }


        return arr1;
    }

    }

