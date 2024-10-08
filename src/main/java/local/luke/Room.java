package local.luke;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;

public class Room {

    private int numberOfRoom;
    private int numberOfBed;
    private boolean balcony;
    private boolean seaView;
    private BigDecimal priceOfNight;

    public Room(int numberOfRoom, int numberOfBed, boolean balcony, boolean seaView, BigDecimal priceOfNight) {
    this.numberOfRoom = numberOfRoom;
    this.numberOfBed = numberOfBed;
    this.balcony = balcony;
    this.seaView = seaView;
    this.priceOfNight = priceOfNight;
    }

    public int getNumberOfRoom() {
    return numberOfRoom;
    }
    public void setNumberOfRoom(int numberOfRoom) {
    this.numberOfRoom = numberOfRoom;
    }
    public int getNumberOfBed() {
    return numberOfBed;
    }
    public void setNumberOfBed(int numberOfBed) {
    this.numberOfBed = numberOfBed;
    }
    public boolean isBalcony() {
    return balcony;
    }
    public void setBalcony(boolean balcony) {
    this.balcony = balcony;
    }
    public boolean isSeaView() {
    return seaView;
    }
    public void setSeaView(boolean seaView) {
    this.seaView = seaView;
    }
    public BigDecimal getPriceOfNight() {
    return priceOfNight;
    }
    public void setPriceOfNight(BigDecimal priceOfNight) {
    this.priceOfNight = priceOfNight;
    }

    public String getDescription() {
    String description = "Pokoj č. " + this.numberOfRoom + ", počet lůžek: " + this.numberOfBed + ", balkón: " + this.balcony + ", výhled na moře: " + this.seaView + ", cena za noc: " + this.priceOfNight;
    return description;
    }
}
