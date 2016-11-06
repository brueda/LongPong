package com.ubhacking.game.classes;

import android.graphics.Color;

import com.ubhacking.framework.util.Painter;

/**
 * Created by Benjamin on 11/5/2016.
 */
public class Paddle {
    public int pos;
    public Paddle() {
        pos = 200;
    }

    public void draw(Painter g) {
        g.setColor(Color.YELLOW);
        g.fillRect(100, pos, 10, 70);
    }

    public void move(int touchPos) {
        if (touchPos < pos - 20) {
            pos -= 30;
        } else if (touchPos > pos + 20) {
            pos += 30;
        }
    }
}
