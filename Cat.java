package org.example.lesson2.HomeWork;

public class Cat implements RunJump {
    String name;
    int jumpDistance;
    int runDistance;

    public Cat(String name, int jumpDistance, int runDistance) {
        this.jumpDistance = jumpDistance;
        this.runDistance = runDistance;
        this.name = name;
    }


    @Override
    public void startJump() {
        System.out.println("Cat смог перепрыгнуть");
    }

    @Override
    public void stopJump() {
        System.out.println("Cat не смог перепрыгнуть");
    }

    @Override
    public int getjumpDistance() {
        return this.jumpDistance;
    }

    @Override
    public void startRun() {
        System.out.println("Cat смог пробежать");
    }

    @Override
    public void stopRun() {
        System.out.println("Cat не смог пробежать");
    }

    @Override
    public int getrunDistance() {
        return this.runDistance;
    }

}