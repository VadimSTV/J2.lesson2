package J2.lesson1.animals.obstacles;

import J2.lesson1.animals.Participant.Participant;


public class Cross extends Obstacle {

    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant animal) {
        animal.run(length);
    }
}
