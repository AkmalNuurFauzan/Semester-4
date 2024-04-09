import java.util.ArrayDeque;
/**
 *
 * @author akmal
 */
public class ContohArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> antrian = new ArrayDeque<>();

        antrian.add("Akmal");
        antrian.add("Nuur");
        antrian.add("Fauzan");

        System.out.println("Isi ArrayDeque: " + antrian);

        String depan = antrian.pollFirst();

        String belakang = antrian.pollLast();

        System.out.println("Data yang diambil dari depan: " + depan);
        System.out.println("Data yang diambil dari belakang: " + belakang);
        System.out.println("Isi ArrayDeque setelah dihapus: " + antrian);
    }
}
