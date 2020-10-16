package com.lanqiao.util;

import java.util.ArrayList;
import java.util.List;

public class Tag{
	int id;
	String name;
	boolean open;
	boolean checked;
	boolean spread = true;
	List<Tag> children = new ArrayList<>();
	public Tag(int id, String name, boolean open, boolean checked) {
		super();
		this.id = id;
		this.name = name;
		this.open = open;
		this.checked = checked;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public boolean isSpread() {
		return spread;
	}
	public void setSpread(boolean spread) {
		this.spread = spread;
	}
	public List<Tag> getChildren() {
		return children;
	}
	public void setChildren(List<Tag> children) {
		this.children = children;
	}
	
}
