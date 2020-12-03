import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int size = 3;
        int[] box1 = new int[size];
        int[] box2 = new int[size];
        for (int i = 0; i < size; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            box2[i] = scanner.nextInt();
        }
        int min1 = Math.min(Math.min(box1[0], box1[1]), box1[2]);
        int min2 = Math.min(Math.min(box2[0], box2[1]), box2[2]);
        int max1 = Math.max(Math.max(box1[0], box1[1]), box1[2]);
        int max2 = Math.max(Math.max(box2[0], box2[1]), box2[2]);
        if (min1 == min2 && max1 == max2) {
            System.out.println("Box 1 = Box 2");
        } else if (min1 <= min2 && max1 <= max2) {
            System.out.println("Box 1 < Box 2");
        } else if (min1 >= min2 && max1 >= max2) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }
}