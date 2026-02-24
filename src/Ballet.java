public class Ballet extends MusicalShow {
    private Person choreographer;


    public Ballet(String title, int duration, Director director, Actor actor, Person musicAuthor,
                  String librettoText, Person choreographer) {
        super(title, duration, director, actor, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
