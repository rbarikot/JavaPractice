package DSA.SinglyLinkedList;

public class DisplayAllValueinSinglyLinkedList {
	
	private static ListsNode head;
	private static class ListsNode
	{
		private int data;
		private ListsNode next;
		public ListsNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	
	public static void main(String[] args) {
		DisplayAllValueinSinglyLinkedList.head=new ListsNode(10);
		ListsNode second=new ListsNode(8);
		ListsNode third=new ListsNode(9);
		ListsNode fourth=new ListsNode(7);
		ListsNode fifth=new ListsNode(6);
		DisplayAllValueinSinglyLinkedList.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		display();
		System.out.println("The Count of Singly LinkedList: "+LengthofSinglyLinkedList());
		
	}
	public static void display()
	{
		ListsNode current=head;
		while(current!=null)
		{
			System.out.print(current.data + "--->");
			current=current.next;
		}
		System.out.println("null");
	}

	public static int LengthofSinglyLinkedList()
	{
		ListsNode current=head;
		int count=0;
		while(current!=null)
		{
			current=current.next;
			count++;
		}
		return count;
	}
}
