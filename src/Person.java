/**
 * Created by Helen on 04/12/2016.
 */
public class Person {
    private String name;
    private String phone;

    public Person() {
        name = "";
        phone = "";
    }

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
}
