package machine;
import java.util.Scanner;

enum State {
    REMAIN, BUY, FILL_WATER, FILL_MILK, FILL_BEANS, FILL_CUPS, EXIT
}

public class CoffeeMachine {
    public static State state = State.REMAIN;
    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int cups = 9;
    public static int money = 550;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CoffeeMachine.printMainMenu();
        while (CoffeeMachine.state != State.EXIT) {
            CoffeeMachine.handleInput(CoffeeMachine.scanner.next());
        }// while
    }// main

    public static void printState() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(CoffeeMachine.water + " of water");
        System.out.println(CoffeeMachine.milk + " of milk");
        System.out.println(CoffeeMachine.beans + " of coffee beans");
        System.out.println(CoffeeMachine.cups + " of disposable cups");
        System.out.println("$" +  CoffeeMachine.money + " of money");
    }

    public static void printMainMenu() {
        System.out.println();
        System.out.println("Write action (buy, fill, take, remaining, exit):");
    }

    public static void handleInput(String input) {
        switch (CoffeeMachine.state) {
            case REMAIN:
                switch (input) {
                    case "buy":
                        System.out.println();
                        System.out.println("What do you want to buy? 1 - espresso, " +
                                "2 - latte, 3 - cappuccino, back - to main menu:");
                        CoffeeMachine.state = State.BUY;
                        break;
                    case "fill":
                        System.out.println();
                        System.out.println("Write how many ml of water do you want to add:");
                        CoffeeMachine.state = State.FILL_WATER;
                        break;
                    case "take":
                        System.out.println();
                        System.out.println("I gave you $" + CoffeeMachine.money);
                        CoffeeMachine.money = 0;
                        CoffeeMachine.printMainMenu();
                        CoffeeMachine.state = State.REMAIN;
                        break;
                    case "remaining":
                        CoffeeMachine.printState();
                        CoffeeMachine.printMainMenu();
                        CoffeeMachine.state = State.REMAIN;
                        break;
                    case "exit":
                        CoffeeMachine.state = State.EXIT;
                        break;
                } // switch input
                break;
            case FILL_WATER:
                CoffeeMachine.water += Integer.parseInt(input);
                System.out.println("Write how many ml of milk do you want to add:");
                CoffeeMachine.state = State.FILL_MILK;
                break;
            case FILL_MILK:
                CoffeeMachine.milk += Integer.parseInt(input);
                System.out.println("Write how many grams of coffee beans do you want to add:");
                CoffeeMachine.state = State.FILL_BEANS;
                break;
            case FILL_BEANS:
                CoffeeMachine.beans += Integer.parseInt(input);
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                CoffeeMachine.state = State.FILL_CUPS;
                break;
            case FILL_CUPS:
                CoffeeMachine.cups += Integer.parseInt(input);
                CoffeeMachine.printMainMenu();
                CoffeeMachine.state = State.REMAIN;
                break;
            case BUY:
                switch (input) {
                    case "1":
                        if (CoffeeMachine.water >= 250 && CoffeeMachine.beans >= 16 && CoffeeMachine.cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            CoffeeMachine.water -= 250;
                            CoffeeMachine.beans -= 16;
                            CoffeeMachine.cups--;
                            CoffeeMachine.money += 4;
                        } else if (CoffeeMachine.water < 250){
                            System.out.println("Sorry, not enough water!");
                        } else if (CoffeeMachine.beans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                        CoffeeMachine.printMainMenu();
                        CoffeeMachine.state = State.REMAIN;
                        break;
                    case "2":
                        if (CoffeeMachine.water >= 350 && CoffeeMachine.milk >= 75 && CoffeeMachine.beans >= 20 && CoffeeMachine.cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            CoffeeMachine.water -= 350;
                            CoffeeMachine.milk -= 75;
                            CoffeeMachine.beans -= 20;
                            CoffeeMachine.cups--;
                            CoffeeMachine.money += 7;
                        } else if (CoffeeMachine.water < 350) {
                            System.out.println("Sorry, not enough water!");
                        } else if (CoffeeMachine.milk < 75) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (CoffeeMachine.beans < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                        CoffeeMachine.printMainMenu();
                        CoffeeMachine.state = State.REMAIN;
                        break;
                    case "3":
                        if (CoffeeMachine.water >= 200 && CoffeeMachine.milk >= 100 && CoffeeMachine.beans >= 12 && CoffeeMachine.cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            CoffeeMachine.water -= 200;
                            CoffeeMachine.milk -= 100;
                            CoffeeMachine.beans -= 12;
                            CoffeeMachine.cups--;
                            CoffeeMachine.money += 6;
                        } else if (CoffeeMachine.water < 200) {
                            System.out.println("Sorry, not enough water!");
                        } else if (CoffeeMachine.milk < 100) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (CoffeeMachine.beans < 12) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                        CoffeeMachine.printMainMenu();
                        CoffeeMachine.state = State.REMAIN;
                        break;
                    case "back":
                        CoffeeMachine.printMainMenu();
                        CoffeeMachine.state = State.REMAIN;
                        break;
                } // switch input
                break;
        } // switch state
    }
}
