import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        boolean contains = false;
        int value = scanner.nextInt();
        for (int element : array) {
            if (element == value) {
                contains = true;
                break;
            }
        }
        System.out.println(contains);
    }
}