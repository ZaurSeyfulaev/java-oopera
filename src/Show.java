import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director, Actor actor) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors.add(actor);
    }

    public void addActor(Actor actor) {
        for (Actor a : listOfActors) {
            //Проверяем, а вдруг указанный актер уже участвует в постановке
            if (a.equals(actor)) {
                System.out.println("Такой актер уже участвует в постановке " + title);
                break;
            } else {
                listOfActors.add(actor);
                break;
            }
        }
    }

    public void printListOfActors() {
        System.out.println("В постановке " + title + " участвуют:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
            System.out.println("----------------");
        }
        System.out.println("================");
    }

    public void updateActors(String oldActorSurname, Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(oldActorSurname)) {
                listOfActors.set(listOfActors.indexOf(actor), newActor);
                System.out.println("Актер по фамилии: " + actor.getSurname() + " заменен на актера по фамилии: "
                        + newActor.getSurname());
                return;
            }
        }
        System.out.println("Указанный актер: " + oldActorSurname + " не участвует в постановке " + title);
    }
}