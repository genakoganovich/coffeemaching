import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < size - 2; i++) {
            if (array[i] == array[i + 1] - 1 && array[i + 1] == array[i + 2] - 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}