package com.jamesql.Engine;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.system.MemoryUtil.NULL;
import static org.lwjgl.opengl.GL11.GL_FALSE;
import static org.lwjgl.opengl.GL11.GL_TRUE;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWWindowSizeCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

public class Frame implements IFrame {

	private String t;
	private int w;
	private int h;
	private GLFWErrorCallback T_error;
	private GLFWKeyCallback T_key;
	private GLFWWindowSizeCallback T_windowSize;
	
	public long handle;

	private boolean resized = false;
	
	// Create window dimensions.
	public Frame(String title, int width, int height) { t=title;w=width;h=height;init(); }
	
	@Override
	public void init() {
		glfwSetErrorCallback(T_error = GLFWErrorCallback.createPrint(System.err));
		if(!glfwInit()) throw new IllegalStateException("GLFW FAILED.");
		
		handle = glfwCreateWindow(w,h,t,0,0);
		
		GLFWVidMode vm = glfwGetVideoMode(glfwGetPrimaryMonitor());
		
		// center & make context
		glfwSetWindowPos(handle, (vm.width() - w) / 2, (vm.height() - h) / 2);
		glfwMakeContextCurrent(handle);
		
		glfwSwapInterval(1);
		glfwShowWindow(handle);
		GL.createCapabilities();
		
		glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glCullFace(GL11.GL_BACK);
		
		while(!shouldWindowClose())
		{
			this.update();
		}
	}

	@Override
	public void setClearColor(float r, float g, float b, float a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResized(boolean resized) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVSync(boolean vsync) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		glfwSwapBuffers(handle);
		glfwPollEvents();
		
	}

	@Override
	public boolean isKeyPressed(int code) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shouldWindowClose() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
