public abstract class PhysicalBook extends Title {
    private int copies;

    public PhysicalBook(String title, String literatureType, int copies) {
        super(title, literatureType);
        this.copies = copies;
    }   // end Constructor

    protected int getCopies() {
        return this.copies;
    }   // end getCopies

}   // end PhysicalBook
