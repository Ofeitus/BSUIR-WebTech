package by.bsuir.webtech.lab1.task9to11.util;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }
}
