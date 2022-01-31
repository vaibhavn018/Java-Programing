import java.util.ArrayList;

public class Java_recursion_03 {
    public static void printPer(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);

            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);

            String newString = str.substring(0, i) + str.substring(i + 1);
            printPer(newString, permutation + curChar);
        }
    }

    public static int placeTiles(int n, int m) {
        // if (m == n) {
        // return 2;
        // }
        if (n < m) {
            return 1;
        }
        int vertical = placeTiles(n - m, m);
        int horizontal = placeTiles(n - 1, m);
        return vertical + horizontal;
    }

    public static int countPaths(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        int moveRight = countPaths(i, j + 1, m, n);
        int moveDown = countPaths(i + 1, j, m, n);
        int moveDiagonal = countPaths(i + 1, j + 1, m, n);
        return moveDown + moveRight + moveDiagonal;
    }

    public static int partyInvite(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int single = partyInvite(n - 1);
        int pair = (n - 1) * partyInvite(n - 2);
        return single + pair;

    }

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            System.out.println(subset + " ");
            return;
        }

        findSubset(n - 1, subset);
        subset.add(n);
        findSubset(n - 1, subset);
        subset.remove(subset.size() - 1);
    }

    public static void main(String[] args) {
        printPer("abc", "");
        System.out.println();

        System.out.println(countPaths(0, 0, 3, 3));
        System.out.println();

        System.out.println(placeTiles(4, 2));
        System.out.println();

        System.out.println(partyInvite(4));
        System.out.println();

        findSubset(3, new ArrayList<Integer>());
    }
}
