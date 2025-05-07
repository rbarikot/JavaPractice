package DSA.SinglyLinkedList;

public class InsertNodeatBeginingofSL {
	
	private static ListNode head;
	
	private static class ListNode
	{
		private int data;
		private ListNode next;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	public static void main(String[] args) {
		//InsertNodeatBeginingofSL.head=new ListNode(10);
		//Inserting Value;
		//ListNode newNode=new ListNode(10);
		//newNode.next=head;
		//head=newNode;
		
		insertfirst(10);
		insertfirst(8);
		insertfirst(9);
		//ListNode second=new ListNode(8);
		//ListNode third=new ListNode(9);
		//head.next=second;
		//second.next=third;
		display();
	}
	
	public static void insertfirst(int data)
	{
		ListNode newNode=new ListNode(data);
		newNode.next=head;
		head=newNode;
	}
	
	public static void display()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data +"-->");
			current=current.next;
		}
		System.out.println("null");
	}

}
