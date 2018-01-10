package models;

public class Event {
    private int guests;
    private String food;
    private String bev;
    private String ent;
    private int guestPrice;
    private String foodPrice;
    private String bevPrice;
    private String entPrice;
    private int totalPrice;
    private int coupon1;
    private int coupon2;


    public Event(int guests, String food, String bev, String ent) {
        this.guests = guests;
        this.food = food;
        this.bev = bev;
        this.ent = ent;
    }


    public int guestPriceCalc() {
        if (15 > this.guests) {
            guestPrice += 100;
        } else if ((this.guests >= 15) && (this.guests <= 50)) {
            guestPrice += 200;
        } else if ((this.guests > 50) && (this.guests <= 100)) {
            guestPrice += 300;
        } else if ((this.guests > 100)) {
            guestPrice += 300;
        } else {
            return 0;
        }
        return guestPrice;
    }

    public String foodPriceCalc() {
        if (this.food.equals("chicken")) {
            foodPrice = "150";
        } else if (this.food.equals("steak")) {
            foodPrice = "200";
        } else if (this.food.equals("vegetarian")) {
            foodPrice = "100";
        } else {
            return "200";
        }

         return foodPrice;
    }

    public String bevPriceCalc() {
        if (this.bev.equals("soda")) {
            bevPrice ="50";
        } else if (this.bev.contains("wine and beer")) {
            bevPrice ="200";
        } else if (this.bev.contains("open bar")) {
            bevPrice ="1000";
        } else {
            return "200";
        }
        return bevPrice;
    }

    public String entPriceCalc() {
        if (this.ent.equals ("none")) {
            entPrice = "0";
        } else if (this.ent.equals ("DJ")) {
            entPrice = "500";
        } else if (this.ent.equals ("live band")) {
            entPrice = "1000";
        } else {
            return "500";
        }
        return entPrice;
    }


    public int getGuests() {
        return this.guests;
    }

    public String getFood() {
        return this.food;
    }

    public String getBev() {
        return this.bev;
    }

    public String getEnt() {
        return this.ent;
    }

    public int getGuestPrice() {
        return this.guestPrice;
    }

    public int getFoodPrice() {
        return Integer.parseInt(this.foodPrice);
    }
    public int getBevPrice() {
        return Integer.parseInt(bevPrice);
    }
    public int getEntPrice() {
        return Integer.parseInt(this.entPrice);
    }
    public int getTotalPrice() {
        return this.guestPrice+Integer.parseInt(this.foodPrice)+Integer.parseInt(this.bevPrice)+Integer.parseInt(this.entPrice);
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getCoupon1(int totalPrice) {
        return (totalPrice - 100);
    }

    public int getCoupon2(int totalPrice) {
        return (totalPrice - 300);
    }
}