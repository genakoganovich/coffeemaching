import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String[] s = new Scanner(System.in).nextLine().split(" ");
        boolean result = true;
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].compareTo(s[i + 1]) >= 1) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}