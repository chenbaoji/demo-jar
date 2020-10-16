package com.lanqiao.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.alibaba.fastjson.annotation.JSONField;

public class TreeNode<T>  {

	
	protected T id;
	private boolean open = true;
	boolean checked =false;
	Object nodedata = null;
	
	Integer order = 0; // 排序
	
	@JSONField(serialize=false)
	protected TreeNode<T> parentNode;
	
	@JSONField(serialize = false)
	private T  parentid; // 父节点的ID 。 
	
	protected String name;

	private   ArrayList<TreeNode<T>> children;
	
	public TreeNode(){
		
	}
	public ArrayList<TreeNode<T>> getChildren() {
		if(children != null)
		{
			 Collections.sort(children, new Comparator() {

				@Override
				public int compare(Object o1, Object o2)
				{
					TreeNode t1 = (TreeNode)o1;
					TreeNode t2 = (TreeNode)o2;
					java.lang.Comparable id1 = (Comparable)t1.getOrder();
					java.lang.Comparable id2 = (Comparable)t2.getOrder();
					
					// TODO Auto-generated method stub
					return id1.compareTo(id2);
				}
				 
			 });
			 return children;
		}
		else
			return children;
		
	}

	public void setChildren(ArrayList<TreeNode<T>> childrens) {
		this.children = childrens;
	}

	public TreeNode(T id, String text, T parentid) {
		this.id = id;
		this.name = text;
		this.parentid = parentid;
	}
	public TreeNode(T id, String text, T parentid, int orderindex) {
		this.id = id;
		this.name = text;
		this.parentid = parentid;
		this.order = orderindex;
	}
	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	

	public TreeNode<T> getParentNode() {
		return parentNode;
	}
	public void setParentNode(TreeNode<T> parentNode) {
		this.parentNode = parentNode;
	}
	public T getParentid() {
		return parentid;
	}
	public void setParentid(T parentid) {
		this.parentid = parentid;
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
	public boolean isChecked() {
		return checked;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public Object getNodedata()
	{
		return nodedata;
	}
	public void setNodedata(Object nodedata)
	{
		this.nodedata = nodedata;
	}
	public Integer getOrder()
	{
		return order;
	}
	public void setOrder(int order)
	{
		this.order = order;
	}
	
	


}
