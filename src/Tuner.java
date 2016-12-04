/**
 * Created by Helen on 14/11/2016.
 */
public class Tuner {
    final String name;
    final Location location;
    String phone;
    Rating rating;

    public Tuner(final String name,
                 final Location location,
                 String phone,
                 Rating rating) {
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

    public boolean fullMathches(Tuner matchSearch) {
        return location == matchSearch.location && rating == matchSearch.rating;
    }

    public boolean partialMathches(Tuner matchSearch) {
        return location == matchSearch.location || rating == matchSearch.rating;
    }
}
