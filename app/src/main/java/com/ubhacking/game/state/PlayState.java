package com.ubhacking.game.state;

import android.graphics.Color;
import android.view.MotionEvent;

import com.ubhacking.framework.util.Painter;
import com.ubhacking.game.classes.Player;

/**
 * Created by Benjamin on 11/5/2016.
 */
public class PlayState extends State {
    public void init() {

    }

    public void update(float delta) {

    }

    public void render(Painter g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,800,450);
        g.setColor(Color.YELLOW);
        Player.drawPaddle(g);
    }

    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        Player.movePaddle(scaledY);
        return true;
    }
}
