/**
 *
 * @author Akmal Nuur Fauzan (20220040060)
 */
public class GameDev extends Game{
    protected String Developer;
    protected String Publisher;
    
    public GameDev(String Game_Title, String Game_Genre, String Game_ReleaseDate ,String Developer, String Publisher, int Game_Price){
        super(Game_Title, Game_Genre, Game_ReleaseDate, Game_Price);
        this.Developer = Developer;
        this.Publisher = Publisher;
    }
    
    @Override
    public void InfoGame(){
        System.out.println("Nama          : " + super.Game_Title);
        System.out.println("Genre         : " + super.Game_Genre);
        System.out.println("Tanggal Rilis : " + super.Game_ReleaseDate);
        System.out.println("Developer     : " + this.Developer);
        System.out.println("Publisher     : " + this.Publisher);
        System.out.println("Harga Game    : " + super.Game_Price);
    }
}
