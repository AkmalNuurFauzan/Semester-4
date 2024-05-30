/**
 *
 * @author Akmal N.F
 */
public class Exception4 {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c"};
        try {
            System.out.println(b[3]); // This will throw ArrayIndexOutOfBoundsException
            System.out.println(bil / 0); // This will throw ArithmeticException if the previous line doesn't throw
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Melebihi jumlah array"); // Array index out of bounds error message
        } catch (ArithmeticException e) {
            System.out.println("Terjadi Aritmatika error"); // Arithmetic error message
        } catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi"); // General error message
        }
    }
}
