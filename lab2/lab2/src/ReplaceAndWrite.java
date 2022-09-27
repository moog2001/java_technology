import java.io.*;
import java.util.Scanner;

public class ReplaceAndWrite {
    private String _fileName = "src/demo.txt";
    private String _searchString = "Moog";
    private String _replaceString = "Sumya";
    private String _newFileName = "src/newDemo.txt";

    public static void main(String[] args) {
        new ReplaceAndWrite();
    }

    ReplaceAndWrite() {
        try {
            DoWork();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void DoWork() throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(_fileName);
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            stringBuilder.append(input.nextLine()).append("\n");
        }
        String inputString = stringBuilder.toString();
        String _replacedString = inputString.replace(_searchString, _replaceString);
        File file1 = new File(_newFileName);
        if(!file1.exists()) {
            FileWriter _fileWriter = new FileWriter(file1);
            PrintWriter _printWriter = new PrintWriter(_fileWriter);
            _printWriter.printf(_replacedString);
            _printWriter.close();
        }else{
            throw new Exception("File Already exists.");
        }
    }
}
