import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex1 {
    File _file = null;
    DataInputStream _input;
    DataOutputStream _output;
    File _newFile = null;
    List<Integer> _list = new ArrayList<Integer>();
    int _average = 0;

    public static void main(String[] args) {
        try {
            new Ex1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Ex1() throws IOException {
        _file = new File("src/binary.dat");
        _newFile = new File("src/newBinary.txt");

        if (_file.exists()) {
            createBinaryFile();
        } else {
            _file = new File("binary.dat");
            createBinaryFile();
        }

        try {
            read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (_newFile.exists()) {
            write();
        } else {
            _file = new File("src/binary.dat");
            write();
        }

    }

    void read() throws IOException {
        _input = new DataInputStream(new FileInputStream(_file));
        int temp;
        try {
            while (true) {
                temp = _input.readInt();
                _average += temp;
                _list.add(temp);
            }
        } catch (EOFException e) {
            System.out.println(e);
        }

        _input.close();
    }

    void write() throws IOException {
        PrintWriter printWriter = new PrintWriter(_newFile);

        for (int i = 0; i < _list.size(); i++) {
            printWriter.print(_list.get(i).toString() + " ");
        }
        if (_list.size() != 0)
            _average /= _list.size();
        printWriter.print("Average: " + _average + "\n");
        printWriter.close();
    }

    void createBinaryFile() throws IOException {

        Random random = new Random();

        try {
            _output = new DataOutputStream(new FileOutputStream(_file));

            for (int i = 0; i < 100; i++) {
                _output.writeInt(random.nextInt(2000));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        _output.close();
    }

}