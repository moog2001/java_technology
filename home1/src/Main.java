import java.util.Scanner;

public class Main {

    public Main(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter string");
        String line = input1.nextLine();
        getInt(line);
    }

    private void getInt (String str){
        int ans = 0;
        int num;
        char chr;
        for(int i=0; i < str.length(); i++) {
            chr = str.charAt(i);
            num = 0;
            Boolean flag = Character.isDigit(chr);
            if(flag) {
                num = Character.getNumericValue(chr);
            }
           ans += num;
        }
        System.out.println("Answer");
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
