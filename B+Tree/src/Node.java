import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Node implements Comparator<Node>{

	private Node father;
	private ArrayList<Integer> elements;
	private ArrayList<Node> children;

	public Node(Node myFather){

		father = myFather;
		initializeLists();
	}


	public boolean isRoot()
	{
		if(father==null)
			return true;
		else
			return false;
	}
	public boolean isLeaf()
	{
		for(Node n: children)
			if(n!=null)
				return false;
		return true;

	}

	public Node getFather() {
		return father;
	}

	public void setFather(Node father) {
		this.father = father;
	}

	public ArrayList<Node> getChildren() {
		return children;
	}
	/*
	 * Adds a node inside a node's children list.
	 * This method does not check
	 * if the child must be added or not.
	 * In addition, this method doesn't reposition
	 * the indices of children.
	 * 
	 * This check must take place beforehand.
	 */
	public void addElement(int aNum)
	{
		elements.add(aNum);
		Collections.sort(elements);
	}

	public boolean isFullOfChildren(int max)
	{
		if((Main.maxElements+1)==children.size())
			return true;
		else
			return false;
	}
	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}

	public String toString()
	{
		String el = "";


		for(Integer i: this.elements)
			el += i+" | ";
		el = el.substring(0, el.length()-3);


		return "My father = "+father+", my elements = "+el;
	}

	//Correct
	private void initializeLists()
	{
		elements = new ArrayList<Integer>();
		children = new ArrayList<Node>();

		for(int i=0;i<Main.maxElements;i++)
		{
			elements.add(null);
			children.add(null);
		}
		children.add(null);
	}
	

	public ArrayList<Integer> getElements() {
		return elements;
	}


	public void setElements(ArrayList<Integer> elements) {
		this.elements = elements;
	}


	@Override
	public int compare(Node o1, Node o2) {
		// TODO Maybe not needed.
		return 0;
	}


}
