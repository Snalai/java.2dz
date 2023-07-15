package org.example.lesson2.HomeWork;

public class Robot implements RunJump{
    String name;
    int jumpDistance;
    int runDistance;

    public Robot(String name, int jumpDistance, int runDistance) {
        this.jumpDistance = jumpDistance;
        this.runDistance = runDistance;
        this.name = name;
    }

    @Override
    public void startJump() {
        System.out.println("Robot смог перепрыгнуть");
    }

    @Override
    public void stopJump() {
        System.out.println("Robot не смог перепрыгнуть");
    }

    @Override
    public int getjumpDistance() {
        return this.jumpDistance;
    }

    @Override
    public void startRun() {
        System.out.println("Robot смог пробежать");
    }

    @Override
    public void stopRun() {
        System.out.println("Robot не смог пробежать");
    }

    @Override
    public int getrunDistance() {
        return this.jumpDistance;
    }

}
