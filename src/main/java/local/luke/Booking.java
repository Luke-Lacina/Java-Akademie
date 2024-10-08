package local.luke;

import java.time.LocalDate;

public class Booking {

    private Room bookingOfRoom;
    private Guest bookingOfGuest;
    private LocalDate bookingFrom;
    private LocalDate bookingTo;
    private TypeOfVacation typeOfVacation;    
    
    public Booking(Room bookingOfRoom, Guest bookingOfGuest, LocalDate bookingFrom, LocalDate bookingTo, TypeOfVacation typeOfVacation) {
    this.bookingOfRoom = bookingOfRoom;
    this.bookingOfGuest = bookingOfGuest;
    this.bookingFrom = bookingFrom;
    this.bookingTo = bookingTo;
    this.typeOfVacation = typeOfVacation;
    }

    public Booking(Room bookingOfRoom, Guest bookingOfGuest, TypeOfVacation typeOfVacation) {
    this(bookingOfRoom, bookingOfGuest, LocalDate.now(), LocalDate.now().plusDays(6), typeOfVacation);
    }

    public Room getBookingOfRoom() {
    return bookingOfRoom;
    }
    public void setBookingOfRoom(Room bookingOfRoom) {
    this.bookingOfRoom = bookingOfRoom;
    }
    public Guest getBookingOfGuest() {
    return bookingOfGuest;
    }
    public void setBookingOfGuest(Guest bookingOfGuest) {
    this.bookingOfGuest = bookingOfGuest;
    }
    public LocalDate getBookingFrom() {
    return bookingFrom;
    }
    public void setBookingFrom(LocalDate bookingFrom) {
    this.bookingFrom = bookingFrom;
    }
    public LocalDate getBookingTo() {
    return bookingTo;
    }
    public void setBookingTo(LocalDate bookingTo) {
    this.bookingTo = bookingTo;
    }
    public TypeOfVacation getTypeOfVacation() {
    return typeOfVacation;
    }
    public void setTypeOfVacation(TypeOfVacation typeOfVacation) {
    this.typeOfVacation = typeOfVacation;
    }

}
