package org.example.lesson2.HomeWork;

public class Wall extends Obstacles {
    private int higth;

    public Wall(int higth) {
        this.higth = higth;
    }


    public int getHigth() {
        return higth;
    }

    @Override
    public boolean runnerjumper(RunJump runJump) {
        if (getHigth() <= runJump.getjumpDistance()) {
            runJump.startJump();
            return true;
        } else {
            runJump.stopJump();
            return false;
        }
    }
}
