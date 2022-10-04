package J2.lesson1.animals;


import J2.lesson1.animals.Participant.Cat;
import J2.lesson1.animals.Participant.Dog;
import J2.lesson1.animals.Participant.Leo;
import J2.lesson1.animals.obstacles.*;

public class Application {

    public static void main(String[] args) {

        Course c = new Course(new Cross(5),
                new Wall(3),
                new Water(7)); // Создаем полосу препятствий
        Team team = new Team("Олимпиец",
                new Cat("Тайсон", 10, 12, 0),
                new Dog("Бакс", 20, 5, 15),
                new Cat("Арчи", 9, 14, 0),
                new Leo("Симба", 50, 50, 50));  // Создаем команду
        team.getTeamInfo();

        c.doIt(team);               // Просим команду пройти полосу
        team.showResults();         // Показываем результаты

    }
}
