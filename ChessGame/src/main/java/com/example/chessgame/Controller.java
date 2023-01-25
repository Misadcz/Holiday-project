package com.example.chessgame;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;

public class Controller
{
    @FXML
    Canvas canvas = new Canvas(800,700);
    AnimationTimer animationTimer;
    Board board;
    public Controller()
    {
    }

    public void startGame(Scene scene, FXMLLoader loader) {
        this.board = new Board(canvas.getWidth(), canvas.getHeight());

        animationTimer = new AnimationTimer() {
            private Long previous;

            @Override
            public void handle(long now) {

                if (previous == null) {
                    previous = now;
                } else {
                    // scene.setOnKeyPressed( e -> keyPressed(e) );

                    drawScene((now - previous)/1e9,scene);
                    previous = now;
                }
            }
        };

        animationTimer.start();
    }



    private void drawScene(double deltaT,Scene scene)
    {

        board.draw(canvas,scene);
        board.simulate(deltaT,scene);
    }



}
