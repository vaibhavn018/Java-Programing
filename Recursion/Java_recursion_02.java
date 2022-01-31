import java.util.HashSet;

public class Java_recursion_02 {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int idx, String newString) {
        if (str.length() == idx) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {

        } else {
            newString += currChar;
            map[currChar - 'a'] = true;

        }
        removeDuplicate(str, idx + 1, newString);
    }

    public static void SubsequencesDif(String str, int idx, String newString) {
        if (str.length() == idx) {
            System.out.print("1 ");
            String[] array = { newString };
            // System.out.println(newString);

            for (String i : array) {
                System.out.print("'" + i + "'" + " ");
            }
            System.out.print("2 ");
            return;
        }

        char currChar = str.charAt(idx);
        // to be
        System.out.print("3 ");
        SubsequencesDif(str, idx + 1, newString + currChar);
        // not to be
        System.out.print("4 ");
        SubsequencesDif(str, idx + 1, newString);

        System.out.print("5 ");
    }

    public static void SubsequencesSame(String str, int idx, String newString, HashSet<String> set) {
        if (str.length() == idx) {
            if (set.contains(newString)) {
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);
        // to be
        SubsequencesSame(str, idx + 1, newString + currChar, set);
        // not to be
        SubsequencesSame(str, idx + 1, newString, set);

    }

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void printCombo(String str, int idx, String combination, HashSet<String> set) {
        if (str.length() == idx) {
            System.out.print(combination + ",");
            return;

        }
        char curChar = str.charAt(idx);
        String mapping = keypad[curChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombo(str, idx + 1, combination + mapping.charAt(i), set);
        }
    }

    public static void main(String[] args) {
        System.out.println("Removing duplicate char from string");
        String str1 = "abxbcdztdcgcaaaza";
        removeDuplicate(str1, 0, "");
        System.out.println();

        System.out.println("Subsequences for different characters");
        String str2 = "abc";
        SubsequencesDif(str2, 0, "");
        System.out.println();

        System.out.println("Subsequence for same characters");
        String str3 = "aaa";
        HashSet set1 = new HashSet<>();
        SubsequencesSame(str3, 0, "", set1);
        System.out.println();

        System.out.println("Printing Combination");
        String str4 = "888";
        HashSet set2 = new HashSet<>();
        printCombo(str4, 0, "", set2);
    }
}
