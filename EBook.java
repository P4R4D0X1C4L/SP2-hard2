public class EBook extends NetBook {
    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType, availability, reach, use);
    }   // end Constructor

    public double getPages() {
        return super.getPages();
    }   // end getPages
}   // end EBook
