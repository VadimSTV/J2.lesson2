package J2.lesson1.animals.obstacles;


import J2.lesson1.animals.Team;

public class Course {
    private Obstacle obstacles[];

    public Course(Obstacle ... obstacles) {
        this.obstacles = obstacles;
    }
    public void doIt(Team team){
            for (Obstacle obstacle : obstacles) {
                team.doIt(obstacle);

            }
    }
}
