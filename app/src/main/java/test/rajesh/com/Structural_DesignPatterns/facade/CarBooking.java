package test.rajesh.com.Structural_DesignPatterns.facade;

import android.util.Log;

/**
 * Created by Rajesh Kumar on 02-05-2018.
 */
public class CarBooking implements Booking {
    String name;
    String day;
    CarBooking(String name,String day){
        this.name = name;
        this.day = day;
    }
    @Override
    public void getbooking() {
        Log.e("Car ","booked Successfully");
    }
}
