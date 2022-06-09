package resturant;

public class Recepies extends Display {

    Inventory recep= new Inventory();
    Accounts accounts = new Accounts();
    void Sandwich(){
        if(recep.Bread>=2 && recep.Capsicum>=1 && recep.Cheese>=1 && recep.tomato>=1){
            recep.Capsicum --;
            recep.Bread -= 2;
            recep.Cheese --;
            recep.tomato --;
            accounts.initialAmount +=(recep.capsicumPrice + recep.breadPrice*2 +recep.cheesePrice + recep.tomatoPrice);
            accounts.sandwichSales ++;
            accounts.expenses +=(recep.cpCapsicum + recep.cpBread*2 +recep.cpCheese + recep.cpTomato);
            System.out.println("Your order has been places successfully");
        } else{
            System.out.println("Order was not placed. Insufficient Ingredients");
        }
        System.out.println("Returning to the main Menu");
        displayMenu();
    }
    void MasalaDosa(){
        if(recep.Batter>=0.5 && recep.Spices>=0.4 && recep.Onions>=1 && recep.Potato>=1.25) {
            recep.Batter -= 0.5;
            recep.Spices -= 0.4;
            recep.Onions --;
            recep.Potato -= 1.25;
            accounts.initialAmount +=(recep.batterPrice*0.5 + recep.spicesPrice*0.4 +recep.onionPrice +recep.potatoPrice*1.25);
            accounts.expenses += (recep.cpBatter*0.5 + recep.cpSpices*0.4 +recep.cpOnion +recep.cpPotato*1.25);
            accounts.dosaSales ++;
            System.out.println("Your order has been places successfully");
        }else{
            System.out.println("Order was not placed. Insufficient Ingredients");
        }
        System.out.println("Returning to the main Menu");
        displayMenu();

    }
    void Coffee(){
        if(recep.CoffeePowder>=0.10 && recep.Milk>=0.3){
            recep.CoffeePowder -= 0.10;
            recep.Milk -= 0.3;
            accounts.initialAmount += (recep.coffeePowderPrice*0.10 + recep.milkPrice*0.3);
            accounts.coffeeSales ++;
            accounts.expenses += (recep.cpCoffeePowder*0.10 + recep.cpMilk*0.3);
            System.out.println("Your order has been places successfully");
        }else {
            System.out.println("Order was not placed. Insufficient Ingredients");
        }
        System.out.println("Returning to the main Menu");
        displayMenu();
    }
    void Tea(){
        if(recep.Tealeaves>=0.20 && recep.Milk>=0.3){
            recep.Tealeaves -= 0.20;
            recep.Milk -=0.3;
            accounts.initialAmount += (recep.teaLeavePrice*0.20 + recep.milkPrice-0.3);
            accounts.teaSales++;
            accounts.expenses += (recep.cpTeaLeave*0.20 + recep.cpMilk-0.3);
            System.out.println("Your order has been places successfully");
        }else {
            System.out.println("Order was not placed. Insufficient Ingredients");
        }
        System.out.println("Returning to the main Menu");
        displayMenu();
    }
    void FilterCoffee(){
        if(recep.CoffeePowder>=0.2 && recep.Milk>=0.3){
            recep.CoffeePowder -= 0.2;
            recep.Milk -= 0.3;
            accounts.initialAmount += (recep.coffeePowderPrice*0.2 + recep.milkPrice*0.3);
            accounts.filterCoffeeSale++;
            accounts.expenses += (recep.cpCoffeePowder*0.2 + recep.cpMilk*0.3);
            System.out.println("Your order has been places successfully");
        }else {
            System.out.println("Order was not placed. Insufficient Ingredients");
        }
        System.out.println("Returning to the main Menu");
        displayMenu();
    }
}
