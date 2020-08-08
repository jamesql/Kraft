package com.jamesql.thread;

import org.lwjgl.BufferUtils;
import  org.lwjgl.glfw.GLFW;

import com.jamesql.Engine.Frame;

import static org.lwjgl.glfw.GLFW.*;

public class Game {
	
	public Game() { this.run(); }
	
	public void run()
	{
		Frame f = new Frame("Test Frame", 800, 800);
		
	}
	
	public void init(String window) throws Exception
	{
		
	}
	
}
