/**
 * Created by Helen on 14/11/2016.
 */
public class Tuner extends Person {
    private Enum location;
    private Enum rating;
    Person person;

    public Tuner(Enum location, Enum rating, Person person) {
        this.location = location;
        this.rating = rating;
        this.person = person;
    }

    public Enum getLocation() {
        return location;
    }
    public Enum getRating() {
        return rating;
    }
    public Person getPerson() {
        return person;
    }

    public String toString() {
        return String.format("\n" + person.getName() + ", " + person.getPhone() + ", " +
                             getLocation() + ", " + getRating());
    }
}
