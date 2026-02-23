import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, int height, Gender gender) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{"
                + "name='" + getName() + "', \n"
                + "surname='" + getSurname() + "', \n"
                + "gender='" + getGender() + "', \n"
                + "height=(" + height + ")" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return getName() == actor.getName() &&
                getSurname() == actor.getSurname() &&
                getGender() == actor.getGender() &&
                height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getGender(), height);
    }
}
