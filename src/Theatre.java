public class Theatre {

    public static void main(String[] args) {
        //Актеры
        Actor mikhailBoyarsky = new Actor("Михаил", "Боярский", 185, Gender.MALE );
        Actor konstantinKhabensky = new Actor("Константин", "Хабенский", 172, Gender.MALE );
        Actor annaDyukova = new Actor("Анна", "Дюкова", 168, Gender.FEMALE );
        //Режиссеры
        Director konstantinStanislavsky = new Director("Константин", "Станиславский", 12, Gender.MALE);
        Director konstantinBogomolov = new Director("Константин", "Богомолов", 55, Gender.MALE);
        //Прочие сотрудники
        Person musicAuthor = new Person("Джузеппе", "Верди", Gender.MALE);
        Person choreographer= new Person("Баян", "Контемпов", Gender.FEMALE);


        System.out.println("Поехали!");

        Show show = new Show("Мастер и Маргарита", 120, konstantinBogomolov, mikhailBoyarsky);
        show.addActor(konstantinKhabensky);
        show.addActor(annaDyukova);


        Ballet ballet = new Ballet("Щелкунчик", 110, konstantinStanislavsky, annaDyukova, musicAuthor,
                "В канун Рождества в доме доктора Штальбаума собираются гости. Среди приглашенных — их друг, " +
                        "таинственный изобретатель и мастер игрушек Дроссельмейер.", choreographer);
        ballet.addActor(mikhailBoyarsky);

        Opera opera = new Opera("Тривиата", 110, konstantinStanislavsky, annaDyukova, musicAuthor,
                "В доме парижской куртизанки Виолетты Валери царит шумное веселье. \n " +
                        "Среди гостей — Альфред Жермон, который давно и пылко влюблен в нее", 12);
        opera.addActor(mikhailBoyarsky);

        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        show.updateActors("Боярский", konstantinKhabensky);
        ballet.printListOfActors();
        opera.updateActors("Безруков", annaDyukova);
    }
}
