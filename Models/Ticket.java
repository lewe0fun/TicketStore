package Models;

import java.util.Date;

/**
 * Модель билета
 */
public class Ticket{


    private final int id;
    private final int place;
    private final Date date;
    private final int routeNumber;
    private int zoneStart;
    private int zoneStop;
    private final int price;
    private boolean isValid;


    public Ticket(int id, int routeNumber, int place, int zoneStart, int price, Date date, int zoneStop, boolean isValid) {
        this.id = id;
        this.routeNumber = routeNumber;
        this.place = place;
        this.zoneStart = zoneStart;
        this.price = price;
        this.date = date;
        this.zoneStop = zoneStop;
        this.isValid = isValid;
    }


    @Override
    public String toString() {
        return "Ticket" +
                " Route Number " + routeNumber +
                ", Place " + place +
                ", Price " + price + " rub." +
                ", Date " + date +
                ", " + (isValid ? "Free" : "Busy");
    }


    public String toPrint() {
        return "Ticket" +
                "\nRoute Number " + routeNumber +
                "\nPlace " + place +
                "\nPrice " + price + "rub." +
                "\nDate " + date;
    }

    public void setZoneStart(int zoneStart) {
        this.zoneStart = zoneStart;
    }

    public void setZoneStop(int zoneStop) {
        this.zoneStop = zoneStop;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public int getPlace() {
        return place;
    }

    public Date getDate() {
        return date;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public int getPrice() {
        return price;
    }

    public boolean isValid() {
        return isValid;
    }

    @Override
    public int hashCode() {
        return date.hashCode() ^ (routeNumber + place + price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.equals((Ticket) obj);
    }


    public boolean equals(Ticket ticket) {
        boolean isIt = ticket != null
                && ticket.getRouteNumber() == this.routeNumber
                && ticket.getPlace() == this.place
                && ticket.getPrice() == this.price
                && ticket.getDate() == this.date
                && ticket.hashCode() == this.hashCode();

        if (isIt) {
            return true;
        }
        return false;
    }

    public boolean getValid() {
        return isValid;
    }
}
