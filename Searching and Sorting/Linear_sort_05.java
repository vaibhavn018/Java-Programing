public class Linear_sort_05 {

    public static int maxWealth(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum = rowSum + arr[i][j];
                if (sum < rowSum) {
                    sum = rowSum;
                }

            }
        }
        return sum;
    }

    public static int findNumbers(int[] arr, int count) {
        for (int i = 0; i < arr.length; i++) {
            if (String.valueOf(arr[i]).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 4, 5, 6 },
                { 2, 7, 10 },

        };
        int c = maxWealth(arr);
        System.out.println(c);
        int[] arr2 = { 43, 65, 5, 64 };
        int b = findNumbers(arr2, 0);
        System.out.println(b);
    }
}
