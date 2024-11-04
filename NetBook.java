import java.awt.print.Book;

public abstract class NetBook extends Title {
    // Attributes
    private int availability;
    private int reach;
    private int use;

    public NetBook(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }   // end Constructor

    public double getUsePoints(){
        return 0;
    }   // end getUsePoints
    
}   // end NetBook
