package org.example.lesson2.HomeWork;

public class Human implements RunJump {
    String name;
    int jumpDistance;
    int runDistance;


    public Human(String name, int jumpDistance, int runDistance) {
        this.jumpDistance = jumpDistance;
        this.runDistance = runDistance;
        this.name = name;
    }


    @Override
    public void startJump() {
        System.out.println("Human смог перепрыгнуть");
    }

    @Override
    public void stopJump() {
        System.out.println("Human не смог перепрыгнуть");
    }

    @Override
    public int getjumpDistance() {
        return this.jumpDistance;
    }

    @Override
    public void startRun() {
        System.out.println("Human смог пробежать");
    }

    @Override
    public void stopRun() {
        System.out.println("Human не смог пробежать");
    }

    @Override
    public int getrunDistance() {
        return this.jumpDistance;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
