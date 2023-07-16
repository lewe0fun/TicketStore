package Models;

/**
 * Модель перевозчика
 */
public class Carrier {

    private final int id;
    private final int places;
    private final int zones;
    private final long cardNumber;


    public Carrier(int id, int places, int zones, long cardNumber) {
        this.id = id;
        this.places = places;
        this.zones = zones;
        this.cardNumber = cardNumber;
    }

    public long getId() {
        return this.id;
    }

    public long getCardNumber() {
        return cardNumber;
    }
}
