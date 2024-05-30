/**
 *
 * @author Akmal N.F
 */
public class Exception1 {
    public static void main(String[] args) {
        int a[]=new int[5];
        try{
            a[5] = 100;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi pelanggaran Memory");
        }
    }
}
