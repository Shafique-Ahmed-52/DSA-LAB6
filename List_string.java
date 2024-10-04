/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list_string;

/**
 *
 * @author PMYLS
 */

import java.util.Arrays;
public class List_string {

 public static void bubbleSortByLength(String[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
          
            for (int j = 0; j < n - i - 1; j++) {
              
                if (arr[j].length() > arr[j + 1].length()) {
                  
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
   
    public static void printArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    
   
    public static void main(String[] args) {
       
        String[] arr = {"apple", "pie", "banana", "cat"};
        
        System.out.println("Original array:");
        printArray(arr);
        
    
        bubbleSortByLength(arr);
        
        System.out.println("Sorted array by length:");
        printArray(arr);
    }
}

