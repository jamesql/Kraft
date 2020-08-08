package com.jamesql.Engine.controls;

import java.util.ArrayList;

public class TestControl extends Control {
	
	// Enter keycode here
	TestControl() { super(0); };
	
	@Override
	public void run(ArrayList<Object> args) {
		System.out.println(args);
	}
	
}
