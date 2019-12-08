
import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amiha
 */
public class arrays1 {

    public static void main(String[] args) {
        //initializarea
        Scanner sc = new Scanner(System.in);
        System.out.print("number of lines=");
        int n = sc.nextInt();
        System.out.print("number of colums=");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        //citirea array-ului
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("A[" + i + "][" + j + "]=");
                arr[i][j] = sc.nextInt();

            }
        }
        //afisarea array-ului
        System.out.println("Array=");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        //suma
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                s += arr[i][j];
            }
        }
        System.out.println("SUM=" + s);
//media aritmetica a elementelor
        System.out.println("AVG=" + (s / (n * m)));
        //verifica daca exista elemenul introdus de user in array
        System.out.println("Searching value=");
        int searchVal = sc.nextInt();
        int verif = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == searchVal) {
                    verif++;
                    System.out.println("Element " + searchVal + " exists on index " + i + " " + j);

                }
            }
        }
        if (verif == 0) {
            System.out.println("Doesn't exist " + searchVal + " in array");
        }
//verifica daca exista element cu indexul introdus de la user in array
        System.out.println("Searching index of row=");
        int ind = sc.nextInt();
        System.out.println("Searching index of column=");
        int indc = sc.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[ind][indc]) {
                    index++;
                    System.out.println("Element with index " + ind + "," + indc + " exists" + arr[ind][indc]);
                    break;
                }

            }
        }
        if (index == 0) {
            System.out.println("Doesn't exist Element with index " + ind + "," + indc);
        }
        //copiem arrayul
        int arra[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, arra[i], 0, m);
        }
        //afisam array-ul copiat
        System.out.println("Copied  array=");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arra[i][j] + " ");
            }
            System.out.println("");
        }
        //numerele pare si impare
        int odd = 0, even = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("We have " + even + " even numbers and " + odd + " odd numbers");
        System.out.println("Second array=");
//initializam un array nou
        System.out.print("number of lines=");
        int n1 = sc.nextInt();
        System.out.print("number of colums=");
        int m1 = sc.nextInt();
        int arr1[][] = new int[n1][m1];
//citim array-ul 

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print("A[" + i + "][" + j + "]=");
                arr1[i][j] = sc.nextInt();

            }
        }
//verifica daca lungimile array-urilor sunt egale 
        int counter = 0;
        if (n != n1 || m != m1) {
            System.out.println("False");
        } else {
            //Sortam array-urile pentru a verifica daca sunt egale elementele
            //sortam 1 array
            //loop pu linii
            for (int i = 0; i < arr.length; i++) {

                // loop pu coloane
                for (int j = 0; j < arr[i].length; j++) {

                    // loop pu comparare
                    for (int k = 0; k < arr[i].length - j - 1; k++) {
                        if (arr[i][k] > arr[i][k + 1]) {

                            // interschimbam elementele 
                            int aux = arr[i][k];
                            arr[i][k] = arr[i][k + 1];
                            arr[i][k + 1] = aux;
                        }
                    }
                }
            }
            for (int i = 0; i < arr1.length; i++) {

                // loop for column of matrix 
                for (int j = 0; j < arr1[i].length; j++) {

                    // loop for comparison and swapping 
                    for (int k = 0; k < arr1[i].length - j - 1; k++) {
                        if (arr1[i][k] > arr1[i][k + 1]) {

                            // swapping of elements 
                            int aux = arr1[i][k];
                            arr1[i][k] = arr1[i][k + 1];
                            arr1[i][k + 1] = aux;
                        }
                    }
                }
            }

            //verificam element cu element
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] != arr1[i][j]) {
                        System.out.println("False ");
                        break;
                    } else {
                        counter++;
                    }
                }
            }

            if (counter > 0) {
                System.out.println("True");
            }
        }
        //BRAVO?     */

    }
}
