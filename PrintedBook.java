public class PrintedBook extends PhysicalBook {
    // Attributes
    private final int pages;
    protected final int copies;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
        this.copies = copies;
    }   // end Constructor

    protected double getPages(){
        return pages;
    }   // end getPages
}   // end PrintedBook
