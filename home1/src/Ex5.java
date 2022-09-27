import java.util.Scanner;

public class Ex5 {

    public Ex5() {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String line1 = input1.nextLine();
        System.out.println("Enter string 2: ");
        String line2 = input2.nextLine();
        System.out.println("Enter int  ");
        int n = input3.nextInt();

        String ans = "";

        for( int i = 0; i < n; i++){
            ans += line1;
            if(i + 1 != n){
                ans += line2;
            }
        }

        System.out.println("Answer");
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Ex5();
    }
}
