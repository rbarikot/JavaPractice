package DSA.SinglyLinkedList;

public class InsertNodeatAnyGivenPositioninSL {
	
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
		// TODO Auto-generated method stub
		insertfirst(10);
		insertfirst(12);
		insertfirst(13);
		insertEnd(14);
		insertEnd(15);
		insertatAnyPosition(3,2);
		insertAt(8,9);
		display();

	}
	
	public static void insertfirst(int data)
	{
		ListNode newData= new ListNode(data);
		newData.next=head;
		head=newData;
		
	}
	public static void insertEnd(int data)
	{
		ListNode newData= new ListNode(data);
		if(head==null)
		{
			head=newData;
			return;
		}
		ListNode current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newData;
		
	}
	
	public static void insertatAnyPosition(int position,int data)
	{
		ListNode newData= new ListNode(data);
		
		if(position==1)
		{
			newData.next=head;
			head=newData;
		}
		else
		{
			ListNode previous=head;
			int count=1;
			while(count<position-1)
			{
				previous=previous.next;
				count++;
			}
			
			ListNode current=previous.next;
			previous.next=newData;
			newData.next=current;
		}
	}
	
	 public static  void insertAt(int index, int data) {
		 ListNode newNode = new ListNode(data);
	        if (index == 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }
	        ListNode current = head;
	        for (int i = 0; i < index - 1 && current != null; i++) {
	            current = current.next;
	        }
	        if (current == null) {
	            System.out.println("Index out of bounds");
	            return;
	        }
	        newNode.next = current.next;
	        current.next = newNode;
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
