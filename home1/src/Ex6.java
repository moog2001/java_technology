import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex6 {


    String newLine;
    String oldLine;

    public Ex6() {
        File file = new File("src/com/company/text.txt");

        try {
            replaceFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void replaceFile(File file) throws IOException {
        Scanner input = null;
        File myObj = new File("src/com/company/newText.txt");
        PrintWriter printWriter = new PrintWriter(myObj);
        input = new Scanner(file);
        String[] text = new String[1000];
        int n = 0;
        while(input.hasNextLine()) {
            String data = input.nextLine();
            text[n] = data;
            n++;
        }

        for(int i = n - 1; i >= 0; i--){
            System.out.println("Line : " + text[i]);
            printWriter.println(text[i]);
        }

        printWriter.close();
        input.close();
    }
    public static void main(String[] args) {
        new Ex6();
    }
}
