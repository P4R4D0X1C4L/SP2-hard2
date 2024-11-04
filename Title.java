public abstract class Title {
    // Attributes
    private String title;
    protected String literatureType;
    protected double rate = 0.067574;
    protected double royalty;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType.toUpperCase();
        this.royalty = getRate()*rate;

    }   // end Constructor

    protected double getRate() {
        double total = 0.0;         // This variable is used to hold the return-value

        switch (literatureType) {
            case "BI":
            case "TE":
                total = 3.0;
                break;

            case "LYRIK":
                total = 6.0;
                break;

            case "SKØN":
                total = 1.7;
                break;

            case "FAG":
                total = 1.0;
                break;
        }   // end Switch-literatureType

        /*
         In cases where this func is called from an instance of the subclass AudioBook,
         The value of total is divided by 2.
         */
        if (this instanceof AudioBook){
            total /=2;
            return total;
        }   // end if-instanceof

        return total;
    }   // end getRate

    protected double getPages(){
        double total = 0.0;
        if (this instanceof AudioBook){
            total = ((AudioBook) this).getDuration();

        } else if (this instanceof PrintedBook) {
            total =  ((PrintedBook) this).getPages();
        }   // end if-instanceof AudioBook/PrintedBook

        return total;
    }   // end getPages

    public double getRoyalty(){
        /*
        Func calculates the royalties based on the instance of the object
         */
        double total = 0.0;
        if (this instanceof AudioBook){
            total = getRate() * getPages() * ((AudioBook) this).getCopies();

        } else if (this instanceof PrintedBook) {
            total = getRate() * getPages() * ((PrintedBook) this).getCopies();
        }   // end if-instanceof AudioBook/PrintedBook

        return total;   // returns royalties based on which subclass the object
    }   // end getRoyalty

    protected double getPoints(){
       return  getPages()*getRoyalty();
    }   // end getPoints

    public String toString(){
        return title + " : " + literatureType + " : " + royalty;
    }   // end toString
}   // end Title