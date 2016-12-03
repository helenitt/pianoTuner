/**
 * Created by Helen on 14/11/2016.
 */
public class Tuner {
    private String name;
    private String location;
    private String phone;
    private String rating;

    public Tuner(String name, String location, String phone, String rating) {
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.rating = rating;
    }

    public String getName() { return name; }
    public String getLocation() {
        return location;
    }
    public String getPhone() { return phone; }
    public String getRating() {
        return rating;
    }
}
