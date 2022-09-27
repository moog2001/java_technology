package exercise1;

public class DeskPhone implements Callable {
    private int myNumber;
    private boolean isRinging;


    DeskPhone(int inputNumber) {
        myNumber = inputNumber;
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void dial(int phoneNumber) {
        isRinging =true;
    }

    @Override
    public void answer() {
        isRinging = false;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(isRinging)
            return false;
        if(this.myNumber == phoneNumber){
            isRinging = true;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
