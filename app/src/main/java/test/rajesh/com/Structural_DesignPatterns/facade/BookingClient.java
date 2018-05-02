package test.rajesh.com.Structural_DesignPatterns.facade;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import test.rajesh.com.dao_example.R;

/**
 * Created by Rajesh Kumar on 02-05-2018.
 */
public class BookingClient extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Booking booking = new BookingImpl();
        booking.getbooking();
    }
}
