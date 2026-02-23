public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, Actor actor, Person musicAuthor, String
            librettoText, int choirSize) {
        super(title, duration, director, actor, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
