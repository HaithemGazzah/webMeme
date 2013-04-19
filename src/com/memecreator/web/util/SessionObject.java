package com.memecreator.web.util;

public enum SessionObject {
	
	WORKINPICTURE("WORKINPICTURE"),
	DROPPICTURE("DRAGPICTURE"),
	
	
	
	UKNOWN(null);
	
	
	
	public final String name;
	
	private SessionObject(String name) {
		this.name=name;
	}
}
