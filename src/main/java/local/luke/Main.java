package local.luke;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        // Založení hostů
Guest adelaMalikova = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
Guest janDvoracek = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
janDvoracek.setDateOfBirth(LocalDate.of(1995, 4, 5));

// Výpis hostů
        System.out.println("Hosté:");
        System.out.println(adelaMalikova.getDescription());
        System.out.println(janDvoracek.getDescription());

        // Založení pokojů
Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000));
Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000));
Room room3 = new Room(3, 3, false, true, BigDecimal.valueOf(2400));

// Výpis pokojů
System.out.println("Přehled pokojů:");
System.out.println(room1.getDescription());
System.out.println(room2.getDescription());
System.out.println(room3.getDescription());

// Založení rezervace
Booking booking1 = new Booking(room1, adelaMalikova, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfVacation.WORKING);
Booking booking2 = new Booking(room3, adelaMalikova, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfVacation.HOLIDAY);
Booking booking3 = new Booking(room3, janDvoracek, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfVacation.HOLIDAY);
Booking booking4 = new Booking(room1, janDvoracek, TypeOfVacation.WORKING);

// Přidání rezervace do seznamu rezervací
BookingManager bookingManager = new BookingManager();
bookingManager.addBooking(booking1);
bookingManager.addBooking(booking2);
bookingManager.addBooking(booking3);
bookingManager.addBooking(booking4);

// Načtení a vypsání rezervací
List<Booking> guests = bookingManager.getOtherGuests();
System.out.println("Rezervace " + guests.size() + ":");
for (Booking guest : guests) {
System.out.println(guest.getBookingOfGuest().getName() + " " + guest.getBookingOfGuest().getSurname() + ", " + guest.getBookingFrom().format(DateTimeFormatter.ofPattern("d. M. y")) + " - " + guest.getBookingTo().format(DateTimeFormatter.ofPattern("d. M. y")) + ", pokoj č. " + guest.getBookingOfRoom().getNumberOfRoom() + ", " + guest.getTypeOfVacation().getTextVacation() + " pobyt");
}
    }
}