import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] income = new int[size];
        int[] tax = new int[size];
        for (int i = 0; i < size; i++) {
            income[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            tax[i] = scanner.nextInt();
        }
        int index = 0;
        double max = income[index] * ((double) tax[index]) / 100;
        for (int i = 0; i < size; i++) {
            if (income[i] * ((double) tax[i]) / 100 > max) {
                index = i;
                max = income[i] * ((double) tax[i]) / 100;
            }
        }
        System.out.println(index + 1);
    }
}