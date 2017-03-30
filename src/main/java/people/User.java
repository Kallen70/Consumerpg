package people;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by kevinallen on 3/30/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String name;
    private  String address;
    private String phone;
    private String birthDay;
    private String email;
    private Value value;








  public User(){

  }

    public User(String name, String address, String phone, String birthDay, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.birthDay = birthDay;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", email='" + email + '\'' +
                ", value=" + value +
                '}';
    }

}
