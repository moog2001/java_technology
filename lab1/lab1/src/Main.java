import java.util.Scanner; // Scanner is in the java.util package

public class Main {
    double monthlyPayment, area, volume, length;

    public Main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter monthly save amount: ");
        monthlyPayment = input.nextDouble();
        PrintMontlyCompound(0, monthlyPayment, 0,6, 0.3125);

    }

    void PrintMontlyCompound(double previous, double inputMonthly,int currentMonth, int inputMonths, double rate) {

        double newCompound = (previous + inputMonthly ) * (1+(rate/100));
        System.out.println("after " + (currentMonth+1) + " months: " + String.format("%.2f",newCompound));

        if (currentMonth <= inputMonths+2) {
            PrintMontlyCompound(newCompound, inputMonthly,currentMonth+1 ,inputMonths - 1, rate);
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
    }

}