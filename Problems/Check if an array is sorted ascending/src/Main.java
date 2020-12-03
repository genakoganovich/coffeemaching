import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ordered = true;
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            if (array[i] >= array[i + 1]) {
                ordered = false;
            }
        }
        System.out.println(ordered);
    }
}