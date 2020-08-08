package com.jamesql.Engine.controls;

public class Keycode {

	private char tChar;
	private int tCode;
	
	Keycode(char c)
	{
		tChar = c;
		
	}
	
	Keycode(int k)
	{
		tCode = k;
	}
	
	boolean isKey(int k)
	{
		return false;
	}
	
	boolean isChar(char c)
	{
		return false;
	}
	
}
