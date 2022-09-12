import java.util.Date;

public class User {
    private Date birthdate;
    private Number size;
    private Address address; 

    public User(Date birthdate , Number size, Address address) {
        this.birthdate = birthdate; 
        this.size = size; 
        this.address = address; 
    }
}