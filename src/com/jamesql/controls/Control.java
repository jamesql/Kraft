package com.jamesql.controls;

public abstract class Control<A,B,C,D> {
	public abstract void run(A param1);
	public abstract void run(A param1, B param2);
	public abstract void run(A param1, B param2, C param3);
	public abstract void run(A param1, B param2, C param3, D param4);
}
