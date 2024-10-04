/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sort_algorthimtask1;

/**
 *
 * @author PMYLS
 */
public class Sort_AlgorthimTask1 {
    
    
    public static void bubbleSort(int[] arr) {
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
    
  
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
  
    public static void main(String[] args) {
       
        int[] arr = {5, 1, 3, 4, 6, 2};
        
        System.out.println("Original array:");
        printArray(arr);
        
       
        bubbleSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
}

