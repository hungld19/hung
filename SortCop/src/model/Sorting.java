/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author LAPTOP DELL
 */
public class Sorting {
    private int[] data;

    public void RandomArray(int size, int minValue, int maxValue) {
        Random random = new Random();
        data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt((maxValue - minValue) + 1) + minValue;
        }
    }

    public int[] getUnsortedArray() {
        return Arrays.copyOf(data, data.length);
    }

    public int[] getBubbleArray() {
        int[] sortedData = Arrays.copyOf(data, data.length);
        bubbleSort(sortedData);
        return sortedData;
    }

    public int[] getQuickArray() {
        int[] sortedData = Arrays.copyOf(data, data.length);
        quickSort(sortedData, 0, sortedData.length - 1);
        return sortedData;
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}