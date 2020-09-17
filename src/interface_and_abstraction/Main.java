package interface_and_abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        int number;
        Scanner in = new Scanner(System.in);

        System.out.print("input number of seats in Classroom: ");
        number = in.nextInt();
        Classroom classroom = new Classroom(number);
        classroom.print();
        classroom.showNumberOfSeats();

        LectureAuditorium lectAud = new LectureAuditorium();
        System.out.print("input number of seats in Lecture Auditorium: ");
        number = in.nextInt();
        lectAud.setNumberOfSeats(number);
        lectAud.print();
        lectAud.showNumberOfSeats();

        System.out.print("input number of seats in Chemical Laboratory: ");
        number = in.nextInt();
        ChemicalLaboratory chemLab = new ChemicalLaboratory(number, true);
        chemLab.print();
        chemLab.showNumberOfSeats();
        chemLab.showIsOpen();

        int number1;

        System.out.print("input number of seats in Computer Laboratory: ");
        number = in.nextInt();
        System.out.print("input number of computers in Computer Laboratory: ");
        number1 = in.nextInt();
        ComputerLaboratory compLab = new ComputerLaboratory(number,number1);
        compLab.print();
        compLab.showNumberOfSeats();
        compLab.showNumberOfComputers();

        System.out.println("\nNumber of seats: " + compLab.getNumberOfSeats());


        //System.out.println(compLab.value);
        System.out.println();
        System.out.println(compLab.toString());
        System.out.println(compLab.hashCode());
        System.out.println(compLab.equals(chemLab));
        System.out.println(compLab.equals(compLab));

    }
}
