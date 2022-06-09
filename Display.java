package resturant;

import java.util.Scanner;

public class Display {

    Inventory display = new Inventory();
    Orders ord = new Orders();
    Accounts acc= new Accounts();


    void displayMenu() {
        System.out.println("Welcome to Restaurant Management System. Please select the options from below");
        System.out.println("1. View Available Ingredient");
        System.out.println("2. Order Specific Ingredient");
        System.out.println("3. View Total Sales");
        System.out.println("4. View Total Expenses ");
        System.out.println("5. View Net Profit");
        System.out.println("6. Place Order");
        System.out.println("7. Exit from the program");
        Scanner sc= new Scanner(System.in);
        int input= sc.nextInt();
        switch (input) {
            case 1 -> display.AvailableIngredients();
            case 2 -> {
                System.out.println("Enter the name of the ingredient you want to order followed by quantity");
                Scanner sc1 = new Scanner(System.in);
                String str = sc1.nextLine();
                int quant = sc1.nextInt();
                ord.SpecificIngredient(str, quant);
            }
            case 3 -> acc.totalSales();
            case 4 -> acc.totalExpenses();
            case 5 -> acc.NetProfit();
            case 6 -> ord.whichOrder();
            default -> System.out.println("Invalid Entry");
        }
    }
}
