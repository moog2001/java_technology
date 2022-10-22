import java.io.*;
import java.util.Random;

public class Ex2 {
    private File _file = null;
    private File _newFile = null;
    private ObjectInputStream _input;
    private ObjectOutput _output;
    private String _fileName = "binary2.dat";
    private String _newFileName = "src/newBinary2.txt";
    private int _total = 0;
    private int[] _array = new int[3];

    public static void main(String[] args) {
        try {
            new Ex2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Ex2() throws IOException {

        _file = new File(_fileName);
        _newFile = new File(_newFileName);
        if (_file.exists()) {
            createBinaryFile();
        } else {
            _file = new File(_fileName);
            createBinaryFile();
        }

        read();

        if (_newFile.exists()) {
            write();
        } else {
            _file = new File(_fileName);
            write();
        }
    }

    void createBinaryFile() throws IOException {

        Random random = new Random();
        try {
            _output = new ObjectOutputStream(new FileOutputStream(_file));
            int[] tmp = new int[3];

            for (int i = 0; i < 100; i++) {
                tmp[0] = random.nextInt(2000);
                tmp[1] = random.nextInt(2000);
                tmp[2] = random.nextInt(2000);
                _output.writeObject(tmp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

        _output.close();
    }

    void read() throws IOException {

        _input = new ObjectInputStream(new FileInputStream(_file));

        int sum = 0;
        try {
            while (true) {
                sum = 0;
                int[] tmp = (int[]) (_input.readObject());
                for (int i = 0; i < 3; i++) {
                    sum += tmp[i];
                }
                if (sum > _total)
                    _total = sum;
                _array = tmp;

            }
        } catch (EOFException e) {

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        _input.close();
    }

    void write() throws IOException {
        PrintWriter printWriter = new PrintWriter(_newFile);

        for (int i = 0; i < 3; i++) {
            printWriter.print(_array[i] + " ");
        }

        printWriter.print("\nTotal: " + _total);
        printWriter.close();
    }
}