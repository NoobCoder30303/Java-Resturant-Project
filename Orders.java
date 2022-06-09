package resturant;
import java.util.Scanner;

public class Orders extends Display {

   Inventory order= new Inventory();
   Accounts amount= new Accounts();
   Recepies recepie = new Recepies();




   void whichOrder() {
      System.out.println("Please select the dish you want to order from below menu: ");
      System.out.println("1. Sandwich");
      System.out.println("2. Masala Dosa");
      System.out.println("3. Coffee");
      System.out.println("4. Tea");
      System.out.println("5. Filter Coffee");
      Scanner sc= new Scanner(System.in);
      int input=sc.nextInt();
      switch (input) {
         case 1 -> recepie.Sandwich();
         case 2 -> recepie.MasalaDosa();
         case 3 -> recepie.Coffee();
         case 4 -> recepie.Tea();
         case 5 -> recepie.FilterCoffee();
         default -> {
            System.out.println("Invalid choice. Returning to the Main Menu");
            displayMenu();
         }
      }
   }

   void SpecificIngredient(String name,int orderQuatity){
      switch (name) {
         case "Tomato" -> {
            if ((orderQuatity * order.tomatoPrice) <= amount.initialAmount) {
               order.tomato = order.tomato - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.tomatoPrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Tomato");

            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         case "Potato" -> {
            if ((orderQuatity * order.potatoPrice) <= amount.initialAmount) {
               order.Potato = order.Potato - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.potatoPrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Potato");
            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         case "Onions" -> {
            if ((orderQuatity * order.onionPrice) <= amount.initialAmount) {
               order.Onions = order.Onions - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.onionPrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Onion");
            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         case "Batter" -> {
            if ((orderQuatity * order.batterPrice) <= amount.initialAmount) {
               order.Batter = order.Batter - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.batterPrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Batter");
            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         case "Spices" -> {
            if ((orderQuatity * order.spicesPrice) <= amount.initialAmount) {
               order.Spices = order.Spices - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.spicesPrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Spices");
            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         case "Milk" -> {
            if ((orderQuatity * order.milkPrice) <= amount.initialAmount) {
               order.Milk = order.Milk - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.milkPrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Milk");
            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         case "CoffeePowder" -> {
            if ((orderQuatity * order.coffeePowderPrice) <= amount.initialAmount) {
               order.CoffeePowder = order.CoffeePowder - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.coffeePowderPrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Coffee Powder");
            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         case "Tealeaves" -> {
            if ((orderQuatity * order.teaLeavePrice) <= amount.initialAmount) {
               order.Tealeaves = order.Tealeaves - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.teaLeavePrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Tea leaves");
            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         case "Oregano" -> {
            if ((orderQuatity * order.oreganoPrice) <= amount.initialAmount) {
               order.Oregano = order.Oregano - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.oreganoPrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Oregano");
            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         case "Cheese" -> {
            if ((orderQuatity * order.cheesePrice) <= amount.initialAmount) {
               order.Cheese = order.Cheese - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.cheesePrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Cheese");
            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         case "Yoghurt" -> {
            if ((orderQuatity * order.yogurtPrice) <= amount.initialAmount) {
               order.Yoghurt = order.Yoghurt - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.yogurtPrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Yoghurt");
            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         case "Bread" -> {
            if ((orderQuatity * order.breadPrice) <= amount.initialAmount) {
               order.Bread = order.Bread - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.breadPrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Bread");
            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         case "Capsicum" -> {
            if ((orderQuatity * order.capsicumPrice) <= amount.initialAmount) {
               order.Capsicum = order.Capsicum - orderQuatity;
               amount.initialAmount = amount.initialAmount - (orderQuatity * order.capsicumPrice);
               System.out.println("Order has been placed successfully for " + orderQuatity + "Capsicum");
            } else {
               System.out.println("Insufficient Funds");
            }
            System.out.println("Returning to the main Menu");
            displayMenu();
         }
         default -> {
            System.out.println("Invalid Choice. Returning to the main Menu");
            displayMenu();
         }
      }


      }

   }




