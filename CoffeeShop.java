//Brett Sullivan
// Program changes added on 8-28-2022
// Lab 1, Coffee Shop Class
// This class of lab takes in users selections of types and amount of coffee from TestCoffeeShop and determines total cost

public class CoffeeShop
{
    double total;  //  A variable to hold the amount the customer owes.
    double cupCost; // A variable that holds the proper price depending on user selection
    /** A method to calculate a customer's bill.  The amount owed is
     stored in the variable total.
     @param numCups The number of cups of coffee the customer ordered.
     @param selection The type of coffee order the user selected
     */
    void calcBill (int selection,int numCups) // parameters passed in from user choice of type and quantity
    {
        if(selection == 1) {
            cupCost = 2.35;
        }//  The cost of a single cup of coffee
        else if (selection == 2) {
            cupCost = 2.98;
        }  // The cost of a single latte
        else if (selection == 3) {
            cupCost = 2.79;
        } // the cost of a single espresso

        final double taxRate = 0.09;  //  The current tax rate
        double subtotal, salesTax; // initializing variables
        
        // Calculate the subtotal
        subtotal = cupCost * numCups;

        //  Calculate the sales tax
        salesTax = taxRate * subtotal;

        //  Calculate the full price
        total = subtotal + salesTax;
    }
    /**  Return the amount owed by the customer.
     @returns The amount the customer owes.
     */
    double getBill ()
    {
        return total; //return bill to the user at the end of the program
    }
}
