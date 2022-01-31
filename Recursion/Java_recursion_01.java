public class Java_recursion_01 {
    public static void towerOfHanoi(int n, String main, String hel, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + main + " to " + dest);
            return;
        } else {
            towerOfHanoi(n - 1, main, dest, hel);
            System.out.println("Transfer disk " + n + " from " + main + " to " + dest);
            towerOfHanoi(n - 1, hel, main, dest);

        }
    }

    public static void printReverse(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printReverse(str, idx - 1);

    }

    public static int first = -1;
    public static int last = -1;

    public static void findChar(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curChar = str.charAt(idx);

        if (curChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findChar(str, idx + 1, element);

    }

    public static void sortedOrNot(int[] array, int idx) {
        if (idx == array.length - 1) {
            System.out.println("Array is sorted");
            return;
        }

        if (array[idx] > array[idx + 1]) {
            System.out.println("Array is not sorted");
            return;
        }
        sortedOrNot(array, idx + 1);

    }

    // Alternative method
    public static boolean isSorted(int[] array, int idx) {
        if (idx == array.length - 1) {
            return true;
        }

        if (array[idx] < array[idx + 1]) {
            return isSorted(array, idx + 1);
        } else {
            return false;
        }
    }

    public static void rearrangeString(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
        } else {
            newString += currChar;
        }
        rearrangeString(str, idx + 1, count, newString);
    }

    public static void main(String[] args) {
        // System.out.println("Tower of Hanoi");
        // int n = 2;
        // towerOfHanoi(n, "M", "H", "D");
        // System.out.println();

        // System.out.println("Reversing String");
        // String str = "VAIBHAV";
        // printReverse(str, str.length() - 1);
        // System.out.println();

        // System.out.println("Finding Char");
        // String Str1 = "afaaadsafah";
        // findChar(Str1, 0, 'a');
        // System.out.println();

        System.out.println("Checking array is sorted");
        int[] array = { 1, 2, 3, 4, 5 };
        sortedOrNot(array, 0);
        System.out.println();

        System.out.println("Another method of checking array");
        System.out.println(isSorted(array, 0));
        System.out.println();

        System.out.println("Sorting String");
        String str3 = "axbcxxd";
        rearrangeString(str3, 0, 0, "");

    }
}