package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        calculate();
    }
    public static void make() {
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");
    }
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        int water = 200;
        int milk = 50;
        int beans = 15;
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterTotal = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkTotal = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beansTotal = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int requested = scanner.nextInt();
        int available = Math.min(Math.min(waterTotal / water, milkTotal / milk), beansTotal / beans);
        if (available < requested) {
            System.out.println("No, I can make only " + available + " cup(s) of coffee");
        } else if (available == requested) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " +
                    (available - requested) + " more than that)");
        }
    }
}
