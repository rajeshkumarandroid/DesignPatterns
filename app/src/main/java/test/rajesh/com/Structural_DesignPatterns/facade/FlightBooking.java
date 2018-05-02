package test.rajesh.com.Structural_DesignPatterns.facade;

import android.util.Log;

/**
 * Created by Rajesh Kumar on 02-05-2018.
 */
public class FlightBooking implements Booking {

    String name;
    String day;
    FlightBooking(String name,String day){
        this.name = name;
        this.day = day;
    }
    @Override
    public void getbooking() {
        Log.e("Flight ","booked Successfully");
    }
}
