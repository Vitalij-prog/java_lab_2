package interface_and_abstraction;

public class ComputerLaboratory extends Laboratory {

    private int numberOfComputers;

    public ComputerLaboratory(int number1, int number2) {
        super(number1);
        numberOfComputers = number2;
    }

    @Override
    public void showNumberOfSeats() {
        System.out.println("Number of seats in Computer Laboratory: " + this.numberOfSeats);
    }

     public void showNumberOfComputers() {
         System.out.println("Number of computers in Computer Laboratory: " + this.numberOfComputers);
     }

    @Override
    public void print() {
        System.out.println("Computer Laboratory");
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
        result = prime * result + numberOfComputers;
        return result;
    }
    @Override
    public String toString() {
        String str = "";
        str += getClass() + " " + numberOfSeats + " " + numberOfComputers;
        return str;
    }
}
