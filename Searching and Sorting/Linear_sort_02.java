import java.lang.reflect.Array;

public class Linear_sort_02 {
    public static boolean searchChar1(String str, char c) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }

        }

        return false;
    }

    public static int searchChar2(String str, char c) {
        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        String str = "Vaibhav";
        char c = 'h';
        System.out.println(searchChar1(str, c));
        System.out.println(searchChar2(str, c));
        System.out.print("[");
        for (char i : str.toCharArray()) {
            System.out.print(i + ",");
        }
        System.out.println("]");

    }
}
