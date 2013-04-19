package com.memecreator.web.util;

import javax.servlet.http.HttpSession;

public interface SessionHandler {
	 <T> T getFromSession(HttpSession session);
	 <T> void setOnsession(HttpSession session, T obj);
	
}
