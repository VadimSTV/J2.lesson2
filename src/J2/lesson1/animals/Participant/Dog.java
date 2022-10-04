package J2.lesson1.animals.Participant;

public class Dog extends Animal {

    public Dog(String name, int maxRunDistance,
               int maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    @Override
    public void voice() {
        System.out.println("Гав-гав ррррр");
    }

    public void swim() {
        System.out.println(getName() + " плывет");
    }
}
