import models.Event;

import java.util.Scanner;

/**
 * Created by Guest on 1/8/18.
 */
public class App {
    public static void main(String[] args) {
        boolean programRunning = true;

        Scanner keyboard = new Scanner(System.in);

        while (programRunning) {

            System.out.println("Hello! Let's estimate the cost of your next event!");
            System.out.println("How many guests will be attending your event?");
            String guestString=keyboard.next();
            int userGuests = Integer.parseInt(guestString);
            System.out.print("What meal would you like served? pick 'chicken', 'steak' or 'vegetarian'");
            String userFood = keyboard.next();
            System.out.print("Which beverages would you like served? pick 'soda', 'beer and wine' or 'open bar'");
            String userBev = keyboard.next();
            System.out.print("Pick what type of entertainment you would like at your event? pick 'DJ', 'live band' or 'none'");
            String userEnt = keyboard.next();

            Event newEvent = new Event(userGuests, userFood, userBev, userEnt);

            int guestPrice = newEvent.guestPriceCalc(userGuests);
            int foodPrice = Integer.parseInt(newEvent.foodPriceCalc(userFood));
            int bevPrice = Integer.parseInt(newEvent.foodPriceCalc(userBev));
            int entPrice = Integer.parseInt(newEvent.foodPriceCalc(userEnt));

            int totalPrice = guestPrice + foodPrice + bevPrice + entPrice;
            System.out.print(totalPrice);

        }
    }
}

