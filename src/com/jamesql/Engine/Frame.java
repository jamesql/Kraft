package com.jamesql.Engine;

import org.lwjgl.glfw.*;

public class Frame implements IFrame {

	private String t;
	private int w;
	private int h;
	private GLFWErrorCallback T_error;
	private GLFWKeyCallback T_key;
	private GLFWWindowSizeCallback T_windowSize;
	
	public long handle;

	private boolean resized = false;
	
	public Frame(String title, int width, int height)
	{
		t=title;w=width;h=height;
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setClearColor(float r, float g, float b, float a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResized(boolean resized) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVSync(boolean vsync) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isKeyPressed(int code) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shouldWindowClose() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
