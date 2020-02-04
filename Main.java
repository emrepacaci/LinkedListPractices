
public class Main {

	public static void main(String[] args) {
		Linked test = new Linked();
		
		test.insertHead(3);
		test.insertHead(4);
		test.insertHead(5);
		test.insertHead(4);
		test.insertHead(1);
		test.displayList();
		System.out.println();
		test.removeNode(3);
		test.displayList();
		System.out.println();
		test.insertHead(3);
		test.displayList();
		System.out.println();
		test.removeNode(3);
		test.displayList();
		System.out.println();
		test.displayList();
		
		test.removeDublicate();
		System.out.println("---");
		test.displayList();
		
		
		//System.out.println(test.kthToLast(2));
		test.kthToLast(2);
		
		//test.removeDublicate();
		test.displayList();
		
	}
}
