package com.jamesql.Engine.controls;

import java.util.ArrayList;

public class ControlListener {

	private static ArrayList<Control> controls = new ArrayList<Control>();
	
	public void addControl(Control c) { controls.add(c); }
	
}