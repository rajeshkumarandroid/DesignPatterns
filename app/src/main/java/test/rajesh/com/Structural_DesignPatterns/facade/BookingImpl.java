package test.rajesh.com.Structural_DesignPatterns.facade;

/**
 * Created by Rajesh Kumar on 02-05-2018.
 */
public class BookingImpl implements  Booking {
    @Override
    public void getbooking() {
        bookingHotel();
        bookingFlight();
        bookingCar();
    }
    private void bookingHotel(){

    Booking booking = new HotelBooking("Rajesh","today");
    booking.getbooking();
    }
    private void bookingFlight(){

        Booking booking = new FlightBooking("Raaz","today");
        booking.getbooking();
    }
    private void bookingCar(){

        Booking booking = new CarBooking("Raaz Kumar","today");
        booking.getbooking();
    }
}
