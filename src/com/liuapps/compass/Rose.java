package com.liuapps.compass;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;

public class Rose extends ImageView {
	int direction = 0;
	
	public Rose(Context context) {
		super(context);
		this.setImageResource(R.drawable.compassrose);
	}
	
	 // Called when component is to be drawn
	  @Override
	  public void onDraw(Canvas canvas) { // 
	    int height = this.getHeight();  // 
	    int width = this.getWidth();

	    canvas.rotate(direction, width / 2, height / 2); // 
	    super.onDraw(canvas); // 
	  }

	  // Called by Compass to update the orientation
	  public void setDirection(int direction) { // 
	    this.direction = direction;
	    this.invalidate(); // request to be redrawn 
	  }
}
