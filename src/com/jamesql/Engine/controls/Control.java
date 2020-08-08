package com.jamesql.Engine.controls;

import java.util.ArrayList;

public abstract class Control { 
	
	private Keycode kc;
	
	Control(int c) { kc=new Keycode(c); }
	
	public abstract void run(ArrayList<Object> args); 
	
	public Keycode getCode() { return kc; }
	
}
