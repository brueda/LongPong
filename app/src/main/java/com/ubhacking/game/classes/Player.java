package com.ubhacking.game.classes;

import com.ubhacking.framework.util.Painter;

/**
 * Created by Benjamin on 11/5/2016.
 */
public class Player {
    private static Paddle _paddle;
    public Player() {
        _paddle = new Paddle();
    }

    public static void movePaddle(int touchPos) {
        _paddle.move(touchPos);
    }

    public static void drawPaddle(Painter g){
        _paddle.draw(g);
    }
}
