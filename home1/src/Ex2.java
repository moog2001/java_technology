import java.util.Scanner;

public class Ex2 {

    public Ex2(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter string");
        String line = input1.nextLine();
        getInt(line);
    }
    private void getInt (String str){
        int num, curNum = 0, ans = 0;
        boolean lastInt = false;
        char chr;
        for(int i=0; i < str.length(); i++) {
            chr = str.charAt(i);
            num = 0;
            Boolean flag = Character.isDigit(chr);
            if(flag) {
                num = Character.getNumericValue(chr);
                if(lastInt){
                    curNum *= 10;
                    curNum += num;
                }else{
                    curNum = num;
                }
                lastInt = true;
            }
            else{
                lastInt = false;
                ans += curNum;
                curNum = 0;
            }
        }
        if(lastInt)
            ans += curNum;

        System.out.println("Answer");
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Ex2();
    }
}
