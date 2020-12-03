import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int index = 0;
        int max = array[index];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                index = i;
                max = array[i];
            }
        }
        max = array[0];
        array[0] = array[index];
        array[index] = max;
        index = 1;
        max = array[index];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                index = i;
                max = array[i];
            }
        }
        System.out.println(array[0] * max);
    }
}