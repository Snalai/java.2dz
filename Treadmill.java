package org.example.lesson2.HomeWork;

public class Treadmill extends Obstacles {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean runnerjumper(RunJump runJump) {
        if (getLength() <= runJump.getrunDistance()) {
            runJump.startRun();
            return true;
        } else {
            runJump.stopRun();
            return false;
        }
    }


}
