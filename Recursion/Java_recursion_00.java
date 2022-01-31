public class Java_recursion_00 {

    public static void printNum1(int n) {
        if (n == 0) {

            return;
        }
        System.out.println(n);
        printNum1(n - 1);
    }

    public static void printNum2(int n, int last) {
        if (n == last) {
            return;
        }
        System.out.println(n);
        printNum2(n + 1, last);
    }

    public static void naturalNum1(int n, int a, int sum) {
        if (n == a) {
            System.out.println(n + sum);
            return;
        }

        naturalNum1(n, a + 1, sum + a);

    }

    public static void fac(int n, int sum) {
        if (n == 0) {
            System.out.println(1);
            return;
        }
        if (n == 1) {
            System.out.println(sum);
            return;
        }
        fac(n - 1, sum * n);

    }

    public static int factN(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fac_nm1 = factN(n - 1);
        int sum = fac_nm1 * n;
        return sum;
    }

    public static void fib(int n, int a, int b, int num) {
        if (n == -1) {
            System.out.print(num);
            return;
        }
        System.out.print(num + ",");
        fib(n - 1, a = b, b = num, num = a + b);

    }

    public static void printPower1(int x, int n, int mul) {
        if (n == 0) {
            System.out.println(mul);
            return;
        }

        printPower1(x, n - 1, mul * x);
    }

    public static int printPOwer2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 0;
        }
        int xPownm1 = printPOwer2(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static int printPower3(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return printPower3(x, n / 2) * printPower3(x, n / 2);
        } else {
            return printPower3(x, n / 2) * printPower3(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        printNum1(6);
        System.out.println();

        printNum2(1, 7);
        System.out.println();

        naturalNum1(10, 1, 0);
        System.out.println();

        fac(16, 1);
        System.out.println();

        System.out.println(factN(4));
        System.out.println();

        fib(7, 0, 1, 0);
        System.out.println();

        printPower1(2, 5, 1);
        System.out.println();

        System.out.println(printPOwer2(2, 5));
        System.out.println();

        System.out.println(printPower3(2, 5));
        System.out.println();

    }
}
