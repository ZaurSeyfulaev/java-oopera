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

    // Добавлена проверка на того, что новый актер еще не участвует в постановке
    public void updateActors(String oldActorSurname, Actor newActor) {
        //Если фамилия уникальна для списка акторов
        if (hasNamesakes(oldActorSurname)) {
          //  Пперебираем список
            for (Actor actor : listOfActors) {
                //Если совпадение найдено то
                if (actor.getSurname().equals(oldActorSurname)) {
                    //Проверяем не участвует ли этот актер в постановке
                    if (!actor.equals(newActor)) {
                        listOfActors.set(listOfActors.indexOf(actor), newActor);
                        System.out.println("Актер по фамилии: " + actor.getSurname() + " заменен на актера по фамилии: "
                                + newActor.getSurname());
                        return;
                    }
                }
            }
            System.out.println("Актер с фамилией "+ newActor.getSurname() + "уже участвует в постановке "
                    + title);
        }
    }

    /**
     * Не нашел ничего умней как искать количество совпадений в отдельном методе
     *
     * @param surname Фамилия актера
     * @return true только если актер найден по фамилии и он такой один
     */
    private boolean hasNamesakes(String surname) {
        int findSurnameCount = 0;
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                findSurnameCount++;
            }
        }
        if (findSurnameCount == 1) {
            return true;
        } else if (findSurnameCount > 1) {
            System.out.println("Не могу заменить актера, так как найдено более одного актера с фамилией " + surname);
            return false;
        } else {
            System.out.println("Указанный актер: " + surname + " не участвует в постановке " + title);
            return false;
        }
    }
}
