import java.util.Scanner;

public class Ex3 {

    private Ex3() {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String line1 = input1.nextLine();
        System.out.println("Enter string 2: ");
        String line2 = input2.nextLine();

        int i = 0, j = 0;
        String ans = "";
        while (i < line1.length() && j < line2.length()){
            ans += line1.charAt(i);
            ans += line2.charAt(j);
            i++;
            j++;
        }
        while (i < line1.length()){
            ans += line1.charAt(i);
            i++;
        }

        while (j < line2.length()){
            ans += line2.charAt(j);
            j++;
        }

        System.out.println("Answer");
        System.out.println(ans);

    }

    public static void main(String[] args) {
        new Ex3();
    }
}
