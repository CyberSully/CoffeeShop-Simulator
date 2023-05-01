//Brett Sullivan
// Program changes added on 8-28-2022
// Lab 1, TestCoffee Shop Class
// This class of lab contains main method and get user inputs to pass parameters for selections into CoffeShop Class



import java.util.Scanner;
public class TestCoffeeShop
{

    public static void main (String [] args)
    {
        /** The Main method to ask user questions about types of coffee and amount.
         * stored in variables and passed into CoffeeShop Class
         @param cupsOfCoffee The number of cups of coffee the customer ordered.
         @param selection The type of coffee order the user selected
         */
        Scanner input = new Scanner (System.in);
        CoffeeShop myCoffeeShop = new CoffeeShop(); // new object created from CoffeeShop class
        int selection;
        while(true) { //Loop continues until user enters 4 to exit
            System.out.println();
            System.out.println("Press 1 for regular coffee: ");
            System.out.println("Press 2 for latte: ");
            System.out.println("Press 3 for espresso: ");
            System.out.println("Press 4 to exit: ");
            selection = input.nextInt();
            if (selection == 4) { //exit for loop to end the program
                System.out.print("Goodbye");
                break;
            } else {
                System.out.print("How many cups of coffee would you like? ");
                int cupsOfCoffee = input.nextInt();
                System.out.println("You chose the coffee type: " + selection + " and the amount: " + cupsOfCoffee);
                myCoffeeShop.calcBill(selection, cupsOfCoffee);
                System.out.printf("You owe $%.2f", myCoffeeShop.getBill());
            }
        }
    }
}
