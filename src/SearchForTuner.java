/**
 * Created by Helen on 15/11/2016.
 */

import java.util.List;
import java.util.LinkedList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class SearchForTuner {
    public static void main(String[] args) {
        TunerDirectory directory = new TunerDirectory(new LinkedList<>());
        createDirectory(directory);

        Tuner userSearch = new Tuner(Location.KILLARNEY, Rating.EXCELLENT, new Person("", ""));
        List<Tuner> tunersFound = directory.search(userSearch);

        System.out.println("Search Results: ");
        if(!tunersFound.isEmpty()) {
            Collection<Tuner> uniqueResults = new LinkedHashSet<>(tunersFound);

                if (uniqueResults != null) {
                    System.out.println(uniqueResults.toString());
                }

        }
        else {
            System.out.println("Sorry, there were no results");
        }
    }

    private static void createDirectory(TunerDirectory directory) {
        directory.addTuner(Location.TRALEE, Rating.EXCELLENT, new Person("Tom Jones", "0871234567"));
        directory.addTuner(Location.KILLARNEY, Rating.GOOD, new Person("Ann Jones", "0872345678"));
        directory.addTuner(Location.TRALEE, Rating.MODERATE, new Person("Katie Griffiths", "0861111111"));
        directory.addTuner(Location.DINGLE, Rating.EXCELLENT, new Person("Helen OBrien", "0872222222"));
        directory.addTuner(Location.DINGLE, Rating.GOOD, new Person("Helen Flynn", "0873333333"));
        directory.addTuner(Location.KILLARNEY, Rating.BAD, new Person("Barry White", "0874444444"));
        directory.addTuner(Location.TRALEE, Rating.MODERATE, new Person("Paddy Lyons", "0875555555"));
        directory.addTuner(Location.KILLARNEY, Rating.MODERATE, new Person("Joe Brosnan", "0876666666"));
        directory.addTuner(Location.TRALEE, Rating.EXCELLENT, new Person("Mike Quirke", "0867777777"));
        directory.addTuner(Location.KILLARNEY, Rating.EXCELLENT, new Person("Ann OBrien", "0878888888"));
        directory.addTuner(Location.DINGLE, Rating.BAD, new Person("Sue Doon", "0879999999"));
        directory.addTuner(Location.TRALEE, Rating.BAD, new Person("Tim Stone", "0871919191"));
    }
}
