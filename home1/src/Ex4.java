import java.util.Scanner;

public class Ex4 {

    private Ex4() {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String line1 = input1.nextLine();
        System.out.println("Enter string 2: ");
        String line2 = input2.nextLine();

        char chr1, chr2;

        chr1 = line1.charAt(line1.length() - 1);
        chr2 = line2.charAt(line2.length() - 1);

        if(Character.toLowerCase(chr1) == Character.toLowerCase(chr2)){
            System.out.println("Adilhan useg ");
        }else{
            System.out.println("Oor useg ");
        }

    }

    public static void main(String[] args) {
        new Ex4();
    }
}
