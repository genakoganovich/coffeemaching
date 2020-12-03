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
                max = array[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}