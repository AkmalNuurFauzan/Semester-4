/**
 *
 * @author akmal
 */
public class Person {
    String Name;
    String Address;
    
    public Person(String Name, String Address){
        this.Name = Name;
        this.Address = Address;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getAddress(){
        return Address;
    }
    
    public void setAddress(String Address){
        this.Address = Address;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return
                "Name     :" + this.Name + 
                "\nAddress  :" + this.Address;
    }
}
