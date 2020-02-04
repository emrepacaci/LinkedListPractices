import java.util.HashSet;
import java.util.Set;

public class Linked {

	private Node head;
	
	
	//insert node to head
	public void insertHead(int data)
	{
		Node tmp = new Node(data);
		tmp.next = head;
		head = tmp;
	}
	
	//display list 
	public void displayList()
	{
		Node current = head;
		while(current != null)
		{
			current.displayNode();
			current = current.next;
		}
	}
	
	//remove node
	public boolean removeNode(int d)
	{
		Node tmp = head;
		if(tmp.data == d)
		{
			head = head.next;
			return true;
		}
		
		while(tmp.next != null)
		{
			if(tmp.next.data == d)
			{
				tmp.next = tmp.next.next;
				return true;
			}
			tmp = tmp.next;
		}
		return false;
	}
	
	//C. find the kth to last element of a singly linked list
	public int kthToLast(int k)
	{
		int size = 0;
		Node current = head;
		while(current != null)
		{
			size++;
			current = current.next;
		}
		
		current = head;
		Node tmp = null;
		int diff = size - k;
		while(diff>0)
		{
			tmp = current;
			current = current.next;
			diff--;
		}
		if(tmp == null)
		{
			head = current.next;
			return head.data;
		}
		System.out.println(k + "th element is :" + current.data);
		return current.data;
	}
	
	
	//B. 
	public void removeDublicate()
	{
		Node tmp = head;
		Set<Integer> mySet = new HashSet<>();
		if(tmp != null)
		{
			tmp = head;
		}
		
		while(tmp.next != null)
		{
			if(!mySet.contains(tmp.next.data))
			{
				mySet.add(tmp.data);
				tmp = tmp.next;
			}else
			{
			   tmp.next = tmp.next.next;
			}
		}
	}
}
