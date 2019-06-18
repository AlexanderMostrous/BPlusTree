import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static int maxElements;
	
	public static void main(String[] args) {

/*
		int childrenNum = 2;  

		if (args.length != 1) {
			System.out.println("Usage: <number of children>");
			System.exit(1);

		}
		maxElements = Integer.parseInt(args[0]);
		*/
		//BPlusTree bpt = new BPlusTree(childrenNum);
		ArrayList<Integer> a = new ArrayList<>();
		//a.add(null);
		a.add(1);
		//a.add(null);
		a.add(5);
		//a.add(null);
		a.add(-4);
		
		Collections.sort(a);
		for(Integer i: a)
			System.out.println(i);
		
		

	}
	
	//Recursive
	public static void printTree(Node rootNode)
	{
		
		Node n = rootNode;
		
		if(n.getChildren().size()==0)
			System.out.println(n);
		else
			for(Node c: n.getChildren())
				printTree(c);
		
	}

}