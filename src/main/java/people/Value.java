package people;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by kevinallen on 3/30/17.
 */

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Value {

    private Long id;
    private String User;

    public Value() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", User='" + User + '\'' +
                '}';
    }
}