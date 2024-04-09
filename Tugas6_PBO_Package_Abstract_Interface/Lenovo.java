/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akmal
 */
public class Lenovo implements laptop{
    private int volume;
    boolean is_power_on;
    
    public Lenovo(){
        this.volume = 50;
    }
    
    @Override
    public void powerOn(){
        is_power_on = true;
        System.out.println("Laptop Hidup");
        System.out.println("Lenovo Ideapad");
    }
    
    @Override
    public void powerOff(){
        is_power_on = false;
        System.out.println("Proses shutdown sedang berlangsung...");
    }
    
    @Override
    public void volumeUp(){
        if(is_power_on==true){
            if(this.volume==MAX_VOL){
                System.out.println("Volume Maksimal");
            } else {
                this.volume += 10;
                System.out.println("Volume Saat ini : " + this.getVolume());
            }
        } else {
            System.out.println("Laptop Mati!");
        }
    }
    
    @Override
    public void volumeDown(){
        if(is_power_on){
            if(this.volume==MIN_VOL){
                System.out.println("Volume Muted");
            } else {
                this.volume -= 10;
                System.out.println("Volume Saat ini : " + this.getVolume());
            }
        } else {
            System.out.println("Laptop Mati!");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }
}
