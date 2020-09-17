package interface_and_abstraction;

public abstract class Laboratory implements Auditorium, Object{

    protected int numberOfSeats;

    public int getNumberOfSeats() {

        return numberOfSeats;
    }

    public Laboratory(int number) {

        numberOfSeats = number;
    }

}
