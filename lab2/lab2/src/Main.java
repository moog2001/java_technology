import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private String _fileName = "src/demo.txt";

    public static void main(String[] args) {
        new Main();
    }

    Main(){
        try{
            ReadFile();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void ReadFile() throws FileNotFoundException {
        File file = new File(_fileName);
        Scanner input = new Scanner(file);
        String line = "";
        while(input.hasNext()){
            line = input.nextLine();
            System.out.println(line);
        }
    }
}
