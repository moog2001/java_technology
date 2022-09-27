package exercise1;

import java.util.ArrayList;
import java.util.List;

public interface Callable {


    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}


