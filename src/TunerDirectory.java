/**
 * Created by Helen on 15/11/2016.
 */

import java.util.LinkedList;
import java.util.Iterator;

public class TunerDirectory {
    private LinkedList tuners;

    public TunerDirectory() {
        tuners = new LinkedList();
    }

    public void addTuner(String name, Enum location, String phone, Enum rating) {
        Tuner tuner = new Tuner(name, location, phone, rating);
        tuners.add(tuner);
    }

    public Tuner getTuner(String name) {
        for(Iterator i = tuners.iterator();i.hasNext(); ) {
            Tuner tuner = (Tuner) i.next();
        }
        return null;
    }

    public Tuner search(Tuner searchTuner) {
        for(Iterator i = tuners.iterator(); i.hasNext(); ) {
            Tuner tuner = (Tuner)i.next();
            // Name not included, that's what we're looking for
            // Phone is not included, it's unique
            Enum location = searchTuner.getLocation();
            // if has a value & does not match the tuners location, continue
            if((location != null) && !location.equals(tuner.getLocation()))
                continue;
            Enum rating = searchTuner.getRating();
            // if has a value & does not match the tuners location, continue
            if((rating != null) && !rating.equals(tuner.getRating()))
                continue;
            return tuner;
        }
        return null;
    }
}