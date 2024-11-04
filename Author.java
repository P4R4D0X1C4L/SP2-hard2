import java.util.ArrayList;

public class Author {
    private static String name;
    public ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }   // end constructor

    public void addTitle(Title title){
        titles.add(title);
    }   // end addTitle

    public ArrayList<Title> getTitles(){
        return titles;
    }   // end getTitles

    public static String getName(){
        return name;
    }   // end getName

    public Title getTitle(int index){
        return titles.get(index);
    }   // end getTitle

    public double getRoyalty(){
        double total = 0;
        for(Title title : titles){
            total += title.getRoyalty();      // adds the royal of each title to the
        }   // end for-each
        return total;
    }   // end getRoyalty

}   // end Author
