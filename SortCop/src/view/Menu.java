/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author LAPTOP DELL
 */
public class Menu {
    public void displayMenu() {
        System.out.println("Choose sorting algorithm: ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("0. Exit");
    }

    public int getChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter selection: ");
        return scanner.nextInt();
    }

    public void displayArray(int[] array, String label) {
        System.out.println(label);
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}