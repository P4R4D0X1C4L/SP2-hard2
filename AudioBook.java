public class AudioBook extends PhysicalBook implements IAudioBook {
    protected final int duration;
    protected final int copies;

    public AudioBook(String title, String literatureType, int copies, int duration) {
        super(title, literatureType, copies);
        this.duration = duration;
        this.copies = copies;
    }   // end Constructor

    public int getDuration() {
        return this.duration;
    }   // end getDuration

}   // end AudioBook
