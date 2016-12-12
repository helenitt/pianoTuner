import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Helen on 04/12/2016.
 */
public class TunerTest {
    @Test
    public void getName() throws Exception {
        Tuner tuner = new Tuner("Joe Bloggs", Location.TRALEE, "0881234567", Rating.EXCELLENT);

        assertEquals("Joe Bloggs", tuner.getName());
    }

    @Test
    public void getLocation() throws Exception {
        Tuner tuner = new Tuner("Joe Bloggs", Location.TRALEE, "0881234567", Rating.EXCELLENT);

        assertEquals(Location.TRALEE, tuner.getLocation());
    }

    @Test
    public void getPhone() throws Exception {

    }

    @Test
    public void getRating() throws Exception {

    }

    @Test
    public void mathches() throws Exception {

    }

}