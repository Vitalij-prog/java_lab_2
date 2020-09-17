package interface_and_abstraction;

public class LectureAuditorium implements Object, Auditorium{
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void print() {
        System.out.println("Lecture Auditorium");
    }

    @Override
    public void showNumberOfSeats() {
        System.out.println("Number of seats in Lecture Auditorium: " + this.numberOfSeats);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numberOfSeats;
        return result;
    }
    @Override
    public String toString() {
        String str = "";
        str += getClass() + " " + numberOfSeats;
        return str;
    }
}
