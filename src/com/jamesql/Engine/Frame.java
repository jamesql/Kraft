package com.jamesql.Engine;

import org.lwjgl.glfw.*;

public class Frame {

	private String title;
	private int w;
	private int h;
	private GLFWErrorCallback T_error;
	private GLFWKeyCallback T_key;
	private GLFWWindowSizeCallback T_windowSize;
	
	public long handle;
	
}
