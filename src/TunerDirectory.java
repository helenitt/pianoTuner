/**
 * Created by Helen on 15/11/2016.
 */

import java.util.List;
import java.util.LinkedList;

public class TunerDirectory {
    private List<Tuner> tunerList;  //POOR NAMES CODE SMELL

    public TunerDirectory(List<Tuner> tuners) {
        this.tunerList = tuners;
    }

    public void addTuner(String name, Enum location, String phone, Enum rating) {
        Tuner tuner = new Tuner(name, location, phone, rating);
        tunerList.add(tuner);
    }

    public Tuner getTuner(String name) {
        for (Tuner tuner : tunerList) {
            if(tuner.getName().equals(name)) {
                return tuner;
            }
        }
        return null;
    }

    public List<Tuner> search(Tuner searchTuner) {
        List<Tuner> tunersFound = new LinkedList<>();
        for (Tuner tuner : tunerList) {
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
