package exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Exercise1TestProgram {


    // Ширээний утас объект үүсгэнэ
    @Test
    void test1(){
        // test fails if object is null
        new DeskPhone(911);
    }

    // Гар утас объект үүсгэнэ
    @Test
    void test2(){
        // test fails if object is null
        new MobilePhone(912);
    }

    // Утас тус бүрийг асаана.
    @Test
    void test3(){

        // test fails if any exception gets thrown;
        MobilePhone mobilePhone = new MobilePhone(911);
        mobilePhone.powerOn();
        DeskPhone deskPhone = new DeskPhone(912);
        deskPhone.powerOn();
    }

    // Утас тус бүрээс өгөгдсөн дугаар луу дуудлага хийнэ
    // Утас бүр дуудлагад хариу өгнө
    @Test
    void test4and5(){
        int receiveMobileNumber = 911;
        int receiverDeskNumber = 912;
        int callerMobileNumber = 0;
        int callerDeskNumber = 1;

        MobilePhone receiveMobilePhone = new MobilePhone(receiveMobileNumber);
        assertFalse(receiveMobilePhone.isRinging());

        MobilePhone callerMobilePhone = new MobilePhone(callerMobileNumber);
        // start to dial on the caller
        callerMobilePhone.dial(receiveMobileNumber);
        // start to dial on the receiver
        assertTrue(receiveMobilePhone.callPhone(receiveMobileNumber));
        // tests if the caller is ringing
        assertTrue(callerMobilePhone.isRinging());
        // tests if the caller is ringing
        assertTrue(receiveMobilePhone.isRinging());

        receiveMobilePhone.answer();
        // test if exercise1.MobilePhone answers
        assertFalse(receiveMobilePhone.isRinging());

        DeskPhone receiverDeskPhone = new DeskPhone(receiverDeskNumber);
        DeskPhone callerDeskPhone = new DeskPhone(callerDeskNumber);
        callerDeskPhone.dial(receiverDeskNumber);
        assertTrue(receiverDeskPhone.callPhone(receiverDeskNumber));
        assertTrue(callerDeskPhone.isRinging());
        assertTrue(receiverDeskPhone.isRinging());

        // test if exercise1.DeskPhone answers
        receiverDeskPhone.answer();
        assertFalse(receiverDeskPhone.isRinging());
    }




}
