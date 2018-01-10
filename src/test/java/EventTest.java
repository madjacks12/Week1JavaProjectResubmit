package models;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void runEvent_instanceWorks_2() {
        Event testEvent = new Event(2, "chicken", "soda", "band");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void runEvent_getsGuests_2() {
        Event testEvent = new Event(2, "chicken", "soda", "band");
        assertEquals(2, testEvent.getGuests());
    }

    @Test
    public void runEvent_getsFood_4() {
        Event testEvent = new Event(2, "chicken", "soda", "band");
        assertEquals("chicken", testEvent.getFood());
    }

    @Test
    public void runEvent_getsBeverages_6() {
        Event testEvent = new Event(2, "chicken", "soda", "band");
        assertEquals("soda", testEvent.getBev());
    }

    @Test
    public void runEvent_getsEnt_8() {
        Event testEvent = new Event(2, "chicken", "soda", "band");
        assertEquals("band", testEvent.getEnt());
    }

    @Test
    public void runEvent_guestsCalculatesPrice_100() {
        Event testEvent = new Event(100, "chicken", "soda", "band");
        assertEquals(300, testEvent.guestPriceCalc());
    }

    @Test
    public void runEvent_foodCalculatesCost_100() {
        Event testEvent = new Event(2, "chicken", "soda", "band");

        assertEquals("150", testEvent.foodPriceCalc());
    }

    @Test
    public void runEvent_bevCalculatesCost_50() {
        Event testEvent = new Event(2, "chicken", "soda", "band");

        assertEquals("50", testEvent.bevPriceCalc());
    }

    @Test
    public void runEvent_entCalculatesCost_50() {
        Event testEvent = new Event(2, "chicken", "soda", "live band");

        assertEquals("1000", testEvent.entPriceCalc());
    }

//    @Test
//    public void runEvent_TotalCost_2000() {
//        Event testEvent = new Event(2, "chicken", "soda", "live band", 100, "10", "50", "0");
//
//        assertEquals("2000", testEvent.totalCost());
//
//
//    }
}