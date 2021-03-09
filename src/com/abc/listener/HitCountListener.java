package com.abc.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HitCountListener implements ServletRequestListener {

	int count = 0;

	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("Request Object gets destroyed..");
	}

	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("Request Object gets Created..");

		count += 1;

		ServletContext servletContext = sre.getServletContext();
		servletContext.setAttribute("count", count);
		

	}

}
