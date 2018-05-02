package test.rajesh.com.Structural_DesignPatterns.facade;

import android.util.Log;

/**
 * Created by Rajesh Kumar on 02-05-2018.
 */
public class HotelBooking implements Booking {

    String name;
    String day;
    HotelBooking(String name,String day){
        this.name = name;
        this.day = day;
    }
    @Override
    public void getbooking() {
        Log.e("Hottle ","booked Successfully");
    }
}
