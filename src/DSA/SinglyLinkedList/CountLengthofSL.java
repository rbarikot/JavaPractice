package DSA.SinglyLinkedList;

public class CountLengthofSL {
	private static ListsNodee head;
	
	private static class ListsNodee
	{
		private int data;
		private ListsNodee next;
		public ListsNodee(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}

	public static void main(String[] args) {

		CountLengthofSL.head=new ListsNodee(10);
		ListsNodee second=new ListsNodee(11);
		ListsNodee third=new ListsNodee(12);
		ListsNodee fourth=new ListsNodee(9);
		ListsNodee fifth=new ListsNodee(7);
		CountLengthofSL.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		System.out.println("The Length of Singly Linked List: "+counLength());
	}
	public static int counLength()
	{
		ListsNodee current=head;
		int count=0;
		while(current!=null)
		{
			current=current.next;
			count++;
		}
		return count;
	}

}
