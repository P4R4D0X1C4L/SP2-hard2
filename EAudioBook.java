public class EAudioBook extends NetBook implements IAudioBook {
    private int duration;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int duration) {
        super(title, literatureType, availability, reach, use);
        this.duration = duration;
    }   // end Constructor

    public int getDuration(){
        return this.duration;
    }   // end getDuration

    protected double getPages(){
        return (float) getDuration()/2;
    }   // end getPages
}   // end EAudioBook