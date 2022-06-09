package resturant;

import java.util.Scanner;

public class Inventory extends Display{
     double tomato=10,Potato=5,Onions=4,Batter=2,Spices=3,Milk=2,CoffeePowder=7,Tealeaves=6,Oregano=3,Cheese=4,Yoghurt=2,Bread=3,Capsicum=2;
    double tomatoPrice=5,potatoPrice=6,onionPrice=11.25,batterPrice=45,spicesPrice=33.3,milkPrice=25,coffeePowderPrice=4.28,teaLeavePrice=6.6,oreganoPrice=3.33,cheesePrice=37.5,yogurtPrice=15,breadPrice=10,capsicumPrice=5;
    double cpTomato=2,cpPotato=3,cpOnion=8,cpBatter=30,cpSpices=25,cpMilk=20,cpCoffeePowder=2,cpTeaLeave=3,cpOregano=1,cpCheese=25,cpYogurt=10,cpBread=5,cpCapsicum=2;

    void AvailableIngredients(){
         System.out.println("Tomato ="+tomato);
         System.out.println("Potato ="+Potato);
         System.out.println("Onions ="+Onions);
         System.out.println("Batter ="+Batter);
         System.out.println("Spices ="+Spices);
         System.out.println("Milk ="+Milk);
         System.out.println("CoffeePowder="+CoffeePowder);
         System.out.println("Tealeaves ="+Tealeaves);
         System.out.println("Oregano ="+Oregano);
         System.out.println("Cheese ="+Cheese);
         System.out.println("Yoghurt ="+Yoghurt);
         System.out.println("Bread ="+Bread);
         System.out.println("Capsicum ="+Capsicum);
        System.out.println("Press 0 to return to the main Menu");
        Scanner sc= new Scanner(System.in);
        int input= sc.nextInt();
        if(input==0) displayMenu();

     }
}
