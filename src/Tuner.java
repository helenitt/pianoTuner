/**
 * Created by Helen on 14/11/2016.
 */
public class Tuner {
    private final String name;
    private final Location location;
    private String phone;
    private Rating rating;

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
    public Location getLocation() {
        return location;
    }
    public String getPhone() {
        return phone;
    }
    public Rating getRating() {
        return rating;
    }

    public boolean mathches(Tuner matchSearch) {
        return location == matchSearch.location && rating == matchSearch.rating;
    }
}
