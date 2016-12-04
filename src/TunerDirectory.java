/**
 * Created by Helen on 15/11/2016.
 */

import java.util.List;
import java.util.LinkedList;

public class TunerDirectory {
    private final List<Tuner> tunerList;

    public TunerDirectory(List<Tuner> tuners) {
        this.tunerList = tuners;
    }

    public void addTuner(String name, Location location, String phone, Rating rating) {
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
            if(tuner.mathches(searchTuner))
                tunersFound.add(tuner);
        }
        return tunersFound;
    }
}
