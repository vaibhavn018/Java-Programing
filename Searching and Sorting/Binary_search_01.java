import java.util.Scanner;

import javax.xml.validation.ValidatorHandler;

public class Binary_search_01 {

    public static int findElementAss(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;

    }

    public static int findElementDes(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                end = mid - 1;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 6, 9, 43, 10, 78, 99 };
        int a = findElementAss(arr1, 99);
        System.out.println(a);
        int[] arr2 = { 67, 54, 32, 12, 10, 7, 4, 2, 1 };
        int b = findElementDes(arr2, 1);
        System.out.println(b);

    }
}
