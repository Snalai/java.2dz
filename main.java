package org.example.lesson2.HomeWork;

public class main {
    public static void main(String[] args) {
        RunJump[] runjumpers = {
                new Human("oleg", 10, 1),
                new Cat("puch", 15, 30),
                new Robot("pi", 30, 30)};
        Obstacles[] obstacles = {new Wall(20), new Treadmill(25)};
        boolean bud;
        for (int i = 0; i < runjumpers.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                bud = obstacles[j].runnerjumper(runjumpers[i]);
                if (!bud) break;
            }
        }
    }
}
