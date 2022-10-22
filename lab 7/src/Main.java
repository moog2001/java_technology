import java.util.*;

public class Main {

    private LinkedHashSet<Integer> _list = new LinkedHashSet<Integer>();


    public Main() {
        input();
        output(_list);
        sort(_list);

    }


    void input() {
        System.out.println("Enter the number of values into the list: ");
        Scanner scanner = new Scanner(System.in);

        int r;
        while ((r = scanner.nextInt()) > 0) {
            _list.add(r);
        }
    }

    void output(Collection list) {
        System.out.println(list);
    }

    void sort(Collection list) {
        List tempList = new ArrayList(list);
        Collections.sort(tempList);

        output(tempList);
    }


    public static void main(String[] args) {
        new Main();
    }


}
