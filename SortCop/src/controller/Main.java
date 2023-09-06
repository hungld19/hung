/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.Sorting;
import view.Menu;

/**
 *
 * @author LAPTOP DELL
 */
public class Main {
    private Sorting model;
    private Menu view;

    public Main(Sorting model, Menu view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin về mảng từ người dùng
        System.out.print("Enter the number of array elements: ");
        int size = scanner.nextInt();
        System.out.print("Enter the minimum value: ");
        int minValue = scanner.nextInt();
        System.out.print("enter the maximum value: ");
        int maxValue = scanner.nextInt();

        model.RandomArray(size, minValue, maxValue);

        while (true) {
            view.displayMenu();
            int choice = view.getChoice();

            switch (choice) {
                case 1:
                    int[] unsortedArray = model.getUnsortedArray();
                    int[] bubbleSortedArray = model.getBubbleArray();
                    view.displayArray(unsortedArray, "Unsorted array: ");
                    view.displayArray(bubbleSortedArray, "Sorted array (Bubble Sort): ");
                    break;
                case 2:
                    int[] unsortedArray2 = model.getUnsortedArray();
                    int[] quickSortedArray = model.getQuickArray();
                    view.displayArray(unsortedArray2, "Unsorted array: ");
                    view.displayArray(quickSortedArray, "Sorted array (Quick Sort):");
                    break;
                case 0:
                    System.out.println("End program");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Sorting model = new Sorting();
        Menu view = new Menu();
        Main main = new Main(model, view);
        main.run();
    }
}