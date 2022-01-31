import java.util.Arrays;

public class Binary_search {
    public static char findChar(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }

    public static int[] findNum(int[] arr, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }

        return ans;
    }

    public static int search(int[] arr, int target, boolean firstIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (firstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void infinite(int[] arr, int target) {
        int s = 0;
        int e = 1;
        while (arr[e] < target) {
            int temp = e + 1;
            e = e + (e - s + 1) * 2;
            s = temp;
        }
        System.out.println(find(arr, target, s, e));

    }

    public static int find(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < target) {
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        char[] arr1 = { 'c', 'd', 'f', 'g', 'h' };
        char a = findChar(arr1, 'y');
        System.out.println(a);
        int[] arr2 = { 2, 4, 6, 8, 8, 22 };
        int[] b = findNum(arr2, 8);
        System.out.println(b);
        infinite(arr2, 8);

    }
}
