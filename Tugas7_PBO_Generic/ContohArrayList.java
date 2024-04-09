import java.util.ArrayList;
/**
 *
 * @author akmal
 */
public class ContohArrayList {
    public static void main(String[] args) {
 
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Akmal");
        nama.add("Nuur");
        nama.add("Fauzan");

        System.out.println("Isi ArrayList: " + nama);

        nama.remove("Fauzan");

        boolean adaAkmal = nama.contains("Akmal");

        System.out.println("Apakah ada Akmal? " + adaAkmal);

        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
}
