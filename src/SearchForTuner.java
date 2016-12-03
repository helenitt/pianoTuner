/**
 * Created by Helen on 15/11/2016.
 */
public class SearchForTuner {
    public static void main(String[] args) {
        TunerDirectory directory = new TunerDirectory();
        createDirectory(directory);

        Tuner userSearch = new Tuner("", "Killarney", "", "excellent");
        Tuner tunerFound = directory.search(userSearch);

        if(tunerFound != null) {
            System.out.println("Search Results: " + tunerFound.getName() +
                               " " + tunerFound.getLocation() + " " + tunerFound.getPhone() +
                               " " + tunerFound.getRating());
        }
        else {
            System.out.println("Sorry, there were no results");
        }
    }

    private static void createDirectory(TunerDirectory directory) {
        directory.addTuner("Tom Jones", "Tralee", "0871234567", "Moderate");
        directory.addTuner("Ann Jones", "Killarney", "0872345678", "Very Good");
        directory.addTuner("Katie Griffiths", "Tralee", "0861111111", "Good");
        directory.addTuner("Helen OBrien", "Dingle", "0872222222", "Excellent");
        directory.addTuner("Helen Flynn", "Dingle", "0873333333", "Moderate");
        directory.addTuner("Barry White", "Tralee", "0874444444", "Bad");
        directory.addTuner("Paddy Lyons", "Keel", "0875555555", "Moderate");
        directory.addTuner("Joe Brosnan", "Killarney", "0876666666", "Excellent");
        directory.addTuner("Mike Quirke", "Tralee", "0867777777", "Good");
        directory.addTuner("Ann OBrien", "Dingle", "0878888888", "Excellent");
        directory.addTuner("Sue Doon", "Dingle", "0879999999", "Very Good");
        directory.addTuner("Tim Stone", "Tralee", "0871919191", "Bad");
    }
}
