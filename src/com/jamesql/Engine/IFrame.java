package com.jamesql.Engine;

public interface IFrame {
	
	void init();
	void setClearColor(float r, float g, float b, float a);
	void setResized(boolean resized);
	void setVSync(boolean vsync);
	void update();
	boolean isKeyPressed(int code);
	boolean shouldWindowClose();
	
}
