package DSA.SinglyLinkedList;

public class InsertNodeatEndofSL {
	
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
		//Insert First
		//insertfirst(10);
		//insertfirst(11);
		//insertfirst(9);
		//Insert End
		insertend(10);
		insertend(11);
		insertend(12);
		display();

	}
	public static void insertfirst(int data)
	{
		ListNode newData= new ListNode(data);
		newData.next=head;
		head=newData;
	}
	
	public static void insertend(int data)
	{
		ListNode newData= new ListNode(data);
		if(head==null)
		{
			head =newData;
			return;
		}
		ListNode current= head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newData;
	}
	
	public static void display()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	

}
