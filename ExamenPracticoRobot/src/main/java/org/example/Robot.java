package org.example;

public class Robot {
    public Robot() {}

        String head;
        String laser;

        public String changeBody () {
        String typeBody="n";
        return typeBody;
        }

        public String moveFast () {
            int distance = 2;
            String move;
            if (distance != 0) {
                move = "yes";
            } else move = "not moving";

            return move;
        }


        public String getHead () {
            return head;
        }

        public void setHead (String head){
            this.head = head;
        }

        public String getLaser () {
            return laser;
        }

        public void setLaser (String laser){
            this.laser = laser;
        }

}
