import java.lang.reflect.Array;
import java.util.Arrays;

public class Linear_sort_03 {
    public static int biggerNum(int[] arr, int big) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        return big;
    }

    public static int smallerNum(int[] arr, int small) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }

    public static int[] twoDArr(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int maxValue(int[][] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int[] maxIndex(int[][] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > num) {
                    num = arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr1 = { 32, 5, 7, 400, -345, 8 };
        int a = biggerNum(arr1, Integer.MIN_VALUE);
        System.out.println(a);
        int b = smallerNum(arr1, Integer.MAX_VALUE);
        System.out.println(b);

        // Creating a 2D array
        int[][] arr2 = {
                { 4, 6, 5 },
                { 3, 7, 9 },
                { 32, 6, 76 },
                { 2, 65, 43 }
        };
        int[] c = twoDArr(arr2, 2);
        System.out.println(Arrays.toString(c));
        int d = maxValue(arr2, Integer.MIN_VALUE);
        System.out.println(d);
        int[] e = maxIndex(arr2, Integer.MIN_VALUE);
        System.out.println(Arrays.toString(e));

    }
}
