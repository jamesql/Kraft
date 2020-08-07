package com.jamesql.Engine;

public interface ITick {

	void nextTick(TickState prevTick);
	void getTickHistory();
	void previousTick();
	void garbageCollect();
	void lastGoodTick();
	
}
