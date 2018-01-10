import models.Event;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Guest on 1/8/18.
 */
public class App {
    public static void main(String[] args) throws IOException {
        boolean programRunning = true;
        System.out.println("Hello! Let's estimate the cost of your next event! Type 'start' to start or 'end' to cancel");

        Scanner keyboard = new Scanner(System.in);


        while (programRunning) {
            if (keyboard.nextLine().equals("start")) {
                System.out.println("How many guests will be attending your event?");
                String guestString = keyboard.nextLine();
                int userGuests = Integer.parseInt(guestString);
                    if (userGuests > 300) {
                        System.out.println("We can only serve a maximum of 300 guests. Press 'start' to start over");
                        continue;
                    }
                System.out.print("What meal would you like served? pick 'chicken', 'steak' or 'vegetarian'");
                String userFood = keyboard.nextLine();
                    if (!"chicken".equals(userFood) && (!"steak".equals(userFood) && (!"vegetarian".equals(userFood)))) {
                        System.out.println("input not recognized, press 'start' to start over");
                        continue;
                }
                System.out.print("Which beverages would you like served? pick 'soda', 'wine and beer' or 'open bar'");
                String userBev = keyboard.nextLine();
                    if (!"soda".equals(userBev) && (!"wine and beer".equals(userBev) && (!"open bar".equals(userBev)))) {
                        System.out.println("input not recognized, press 'start' to start over");
                        continue;
                }
                System.out.print("Pick what type of entertainment you would like at your event? pick 'DJ', 'live band' or 'none'");
                String userEnt = keyboard.nextLine();
                if (!"DJ".equals(userEnt) && (!"live band".equals(userEnt) && (!"none".equals(userEnt)))) {
                    System.out.println("input not recognized, press 'start' to start over");
                    continue;
                }
                Event newEvent = new Event(userGuests, userFood, userBev, userEnt);
                newEvent.foodPriceCalc();
                String bev = newEvent.bevPriceCalc();
                newEvent.entPriceCalc();
                newEvent.getGuestPrice();
                newEvent.getFoodPrice();
                newEvent.getBevPrice();
                newEvent.getEntPrice();

                int totalPrice = newEvent.getTotalPrice();
                int coupon1 = newEvent.getCoupon1(totalPrice);
                int coupon2 = newEvent.getCoupon2(totalPrice);
                System.out.print("Thank you, your estimate is $" + totalPrice);
                System.out.println("----------------------");
                if (totalPrice > 500 && totalPrice < 1000) {
                    System.out.println("Your order qualifies for a coupon! Type 'SAVE100' to receive $100 off your total!");
                    String couponInput = keyboard.nextLine();
                    if (couponInput.equals("SAVE100")) {
                        System.out.println("New total: $" + coupon1);
                        System.out.println("type 'start' to create a new even or 'end' to cancel");
                    } else {
                        System.out.print("input not recognized, press 'start' to start over");
                        continue;
                    }

                } else {

                }

                if (totalPrice > 1000) {
                    System.out.println("Your order qualifies for a coupon! Type 'SAVE300' to receive $300 off your total!");
                    String couponInput = keyboard.nextLine();
                    if (couponInput.equals("SAVE300")) {
                        System.out.println("New total: $" + coupon2);
                        System.out.println("type 'start' to create a new even or 'end' to cancel");
                    } else {
                        System.out.println("input not recognized, press 'start' to start over");
                        continue;
                    }

                }
            } else if (keyboard.nextLine().equals("end")) {
                break;
            } else {
                System.out.println("Input not recognized.");
            }
        }

    }
}

