package com.jamesql.Engine;

import java.util.ArrayList;

public class Tick implements ITick {

	private static int curTick = 0;
	private static ArrayList<TickState> ticks = new ArrayList<TickState>();
	
	@Override
	public void nextTick(TickState prevTick) { ticks.add(prevTick);curTick++; }

	@Override
	public void getTickHistory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void previousTick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void garbageCollect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lastGoodTick() {
		// TODO Auto-generated method stub
		
	}

	public static int getCurTick() {
		return curTick;
	}

}
