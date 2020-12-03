import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int shift = scanner.nextInt();
        String[] rotated = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            rotated[(i + shift) % numbers.length] = numbers[i];
        }
        for (String element: rotated) {
            System.out.print(element + " ");
        }
    }
}