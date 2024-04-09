
import java.util.Scanner;

/**
 *
 * @author akmal
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        laptop lenovo = new Lenovo();
        laptop acer = new Acer();
        laptop mac = new MacBook();
        

        System.out.println("Selamat datang di Sistem Kontrol Laptop Sederhana!\n");
        System.out.println("Silakan tentukan Merk laptop yang tersedia untuk Anda kendalikan: \n1.Lenovo \n2.Acer \n3.MacBook");
        System.out.print("Tolong pilihan Anda: ");
        
        laptop pilihLaptop;
        
        switch (scanner.nextLine()){
            case "1":
                pilihLaptop = lenovo;
                break;
            case "2":
                pilihLaptop = acer;
                break;
            case "3":
                pilihLaptop = mac;
                break;
            default:
                System.out.println("Pilihan laptop anda tidak valid");
                return;
        }
        
        laptopUser user = new laptopUser(pilihLaptop);
        
        while(true){
            System.out.println("\nMasukkan perintah:\n(ON, OFF) => Untuk Mengendalikan keadaan laptop\n(UP, DOWN) => untuk mengendalikan volume pada laptop\n'EXIT' untuk keluar:");
            String perintah = scanner.nextLine().toUpperCase();
            
            switch(perintah){
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilent();
                    break;
                case "EXIT":
                    System.out.println("Keluar...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Perintah tidak valid. Silakan coba lagi.");
            }
        }
    }
}
