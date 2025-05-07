package DSA.SinglyLinkedList;

public class SinglyLinkedList {
	
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
		
		SinglyLinkedList sl=new SinglyLinkedList();
		SinglyLinkedList.head=new ListNode(10); // This is the 1st Data or the Head of the SinglyLisnked List
		//Let's set all Data
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(1);
		ListNode fourth=new ListNode(11);
		ListNode fifth=new ListNode(15);
		
		//Now we have to set the pointer so 8 will be the pointer for 10 and 1 will be pointer for 8 respectively
		
		SinglyLinkedList.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth; // Since the last element pointer will be null as per the singly linked list rule
		display();
		
		
	}
	
	public static void display()
	{
		ListNode current=head;
		
		while(current!=null)
		{
			System.out.print(current.data + "-->");
			current=current.next;
		}
		System.out.println("null");
	}

}
