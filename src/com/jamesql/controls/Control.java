package com.jamesql.controls;

// tried doing this as a parameter pack like c++
// ex : Control<A...>, public abstract void run(...A params) 
// could not get this to work
// TODO: try and get this way to work as it would be better.

public abstract class Control<A,B,C,D> {
	public abstract void run(A param1);
	public abstract void run(A param1, B param2);
	public abstract void run(A param1, B param2, C param3);
	public abstract void run(A param1, B param2, C param3, D param4);
}
