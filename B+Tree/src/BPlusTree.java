
public class BPlusTree {

	private Node root;
	private final int childrenNumber;
	
	public BPlusTree(int numberOfChildrenAllowed)
	{
		childrenNumber = numberOfChildrenAllowed;
		root = new Node(null);

		
	}

	
	
	public void addNum(int num)
	{
		Node currentNode = root;

		while(!currentNode.isLeaf())
		{
			boolean flag = false;
			for(Node n:currentNode.getChildren())
				if(n.getElements()>num)
				{
					currentNode = n;
					flag = true;
					break;
				}
			if(!flag)//Get last children
				currentNode = currentNode.getChildren().get(currentNode.getChildren().size()-1);

		}
		currentNode = currentNode.getFather();
		//The proper leaf is found. Now checks for fullness must be made.
		
		if(!currentNode.isFullOfChildren(childrenNumber))
			currentNode.addChild(new Node(root, num));
		else
		{
			
		}


	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	private void fillTreeWithDummyData()
	{
		root.getChildren().add(new Node(root, 6))
	}
}

