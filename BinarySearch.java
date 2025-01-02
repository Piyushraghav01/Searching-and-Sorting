// Intro to Searching
/*import java.util.Scanner;

class LinearSearch {

    public static int search(int A[], int n) {
        for(int i = 0; i<A.length; i++){
            if(A[i] == n){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = { 5, 7, 1, 2, 33, 90, 87, 54, 12, 34, 78 };

        System.out.print("Enter the element to be searched: ");
        int n = sc.nextInt();

        System.out.println(search(A,n));
        sc.close();

    }
}*/

// Binary Search Solution
/*import java.util.Scanner;

public class BinarySearch {

    public static int search(int A[], int n) {
        int l=0, r = A.length-1;

        while(l<=r){
            int mid = (l+r)/2;

            if(A[mid] == n){
                return mid;
            }else if(A[mid]<n){
                l =mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 5, 7, 8, 10, 13, 27, 58, 63, 69, 89, 90 };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to be searched: ");
        int n = sc.nextInt();

        sc.close();

        System.out.println(search(A, n));
    }

} */

// Bubble Short 
/*import java.util.Scanner;

class BubbleSort {

    public static void sort(int A[]) {

        for (int i = 0; i < A.length - 1; i++) {// Outer loop for passes
            for (int j = 0; j < A.length - 1 - i; j++) {// Inner loop for number of comparisons
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A[] = { 6, 5, 4, 3, 2, 1 };

        sort(A);

        for (int i : A) {
            System.out.print(i + " ");
        }
        sc.close();

    }

}*/

// Selation Sort Solution
/*import java.util.Scanner;

class SelectionSort {
    public static void sort(int A[]) {
        // Outer Pass loop
        for (int i = 0; i < A.length - 1; i++) {
            int min = i;
            // Inner loop for finding min value index
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
            int temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = { 6, 3, 5, 1, 4, 2 };

        sort(A);

        for (int i : A) {
            System.out.print(i + " ");
        }
        sc.close();

    }

}*/

// Insertion 
/*
 import java.util.Scanner;

class InsertionSort {
    public static void sort(int A[]) {
        for (int i = 1; i < A.length; i++) {
            int j = i - 1;
            int temp = A[i];

            while (j >= 0 && A[j] > temp) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = { 6, 2, 4, 7, 5, 1, 3 };

        sort(A);

        for (int i : A) {
            System.out.print(i + " ");
        }
        sc.close();

    }

}
 */

 // Mergeing Sorted
 /*
  import java.util.Scanner;

class MergeArrays {
    public static int[] merge(int A[], int B[]) {
        int mergedArr[] = new int[A.length + B.length];

        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                mergedArr[k++] = A[i++];
            } else {
                mergedArr[k++] = B[j++];
            }
        }

        while (i < A.length) {
            mergedArr[k++] = A[i++];
        }

        while (j < B.length) {
            mergedArr[k++] = B[j++];
        }
        return mergedArr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = { 1, 3, 5, 7, 9 };
        int B[] = { 2, 4, 6, 8, 10, 12, 14 };

        int C[] = merge(A, B);

        for (int i : C) {
            System.out.print(i + " ");
        }
        sc.close();

    }

}
  */

  