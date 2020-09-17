package interface_and_abstraction;

public class ChemicalLaboratory extends Laboratory {

    private boolean isOpen;
    @Override
    public void print() {
        System.out.println("Chemical Laboratory");
    }

    @Override
    public void showNumberOfSeats() {
        System.out.println("Number of seats in Chemical Laboratory: " + this.numberOfSeats);
    }

    public void showIsOpen() {

        System.out.println("Is the Chemical Laboratory open?: " + this.isOpen);
    }
    public ChemicalLaboratory(int number, boolean isOpen) {
        super(number);
        this.isOpen = isOpen;
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
        result = prime * result + (isOpen ? 1 : 0);
        return result;
    }
    @Override
    public String toString() {
        String str = "";
        str += getClass() + " " + numberOfSeats + " " + isOpen;
        return str;
    }

}
