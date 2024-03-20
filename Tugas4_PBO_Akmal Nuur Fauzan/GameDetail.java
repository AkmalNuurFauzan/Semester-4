/**
 *
 * @author Akmal Nuur Fauzan (20220040060)
 */
public class GameDetail {
    static int getDiscount(int harga_game, int diskon){
        return harga_game;
    }
    
    static double getDiscount(double harga_game, double diskon){
        diskon = diskon * harga_game;
        return harga_game - diskon;
    }
    public static void main(String[] args) {
        String nama_game = "Buy A Space for the Unbound";
        String genre_game = "Adventure, Indie";
        String rilis_game = "19 Jan, 2023";
        int harga_game = 99900;
        
        double diskon_game = getDiscount(harga_game, 0.4);
        
        GameDev gamePub = new GameDev(nama_game, genre_game, rilis_game, "Mojiken", "Toge Productions", harga_game);
        
        gamePub.InfoGame();
        System.out.println("Harga Diskon  : "+diskon_game);
    }
}
