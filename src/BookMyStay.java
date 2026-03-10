abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;
    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}

public class BookMyStay {
    public static void main(String[] args) {
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("Hotel Room Initialization\n");

        System.out.println("Single Room:");
        System.out.println("Beds: " + singleRoom.getNumberOfBeds());
        System.out.println("Size: " + singleRoom.getSquareFeet() + " sqft");
        System.out.println("Price per night: " + singleRoom.getPricePerNight());
        System.out.println("Available: " + singleAvailable + "\n");

        System.out.println("Double Room:");
        System.out.println("Beds: " + doubleRoom.getNumberOfBeds());
        System.out.println("Size: " + doubleRoom.getSquareFeet() + " sqft");
        System.out.println("Price per night: " + doubleRoom.getPricePerNight());
        System.out.println("Available: " + doubleAvailable + "\n");

        System.out.println("Suite Room:");
        System.out.println("Beds: " + suiteRoom.getNumberOfBeds());
        System.out.println("Size: " + suiteRoom.getSquareFeet() + " sqft");
        System.out.println("Price per night: " + suiteRoom.getPricePerNight());
        System.out.println("Available: " + suiteAvailable);
    }
}