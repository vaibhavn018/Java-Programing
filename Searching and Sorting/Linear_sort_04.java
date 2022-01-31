public class Linear_sort_04 {

    public static int findEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static boolean isEven(int n) {
        int noOfDigits = digit2(n);
        return noOfDigits % 2 == 0;
    }

    public static int digit(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = n * (-1);
        }
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int digit2(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = n * (-1);
        }

        return (int) (Math.log10(n)) + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 43, 65, 4674, 776 };
        int a = findEven(arr);
        System.out.println(a);

    }
}
