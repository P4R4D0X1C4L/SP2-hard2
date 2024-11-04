//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author mW = new Author("Mikkel Warner");
        Author jK = new Author("Jesper Kock");

        mW.addTitle(new PrintedBook("LoL","FAG",3,6));
        mW.addTitle(new AudioBook("WoW", "TE",3,6));
        mW.addTitle(new AudioBook("CS2", "LYRIK",8,16));

        jK.addTitle(new PrintedBook("TFT","TE",5,77));
        jK.addTitle(new AudioBook("Game", "SKØN", 60, 15));

        System.out.println(mW.getRoyalty());
        System.out.println(mW.getTitle(2));
    }
}