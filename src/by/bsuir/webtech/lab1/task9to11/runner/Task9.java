package by.bsuir.webtech.lab1.task9to11.runner;

import by.bsuir.webtech.lab1.task9to11.util.Ball;
import by.bsuir.webtech.lab1.task9to11.util.Basket;
import by.bsuir.webtech.lab1.task9to11.util.Color;

import java.util.Map;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(Color.BLACK, 0.3));
        basket.addBall(new Ball(Color.BLUE, 0.33));
        basket.addBall(new Ball(Color.RED, 0.25));
        basket.addBall(new Ball(Color.GREEN, 0.35));
        basket.addBall(new Ball(Color.BLUE, 0.24));
        double ballsMass = basket.getBalls().stream().mapToDouble(Ball::getMass).sum();
        System.out.println("Balls mass: " + ballsMass);
        Map<Color, Long> ballsColors = basket.getBalls().stream().collect(
                Collectors.groupingBy(Ball::getColor, Collectors.counting()));
        System.out.println("Blue balls: " + ballsColors.get(Color.BLUE));
    }
}
