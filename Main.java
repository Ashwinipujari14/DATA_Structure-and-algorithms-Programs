
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST bst = new BST();
		
		bst.insert(23);
		bst.insert(12);
		bst.insert(3);
		bst.insert(89);
		bst.insert(90);
		bst.insert(67);
		bst.insert(35);
		bst.insert(39);
		bst.insert(34);
		bst.insert(27);
		bst.insert(19);
		bst.insert(25);
		//bst.printT();
		//System.out.println(bst);
		
		System.out.println("..............PreOrder..........");

		bst.preOrder();
		System.out.println();
		System.out.println("..............Inorder..........");
		
		bst.InOrder();
		System.out.println();
		System.out.println("..............PostOrder..........");
		bst.postOrder();
		System.out.println();
		System.out.println(".........Largest and smallest.....");
		bst.print_largest();
		bst.print_secondLargest();
		
		bst.print_smallest();
		bst.print_secondsmallest();
	
		bst.delete(12);
		bst.InOrder();
		System.out.println();
		bst.delete(46);
		bst.InOrder();
		
		bst.print_H();
	}

}
