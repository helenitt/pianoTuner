import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Helen on 04/12/2016.
 */
public class TunerDirectoryTest {

    @Test
    public void addTunerTest() throws Exception {
        TunerDirectory directory = new TunerDirectory(new LinkedList<>());
        directory.addTuner("Joe Bloggs", Location.TRALEE, "0881234567", Rating.EXCELLENT);

        assertNotNull(directory);
    }

    @Test
    public void getTunerTest() throws Exception {


    }

    @Test
    public void search() throws Exception {
        TunerDirectory directory = new TunerDirectory(new LinkedList<>());
        directory.addTuner("Joe Bloggs", Location.TRALEE, "0881234567", Rating.EXCELLENT);
        directory.addTuner("Barry White", Location.KILLARNEY, "0874444444", Rating.BAD);
        directory.addTuner("Paddy Lyons", Location.TRALEE, "0875555555", Rating.MODERATE);

        Tuner userSearch = new Tuner("", Location.TRALEE, "", Rating.EXCELLENT);
        List<Tuner> tunersFound = directory.search(userSearch);

        assertEquals(1, tunersFound.size());
    }

}