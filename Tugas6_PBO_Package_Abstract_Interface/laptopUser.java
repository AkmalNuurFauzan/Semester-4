/**
 *
 * @author akmal
 */
public class laptopUser {
    private final laptop laptop;
    
    public laptopUser(laptop laptop){
        this.laptop = laptop;
    }
    
    void turnOnLaptop(){
        this.laptop.powerOn();
    }
    
    void turnOffLaptop(){
        this.laptop.powerOff();
    }
    
    void makeLaptopLouder(){
        this.laptop.volumeUp();
    }
    
    void makeLaptopSilent(){
        this.laptop.volumeDown();
    }
}
