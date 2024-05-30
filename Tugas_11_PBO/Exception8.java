/**
 *
 * @author Akmal N.F
 */
import java.io.*;

public class Exception8 {
    public void methodA() {
        System.out.println("Method A");
    }

    // Corrected method signature to throw ArithmeticException
    public void methodB() throws ArithmeticException {
        System.out.println(20 / 0);
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args) {
        Exception8 c = new Exception8();
        c.methodA(); // Calls methodA()
        try {
            c.methodB(); // Tries to call methodB()
        } catch (Exception e) {
            System.out.println("Error di Method B");
        } finally {
            System.out.println("Ini selalu dicetak");
        }
    }
}

