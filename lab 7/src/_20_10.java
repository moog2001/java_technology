import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class _20_10 {
    Stack<String> stack1;
    Stack<String> stack2;



    public static void main(String[] args) {
        new _20_10();
    }
    public _20_10(){

        stack1 = new Stack<>();
        stack1.add("Chemistry");
        stack1.add("Mathematics");
        stack1.add("Biology");
        stack1.add("English");

        stack2 = new Stack<>();
        stack2.add("Biology");
        stack2.add("English");
        stack2.add("Geography");
        stack2.add("Physics");

        first();
        second();
        third();
    }

    void first(){
        ArrayList temp = new ArrayList(stack1);
        temp.retainAll(stack2);
        Stack temp1 = (Stack) stack1.clone();
        temp1.removeAll(temp);
        output(temp1);
    }

    void second(){
        ArrayList temp = new ArrayList(stack2);
        temp.retainAll(stack1);
        Stack temp1 = (Stack) stack2.clone();
        temp1.removeAll(temp);
        output(temp1);
    }

    void third(){
        ArrayList temp = new ArrayList(stack2);
        temp.retainAll(stack1);
        output(temp);
    }

    void output(Collection list) {
        System.out.println(list);
    }
}
