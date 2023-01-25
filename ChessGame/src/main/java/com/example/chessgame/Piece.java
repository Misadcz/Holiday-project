package com.example.chessgame;

import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
public interface Piece
{
    void draw(GraphicsContext gc, Scene scene);
    void simulate(double deltaT, Scene scene);
}
