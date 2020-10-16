package com.lanqiao.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSON;

/**
 *树形结构算法。 非2叉树
 * @author chenbaoji
 *
 *--aaaa
 *	|
 * 	|--bbb
 * 	|--ccc
 * 
 * @param <T>
 */
public class Tree<TK> {

	TreeNode root = new TreeNode("root", "根", null);

	private Integer code;
	private String msg;

	/**
	 * 新增一个节点，放入树中。 
	 * @param id
	 * @param text
	 * @param parentid
	 */
	public void addNode(TK id, String text, TK parentid) {
		TreeNode<TK> node = new TreeNode<TK>();
		node.setId(id);
		node.setParentid(parentid);
		node.setName(text);
		addNode(node);
	}

	
	public void addRootNode(TK nodeid , String name )
	{
		root = new TreeNode(nodeid, "name", null);
	}
	
	
	/**
	 *  * 新增一个节点，放入树中。 
	 * @param t
	 */
	public void addNode(TreeNode<TK> t) {
		if (t.getParentid() == null) {
			// 设置为根节点。 
			root.setId(t.getId());
			root.setParentid(null);
			root.setName(t.getName());
		} else {
			TreeNode<TK> p = findNodeById(t.getParentid());
			if (p != null) {
				ArrayList<TreeNode<TK>> childrens = null;
				if (p.getChildren() == null) {
					childrens = new ArrayList<TreeNode<TK>>();
					p.setChildren(childrens);
				} else
					childrens = p.getChildren();

				t.setParentNode(p);
				childrens.add(t);
			//	System.out.println("add children  id=[" + t.getId() + "]\tparentid=[" + t.getParentid() + "]");

			} else {
				System.out.println("not found : id=[" + t.getId() + "]\tparentid=[" + t.getParentid() + "]");

				return;
			}

		}
	}

	/**
	 * 得到子节点的所有子节点ID
	 * @param id
	 * @return
	 */

	public List<TK> getChildrenIds(TK id) {
		TreeNode<TK> node = findNodeInternal(root, id);
		ArrayList<TK> al = new ArrayList<TK>();
		if (node != null) {
			getChildrenIds(node, al);

		}
		return al;

	}

	private void getChildrenIds(TreeNode<TK> node, ArrayList<TK> alret) {
		if (node != null) {
			alret.add(node.getId());
		}
		ArrayList<TreeNode<TK>> al = node.getChildren();
		if (al == null || al.size() == 0)
			return;
		for (TreeNode<TK> one : al) {
			getChildrenIds(one, alret);
		}

	}

	/**
	 * 根据节点的ID ， 查询节点对象。 
	 * @param id
	 * @return
	 */
	public TreeNode<TK> findNodeById(TK id) {
		return findNodeInternal(root, id);

	}

	/**
	 * 递归遍历树
	 * @param p 节点
	 * @param id ： 查询的id值
	 * @return
	 */
	private TreeNode<TK> findNodeInternal(TreeNode<TK> p, TK id) {
		TreeNode<TK> ret = null;
		if (p.getId().equals(id))
			return p;
		if (p.getChildren() != null) {
			ArrayList<TreeNode<TK>> tlist = p.getChildren();
			for (int i = 0; i < tlist.size(); i++) {
				TreeNode<TK> temp = tlist.get(i);
				//System.out.println ("eq:"+temp.getId().toString() +"--"+id.toString());
				if (temp.getId().equals(id)) {
					//System.out.println ("eqok:"+temp.getId().toString() +"--"+id.toString());
					ret = temp;
					break;
				} else {
					ret = findNodeInternal(temp, id);
					if (ret != null)
						break;
				}
			}
		}

		return ret;

	}

	private void PrintAll(TreeNode<TK> p) {

		System.out.println(p.getParentid() + "|" + p.getId() + "--" + p.getName());
		if (p.getChildren() != null) {
			ArrayList<TreeNode<TK>> tlist = p.getChildren();
			for (int i = 0; i < tlist.size(); i++) {
				TreeNode<TK> temp = tlist.get(i);
				PrintAll(temp);

			}
		}
	}

	public void printAll() {
		PrintAll(root);
	}

	/**
	 * 转换树为json string
	 * @return
	 */

	public String toJson() {
		String s = JSON.toJSONString(root, true);
		return s;
	}

	public String toJsonIncludeCode() {
		HashMap mp = new HashMap();
		mp.put("code", this.getCode());
		mp.put("msg", this.getMsg());
		mp.put("menu", root);
		String s = JSON.toJSONString(mp, true);
		return s;
	}

	public static void main(String[] args) throws Exception {
		/**
		 * 
		 * 
		1::华北:0
		2::东北区域:0
		3::天津工业大学:1
		4::南开大学:1
		5::沈阳大学:2
		6::张3:3
		7::卢大爷:3
		 */

		Tree<Long> tree = new Tree<Long>();
		tree.addNode(0L, "组织结构", null);
		tree.addNode(1L, "华北", 0L);
		tree.addNode(2L, "东北区域", 0L);

		tree.addNode(3L, "天津工业大学", 1L);
		tree.addNode(4L, "南开大学", 1L);

		tree.addNode(5L, "fffff", 3L);
		tree.addNode(6L, "卢大爷dddd", 3L);

		//	Tree <String> tree = new Tree <String> ();
		//	tree.addNode("0","组织结构", null);
		//	tree.addNode("1","华北", "0");
		//	tree.addNode("2","东北区域","0");
		//
		//	tree.addNode("3","天津工业大学","1");
		//	tree.addNode("4","南开大学", "1");
		//
		//	tree.addNode("5","fffff", "3");
		//	tree.addNode("6","卢大爷dddd", "3");
		//	

		//System.err.println(tree.toJson());
		String str = JSON.toJSONString(tree.getChildrenIds(1L), true);
		System.err.println(str);
		
		

		//tree.addNode(21,"21", 12);
		//tree.printAll();
		//System.err.println (tree.toJson());
		//	TreeNode t = tree.findNodeById(13);
		//	if(t !=null)
		//	{
		//		System.out.println (t.getParentid() +"|" + t.getId() +"--" + t.getName());
		//	}else
		//		System.out.println("NOT Found .");
		//	
		//	System.err.println (tree.toJson());
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public TreeNode getRoot()
	{
		return root;
	}


	public void setRoot(TreeNode root)
	{
		this.root = root;
	}
}