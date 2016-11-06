package com.ubhacking.game.state;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.MotionEvent;
import com.ubhacking.framework.util.Painter;
import com.ubhacking.simpleandroidgdf.Assets;

public class MenuState extends State {
	@Override
	public void init() {
	}

	@Override
	public void update(float delta) {
	}

	@Override
	public void render(Painter g) {
        g.setFont(Typeface.SERIF, 50);
		g.setColor(Color.YELLOW);
		g.drawString("LONG PONG",300,200);
	}

	@Override
	public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
		setCurrentState(new PlayState());
        return true;
	}
}