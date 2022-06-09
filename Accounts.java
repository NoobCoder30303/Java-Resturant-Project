package resturant;

public class Accounts extends Display {
    double initialAmount=5000;
    int sandwichSales=0,dosaSales=0,coffeeSales=0,teaSales=0,filterCoffeeSale=0;
    double expenses=0;




    public double getInitialAmount() {
        return initialAmount;
    }

    void totalSales(){
        System.out.println("Total Sandwiches sold"+sandwichSales);
        System.out.println("Total Masala Dosa sold"+dosaSales);
        System.out.println("Total Coffee sold"+coffeeSales);
        System.out.println("Total Tea sold"+teaSales);
        System.out.println("Total Filter Coffee sold"+filterCoffeeSale);
        System.out.println("Returning to the main Menu");
        displayMenu();

    }

    void totalExpenses(){
        System.out.println("Total Expense = "+expenses);
        System.out.println("Returning to the main Menu");
        displayMenu();

    }
    void NetProfit(){
        System.out.println("Net Profit = "+(initialAmount-expenses));
        System.out.println("Returning to the main Menu");
        displayMenu();
    }
}
