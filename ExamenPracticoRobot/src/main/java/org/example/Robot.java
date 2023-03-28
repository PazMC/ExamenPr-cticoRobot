package org.example;

public abstract class Robot {

    String head;
    String laser;

    public void changeBody() {

    }

    public String moveFast(){
        int distance=2;
        String move;
        if(distance!=0){
            move="yes";
        }else move="not moving";

        return move;
    }

    






}
