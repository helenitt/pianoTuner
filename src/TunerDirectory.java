/**
 * Created by Helen on 15/11/2016.
 */

import java.util.List;
import java.util.LinkedList;

public class TunerDirectory {
    private List<Tuner> tuners;

    public TunerDirectory(List<Tuner> tuners) {
        this.tuners = tuners;
    }

    public void addTuner(Enum location, Enum rating, Person person) {
        Tuner tuner = new Tuner(location, rating, person);
        tuners.add(tuner);
    }

    public Tuner getTuner(String name) {
        for (Tuner tuner : tuners) {
            if(tuner.getName().equals(name)) {
                return tuner;
            }
        }
        return null;
    }

    public List<Tuner> search(Tuner searchTuner) {
        List<Tuner> tunersFound = new LinkedList<>();
        for (Tuner tuner : tuners) {
            // Name not included, that's what we're looking for
            // Phone is not included, it's unique
            if(searchTuner.getLocation().equals(tuner.getLocation()))
                tunersFound.add(tuner);
            if(searchTuner.getRating().equals(tuner.getRating()))
                tunersFound.add(tuner);
        }
        return tunersFound;
    }
}
