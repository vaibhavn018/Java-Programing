public class Linear_sort_01 {
    public static int linear1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    public static int linear2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i : arr) {
            if (arr[i] == target) {
                return target;
            }

        }
        return -1;
    }

    public static boolean linear3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i : arr) {
            if (arr[i] == target) {
                return true;
            }

        }
        return false;
    }

    public static int searchNum(int[] arr, int target, int start, int end) {
        if (end == 0 || arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return i;

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 43, 65 };
        int element = 9;
        int a = linear1(arr, element);
        System.out.println(a);
        int b = linear2(arr, element);
        System.out.println(b);
        boolean c = linear3(arr, element);
        System.out.println(c);
        int d = searchNum(arr, 9, 2, 5);
        System.out.println(d);

    }
}
