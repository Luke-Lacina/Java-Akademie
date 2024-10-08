package local.luke;

import java.util.List;
import java.util.ArrayList;

public class BookingManager {

    private List<Booking> otherGuests = new ArrayList<>();

    public void addBooking(Booking booking) {
    otherGuests.add(booking);
    }

    public List<Booking> getOtherGuests() {
    return new ArrayList<>(otherGuests);
    }
}
