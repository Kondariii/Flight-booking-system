import java.time.LocalDateTime;

public abstract class Flight implements Bookable, Describable {
    protected String flightNumber;
    protected String origin;
    protected String destination;
    protected LocalDateTime departureTime;
    protected int totalSeats;
    protected int bookedSeats;

    public Flight(String flightNumber, String origin, String destination, LocalDateTime departureTime, int totalSeats) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public abstract boolean bookTicket();

    public boolean seatsAvailable() {
        return bookedSeats < totalSeats;
    }

    public int getAvailableSeats() {
        return totalSeats - bookedSeats;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }
    public LocalDateTime getDepartureTime() { return departureTime; }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", bookedSeats=" + bookedSeats +
                ", totalSeats=" + totalSeats +
                '}';
    }
}
