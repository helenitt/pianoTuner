/**
 * Created by Helen on 14/11/2016.
 */
public class Tuner {
    private String name;
    private Enum location;
    private String phone;
    private Enum rating;

    public Tuner(String name, Enum location, String phone, Enum rating) {
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public Enum getLocation() {
        return location;
    }
    public String getPhone() {
        return phone;
    }
    public Enum getRating() {
        return rating;
    }
}
