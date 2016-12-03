/**
 * Created by Helen on 15/11/2016.
 */
public class SearchForTuner {
    public static void main(String[] args) {
        TunerDirectory directory = new TunerDirectory();
        createDirectory(directory);

        Tuner userSearch = new Tuner("", Location.KILLARNEY, "", Rating.EXCELLENT);
        Tuner tunersFound = directory.search(userSearch);

        if(tunersFound != null) {
            System.out.println("Search Results: " + tunersFound.getName() +
                    " " + tunersFound.getLocation() + " " + tunersFound.getPhone() +
                    " " + tunersFound.getRating());
        }
        else {
            System.out.println("Sorry, there were no results");
        }
    }

    private static void createDirectory(TunerDirectory directory) {
        directory.addTuner("Tom Jones", Location.TRALEE, "0871234567", Rating.EXCELLENT);
        directory.addTuner("Ann Jones", Location.KILLARNEY, "0872345678", Rating.GOOD);
        directory.addTuner("Katie Griffiths", Location.TRALEE, "0861111111", Rating.MODERATE);
        directory.addTuner("Helen OBrien", Location.DINGLE, "0872222222", Rating.EXCELLENT);
        directory.addTuner("Helen Flynn", Location.DINGLE, "0873333333", Rating.GOOD);
        directory.addTuner("Barry White", Location.KILLARNEY, "0874444444", Rating.BAD);
        directory.addTuner("Paddy Lyons", Location.TRALEE, "0875555555", Rating.MODERATE);
        directory.addTuner("Joe Brosnan", Location.KILLARNEY, "0876666666", Rating.MODERATE);
        directory.addTuner("Mike Quirke", Location.TRALEE, "0867777777", Rating.EXCELLENT);
        directory.addTuner("Ann OBrien", Location.KILLARNEY, "0878888888", Rating.EXCELLENT);
        directory.addTuner("Sue Doon", Location.DINGLE, "0879999999", Rating.BAD);
        directory.addTuner("Tim Stone", Location.TRALEE, "0871919191", Rating.BAD);
    }
}
