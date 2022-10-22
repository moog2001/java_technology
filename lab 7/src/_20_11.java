import javax.swing.plaf.RootPaneUI;
import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class _20_11 {

    int numberLength = 10;
    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        new _20_11();
    }

    public _20_11() {
        input();
        output(stack);
    }

    void input() {
        System.out.println("Input 10 Integers: ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numberLength; i++) {

            int temp = in.nextInt();
            if (!stack.isEmpty()) {
                if (stack.peek() != temp) {
                    stack.add(temp);
                }
            }else{
                stack.add(temp);
            }
        }
    }

    void output(Stack stack) {
        System.out.printf("\n");
        while (!stack.isEmpty()) {
            System.out.printf(stack.pop().toString() + " ");
        }
    }
}
