package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        Scanner scanner = new Scanner(System.in);
        printState(water, milk, beans, cups, money);
        System.out.println();
        System.out.println("Write action (buy, fill, take):");
        switch (scanner.next()) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                switch (scanner.nextInt()) {
                    case 1:
                        water -= 250;
                        beans -= 16;
                        cups--;
                        money += 4;
                        break;
                    case 2:
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        cups--;
                        money += 7;
                        break;
                    case 3:
                        water -= 200;
                        milk -= 100;
                        beans -= 12;
                        cups--;
                        money += 6;
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                water += scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                milk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                beans += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                cups += scanner.nextInt();
                break;
            case "take":
                System.out.println("I gave you $" + money);
                money = 0;
                break;
        }
        System.out.println();
        printState(water, milk, beans, cups, money);
    }
    public static void printState(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");

    }
}
