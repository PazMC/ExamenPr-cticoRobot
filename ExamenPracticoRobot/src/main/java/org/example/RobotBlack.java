package org.example;

public class RobotBlack extends Robot{

    public RobotBlack() {
        super();
    }

    @Override
    public String changeBody() {
        super.changeBody();
        return null;
    }

    @Override
    public String moveFast() {
        return super.moveFast();
    }

    @Override
    public String getHead() {
        return super.getHead();
    }

    @Override
    public void setHead(String head) {
        super.setHead(head);
    }

    @Override
    public String getLaser() {
        return super.getLaser();
    }

    @Override
    public void setLaser(String laser) {
        super.setLaser(laser);
    }
}
